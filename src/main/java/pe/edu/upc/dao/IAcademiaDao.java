package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Academia;

public interface IAcademiaDao {

	public void insert(Academia d);

	public List<Academia> list();
	
	public void delete(int Academia);
	
	public List <Academia> findByNameAcademia(Academia academia);
}
