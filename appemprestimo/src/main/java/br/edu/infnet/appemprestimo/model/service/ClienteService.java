package br.edu.infnet.appemprestimo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appemprestimo.model.domain.Cliente;
import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> obterLista(Usuario usuario) {
		
		return (List<Cliente>)clienteRepository.findAll(usuario.getId());
	}
	
	public List<Cliente> obterLista() {
		
		return (List<Cliente>)clienteRepository.findAll();
	}
	
	public void incluir(Cliente cliente) {
		
		clienteRepository.save(cliente);
	}

	public Cliente obterPorId(Integer id) {
		return clienteRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
		
	}


}
