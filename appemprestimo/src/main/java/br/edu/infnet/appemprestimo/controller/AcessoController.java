package br.edu.infnet.appemprestimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessoController {
	
	@GetMapping(value = "/")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value="/login")
	public String acessar(Model model, @RequestParam String email, @RequestParam String senha) {
		
		System.out.println(email+" - "+senha);
		
		if(email.equalsIgnoreCase(senha)) {
			return "index";
		}
		else {
			model.addAttribute("mensagem", "Impossível realizar a autenticação: "+email);
			return "login";
		}
		
	}

}
