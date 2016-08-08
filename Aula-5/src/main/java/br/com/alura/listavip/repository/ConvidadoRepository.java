package br.com.alura.listavip.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.listavip.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
	
	
	List<Convidado> findByNome(String nome);

}
