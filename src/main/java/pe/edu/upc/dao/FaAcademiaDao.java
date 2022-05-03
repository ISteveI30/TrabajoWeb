package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Academia;
import pe.edu.upc.entidades.FaAcademia;

public interface FaAcademiaDao {

	public void insert(FaAcademia f);

	public List<FaAcademia> list();

	public void delete(int idFavorito);
	
	public Academia agregar(int idAcademia);
	
}
