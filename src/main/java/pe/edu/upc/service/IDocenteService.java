package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Docente;

public interface IDocenteService {
	
	public void insert(Docente d);

	public List<Docente> list();

	public void delete(int idDocente);
	
	public void update(Docente d);
	
	public List<Docente> findByNameDocente(Docente d);
	
}
