package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Carrera;

public interface CarreraDao {

	public void insert(Carrera d);

	public List<Carrera> list();

	public void delete(int idCarrera);
	
	public List <Carrera> findByNameCarrera(Carrera carrera);

	public void update(Carrera carrera);
}
