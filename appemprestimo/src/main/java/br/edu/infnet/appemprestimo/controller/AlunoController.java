package br.edu.infnet.appemprestimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.appemprestimo.model.domain.Aluno;

@Controller
public class AlunoController {
	
	//"/aluno" GET
	//@RequestMapping(value = "/aluno", method = RequestMethod.GET)
	@GetMapping(value = "/aluno")
	public String telaCadastro() {
		
		return "aluno/cadastro";
	}
	
	//<form action="aluno/incluir" method="post">
	@PostMapping(value =  "/aluno/incluir")
	public String incluir(Aluno aluno) {
		aluno.impressao();
		return "confirmacao";
	}
}
