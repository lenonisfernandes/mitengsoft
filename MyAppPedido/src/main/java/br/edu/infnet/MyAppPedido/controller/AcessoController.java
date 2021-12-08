package br.edu.infnet.MyAppPedido.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessoController extends HttpServlet {

	@GetMapping(value = "/")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String acessar(Model model, @RequestParam String email, @RequestParam String senha) {

		 
		
		if(email.equalsIgnoreCase(senha)) {
			return "index";
		} else {
			model.addAttribute("msg", "Impossível realizar a autenticação: "+email+"!");
			
			return "login";
		}
	}
}
