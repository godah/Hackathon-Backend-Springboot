package com.acn.sustainability.hackathon.springboot.hackathonspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.servlet.Filter;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class HackathonSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackathonSpringbootApplication.class, args);
		System.out.println("teste");
	}

	@Bean
	public Filter getCharacterEncodingFilter() {

    CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();

    encodingFilter.setEncoding("UTF-8");
    encodingFilter.setForceEncoding(true);

    return encodingFilter;

}
}
