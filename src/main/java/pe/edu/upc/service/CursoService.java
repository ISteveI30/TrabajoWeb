package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Curso;

public interface CursoService {

	public void insert(Curso c);

	public List<Curso> list();

	public void delete(int idCurso);
	
}
