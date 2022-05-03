package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Carrera;

public interface CarreraService {

	public void insert(Carrera c);

	public List<Carrera> list();

	public void delete(int idCarrera);
	
	public List <Carrera> findByNameCarrera(Carrera carrera);
	
	public void update(Carrera carrera);
}
