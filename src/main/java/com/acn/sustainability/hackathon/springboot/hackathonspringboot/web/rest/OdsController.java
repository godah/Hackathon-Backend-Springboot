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
import com.acn.sustainability.hackathon.springboot.hackathonspringboot.domain.Ods;
import com.acn.sustainability.hackathon.springboot.hackathonspringboot.service.OdsService;
import com.acn.sustainability.hackathon.springboot.hackathonspringboot.util.*;
import io.swagger.annotations.*;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class OdsController {

    private final Logger log = LoggerFactory.getLogger(OdsController.class);

    private static final String ENTITY_NAME = "ods";

    @Value("Hackathon GreenSoftware")
    private String applicationName;

    private final OdsService odsService;

    public OdsController(OdsService companyService) {
        this.odsService = companyService;
    }

    @ApiOperation(value = "Retorna uma lista de ods paginada")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Retorna a lista de ods"),
		@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
    @RequestMapping(value = "/ods", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getods(PageableDto pageableDto) {
        log.debug("REST request lista de ods : {}");
		Page<Ods> page =  this.odsService.findAll(PageRequest.of(pageableDto.getPage(), pageableDto.getSize()));
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, ServletUriComponentsBuilder.fromCurrentRequest().toUriString());
        return ResponseEntity.ok().headers(headers).body(page.getContent());
	}


    @ApiOperation(value = "Retorna uma ods")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Retorna uma ods"),
		@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
    @RequestMapping(value = "/ods/{id}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity getCompany(@RequestParam Long id) {		
        log.debug("REST request uma ods : {}", id);
        Optional<Ods> ods = this.odsService.findOne(id);
        return ResponseUtil.wrapOrNotFound(ods);
	}

    @ApiOperation(value = "Remove uma ods")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Remove uma ods"),
		@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})

    @RequestMapping(value = "/ods/{id}", method = RequestMethod.DELETE, produces="application/json")
	public ResponseEntity deleteCompany(@RequestParam Long id) {		
        log.debug("REST request remove uma ods : {}", id);
        this.odsService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString()))
            .build();
	}

    // TODO  Métodos POST e PUT
}