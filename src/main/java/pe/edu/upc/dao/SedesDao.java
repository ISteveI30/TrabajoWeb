package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Sede;

public interface SedesDao {

	
	public void insert(Sede s);

	public List<Sede> list();

	public void delete(int idSede);
}
