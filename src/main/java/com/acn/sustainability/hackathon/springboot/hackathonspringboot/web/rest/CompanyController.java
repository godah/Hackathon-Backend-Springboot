package com.acn.sustainability.hackathon.springboot.hackathonspringboot.web.rest;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.acn.sustainability.hackathon.dto.PageableDto;
import com.acn.sustainability.hackathon.springboot.hackathonspringboot.domain.Company;
import com.acn.sustainability.hackathon.springboot.hackathonspringboot.service.CompanyService;
import com.acn.sustainability.hackathon.springboot.hackathonspringboot.util.*;
import io.swagger.annotations.*;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class CompanyController {

    private final Logger log = LoggerFactory.getLogger(CompanyController.class);

    private static final String ENTITY_NAME = "company";

    @Value("Hackathon GreenSoftware")
    private String applicationName;

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @ApiOperation(value = "Retorna uma lista de empresas paginada")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Retorna a lista de empresas"),
		@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
    @RequestMapping(value = "/companies", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getCompanies(PageableDto pageableDto) {
        log.debug("REST request lista de empresas : {}");
		Page<Company> page =  this.companyService.findAll(PageRequest.of(pageableDto.getPage(), pageableDto.getSize()));
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, ServletUriComponentsBuilder.fromCurrentRequest().toUriString());
        return ResponseEntity.ok().headers(headers).body(page.getContent());
	}


    @ApiOperation(value = "Retorna uma empresa")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Retorna uma empresa"),
		@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
    @RequestMapping(value = "/companies/{id}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getCompany(@RequestParam Long id) {		
        log.debug("REST request uma empresa : {}", id);
        Optional<Company> company = this.companyService.findOne(id);
        return ResponseUtil.wrapOrNotFound(company);
	}

    @ApiOperation(value = "Remove uma empresa")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Remove uma empresa"),
		@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})

    @RequestMapping(value = "/companies/{id}", method = RequestMethod.DELETE, produces="application/json")
	public ResponseEntity deleteCompany(@RequestParam Long id) {		
        log.debug("REST request remove uma empresa : {}", id);
        this.companyService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString()))
            .build();
	}

    // TODO  Métodos POST e PUT
}