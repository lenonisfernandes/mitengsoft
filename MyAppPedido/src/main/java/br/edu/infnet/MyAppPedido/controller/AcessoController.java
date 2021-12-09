package br.edu.infnet.MyAppPedido.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.MyAppPedido.model.domain.Usuario;
import br.edu.infnet.MyAppPedido.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class AcessoController extends HttpServlet {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "/")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String acessar(Model model, @RequestParam String email, @RequestParam String senha) {

		Usuario usuario = usuarioService.validar(email, senha); 
		model.addAttribute("user", usuario);
		if(usuario!=null) {
			return "index";
		} else {
			model.addAttribute("mensagem", "Impossível realizar a autenticação: "+email+"!");
			
			return "login";
		}
	}
}
