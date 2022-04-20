package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Curso;

public interface CursoDao {

	public void insert(Curso p);

	public List<Curso> list();

	public void delete(int idCurso);
	
}
