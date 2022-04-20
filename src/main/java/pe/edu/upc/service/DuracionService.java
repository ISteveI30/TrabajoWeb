package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Duracion;

public interface DuracionService {


	public void insert(Duracion c);

	public List<Duracion> list();

	public void delete(int idDuracion);
	
}
