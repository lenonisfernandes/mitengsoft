package br.edu.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.infnet.appemprestimo.model.domain.Cliente;
import br.edu.infnet.appemprestimo.model.repository.ClienteRepository;



@Service
public class ClienteService {
	
	ClienteRepository clienteRepository;
	
	public List<Cliente> obterLista() {
		
		return (List<Cliente>)clienteRepository.findAll();
	}
	
	public void incluir(Cliente cliente) {
		
		System.out.println(cliente);
		clienteRepository.save(cliente);
	}


}
