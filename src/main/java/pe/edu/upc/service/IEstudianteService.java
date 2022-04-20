package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Estudiante;

public interface IEstudianteService {
	public void insert(Estudiante p);

	public List<Estudiante> list();

	public void delete(int idEstudiante);
}
