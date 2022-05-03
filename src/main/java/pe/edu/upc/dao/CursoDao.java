package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Curso;

public interface CursoDao {

	public void insert(Curso c);

	public List<Curso> list();

	public void delete(int idCurso);
	
	public void update(Curso c);
	
	public List <Curso> findByName(Curso c);
	
	//public Curso findById(Curso c);
	
}
