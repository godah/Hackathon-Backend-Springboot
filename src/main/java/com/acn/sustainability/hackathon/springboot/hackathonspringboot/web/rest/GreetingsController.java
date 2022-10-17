package com.acn.sustainability.hackathon.springboot.hackathonspringboot.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.*;


@RestController
@RequestMapping("/api")
public class GreetingsController {
 
	@ApiOperation(value = "Retorna uma mensagem de saudação")
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "Retorna a mensagem de saudação"),
		@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
    @RequestMapping(value = "/greetings", method = RequestMethod.GET, produces="application/text")
	public String index() {
		return "Hackathon GreenSoftware!";
	}
}

