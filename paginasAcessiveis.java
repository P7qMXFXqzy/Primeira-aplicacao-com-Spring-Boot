package com.example.treinoSpringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paginasAcessiveis {

	@GetMapping("/page1")
	public String paginaUm() {
		return "Você está na página 1!";
	}
	@GetMapping("/page2")
	public String paginaDois() {
		return "Você está na página 2!";
	}
	@GetMapping("/")
	public String paginaPadrao() {
		return "Você está na página inicial!";
	}

}