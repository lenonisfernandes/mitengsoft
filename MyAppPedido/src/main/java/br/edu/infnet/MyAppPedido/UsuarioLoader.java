package br.edu.infnet.MyAppPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.MyAppPedido.model.domain.Usuario;
import br.edu.infnet.MyAppPedido.model.repository.UsuarioRepository;

@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioRepository usuarioRepository; 
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setEmail("lenon@lenon.com");
		usuario.setSenha("lenon@lenon.com");
		usuario.setNome("Lenon");
		
		usuarioRepository.save(usuario);
		
	}
	
}
