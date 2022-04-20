package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Duracion;

public interface DuracionDao {

	public void insert(Duracion d);

	public List<Duracion> list();

	public void delete(int idDuracion);
	
}
