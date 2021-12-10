package br.edu.infnet.MyAppPedido.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.MyAppPedido.model.domain.Solicitante;
import br.edu.infnet.MyAppPedido.model.domain.Usuario;
import br.edu.infnet.MyAppPedido.model.repository.SolicitanteRepository;

@Service
public class SolicitanteService {
	
	@Autowired
	private SolicitanteRepository solicitanteRepository;
	
	public List<Solicitante> obterLista() {
		
		return (List<Solicitante>)solicitanteRepository.findAll();
	}
	
	public List<Solicitante> obterLista(Usuario usuario) {
		
		return (List<Solicitante>)solicitanteRepository.findAll(usuario.getId());
	}
	
	public void incluir(Solicitante solicitante) {
		solicitanteRepository.save(solicitante);
		
	}
	
	public void excluir(Integer id) {
		solicitanteRepository.deleteById(id);
	}
	
	public Solicitante obterPorId(Integer id) {
		return solicitanteRepository.findById(id).orElse(null);
	}
}
