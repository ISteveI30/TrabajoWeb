package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Academia;

public interface AcademiaService {

	public void insert(Academia a);

	public List<Academia> list();

	public void delete(int idAcademia);
	
	public List <Academia> findByNameAcademia(Academia academia);
}
