package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.FaCurso;

public interface FaCursoService {

	public void insert(FaCurso f);

	public List<FaCurso> list();

	public void delete(int idFavorito);
}
