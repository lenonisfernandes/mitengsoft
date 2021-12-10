package br.edu.infnet.MyAppPedido.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.MyAppPedido.model.domain.Solicitante;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer>{
	
	@Query("from Solicitante s where s.usuario.id =:userid")
	public List<Solicitante> findAll(Integer userid);
	
}
