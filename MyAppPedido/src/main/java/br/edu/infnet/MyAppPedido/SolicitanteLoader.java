package br.edu.infnet.MyAppPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.MyAppPedido.model.domain.Solicitante;
import br.edu.infnet.MyAppPedido.model.domain.Usuario;
import br.edu.infnet.MyAppPedido.model.service.SolicitanteService;

@Component
@Order(2)
public class SolicitanteLoader implements ApplicationRunner {
	
	@Autowired
	private SolicitanteService solicitanteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		
		Solicitante solicitante = new Solicitante();
		solicitante.setEmail("lenon@lenon.com");
		solicitante.setNome("Lenon");
		solicitante.setCpf("12345678901");
		solicitante.setUsuario(usuario);
		
		System.out.println(solicitante);
		
		solicitanteService.incluir(solicitante);
		
		
	}
	
	
}
