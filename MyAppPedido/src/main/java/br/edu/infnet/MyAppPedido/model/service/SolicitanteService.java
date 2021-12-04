package br.edu.infnet.MyAppPedido.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.MyAppPedido.model.domain.Solicitante;

@Service
public class SolicitanteService {
	
	private Map<Integer, Solicitante> mapaSolicitante = new HashMap<Integer, Solicitante>();
	private static Integer id = 1;
	
	public List<Solicitante> obterLista() {
		return new ArrayList<Solicitante>(mapaSolicitante.values());
	}
	
	public void incluir(Solicitante solicitante) {
		solicitante.setId(id++);
		mapaSolicitante.put(solicitante.getId(), solicitante);
		
	}
	
	public void excluir(Integer id) {
		mapaSolicitante.remove(id);
	}
	
	public Solicitante obterPorId(Integer id) {
		return mapaSolicitante.get(id);
	}
}
