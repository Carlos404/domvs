package br.com.domvs.aluno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.domvs.aluno.entity.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
	
		Aluno findById(long id);
	
	@Query(value = "SELECT * FROM aluno ORDER BY id" , nativeQuery = true)
	List<Aluno> buscaAlunoOrdenado();
	
}