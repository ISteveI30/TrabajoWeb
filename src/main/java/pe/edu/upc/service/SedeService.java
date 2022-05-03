package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Sede;

public interface SedeService {

	public void insert(Sede s);

	public List<Sede> list();

	public void delete(int idSede);
}
