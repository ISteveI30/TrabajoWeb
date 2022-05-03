package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.FavoritoDocente;

public interface FavDocenteDao {


	public void insert(FavoritoDocente f);

	public List<FavoritoDocente> list();

	public void delete(int idFavDocente);
}
