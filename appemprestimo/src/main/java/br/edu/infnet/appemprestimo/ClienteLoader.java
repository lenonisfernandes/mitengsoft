package br.edu.infnet.appemprestimo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Cliente;
import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.service.ClienteService;


@Component
@Order(2)
public class ClienteLoader implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Cliente cliente = new Cliente("Ignes", "ignes@email.com", "12345678901");
		cliente.setUsuario(new Usuario(1));
		
		clienteService.incluir(cliente);
		
		
	}
	
}
