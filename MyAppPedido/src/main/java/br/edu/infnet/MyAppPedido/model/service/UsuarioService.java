package br.edu.infnet.MyAppPedido.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.MyAppPedido.model.domain.Usuario;
import br.edu.infnet.MyAppPedido.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario validar(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
	
	

}
