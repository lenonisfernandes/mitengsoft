package br.edu.infnet.appemprestimo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.service.ClienteService;


public class ClienteController {
	
	ClienteService clienteService;
	
	@GetMapping(value="/clientes")
	private String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("lista", clienteService.obterLista());

		return "cliente/lista";
	}

}
