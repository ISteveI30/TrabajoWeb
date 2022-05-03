package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Curso;
import pe.edu.upc.entidades.FaCurso;

public interface FaCursoDao {

	public void insert(FaCurso f);

	public List<FaCurso> list();

	public void delete(int idFavorito);
	
	public Curso agregar(int idCurso);

	public List <FaCurso> findByNameFavCurso(FaCurso faCurso);
}
