package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Docente;
import pe.edu.upc.entidades.FavoritoDocente;

public interface FavDocenteService {
	public void insert(FavoritoDocente f);

	public List<FavoritoDocente> list();

	public void delete(int idFavDocente);
	
	public Docente agregar(int idDocente);
}
