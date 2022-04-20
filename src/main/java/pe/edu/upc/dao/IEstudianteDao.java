package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Estudiante;

public interface IEstudianteDao {
	public void insert(Estudiante e);

	public List<Estudiante> list();

	public void delete(int idEstudiante);

}
