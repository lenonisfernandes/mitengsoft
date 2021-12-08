package br.edu.infnet.MyAppPedido.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.MyAppPedido.model.domain.Solicitante;
import br.edu.infnet.MyAppPedido.model.service.SolicitanteService;

@Controller
public class SolicitanteController {
	
	@Autowired
	private SolicitanteService solicitanteService;
	
	@GetMapping(value = "/solicitante")
	public String telaCadastro() {
		return "solicitante/cadastro";
	}
	
	@GetMapping(value = "/solicitantes")
	public String telaLista(Model model) {
		
		List<Solicitante> solicitantes = new ArrayList<Solicitante>(
				Arrays.asList(
						new Solicitante("Lenon", "lenon@lenon.com", "123456789012"),
						new Solicitante("Ignes", "lenon@lenon.com", "123456789012"),
						new Solicitante("Bruna", "lenon@lenon.com", "123456789012")
						)
				);
		
		model.addAttribute("lista", solicitantes);
		
		return "solicitante/lista";
	}
	
	@PostMapping
	public String incluir(Model model, Solicitante solicitante) {
		
		//solicitanteService.incluir(solicitante);
		
		//model.addAttribute("mensagem", "O solicitante "+solicitante.getNome()+" foi cadastrado com sucesso!");
		
		model.addAttribute("nome", solicitante.getNome());
		
		return telaLista(model);
	}
	
//	@GetMapping(value = "/solicitante/{id}/excluir")
//	public String excluir(Model model, @PathVariable Integer id) {
//		
//		Solicitante solicitante = solicitanteService.obterPorId(id);
//		solicitanteService.excluir(id);
//		
//		model.addAttribute("mensagem", "O solicitante "+solicitante.getNome()+" foi removido com sucesso!");
//		
//		return telaLista(model);
//	}
	

}
