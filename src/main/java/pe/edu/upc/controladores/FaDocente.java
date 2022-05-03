package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.FavoritoDocente;
import pe.edu.upc.service.FavDocenteService;


@Named
@RequestScoped
public class FaDocente {

	@Inject
	private FavDocenteService  fService;
	private FavoritoDocente favorito;
	List<FavoritoDocente> listaFavoritos;

	// constructor
	@PostConstruct
	public void init() {
		this.listaFavoritos = new ArrayList<FavoritoDocente>();
		this.favorito = new FavoritoDocente();
		this.list();
	}

	// métodos

	public String newCurso() {

		this.setFavorito(new FavoritoDocente());
		return null;
	}

	public void insert() {
		try {
			fService.insert(favorito);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller ");
		}
	}

	public void list() {
		try {
			listaFavoritos = fService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller ");
		}
	}

	public void delete(FavoritoDocente favorito) {
		try {
			fService.delete(favorito.getId());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller ");
		}
	}

	public FavDocenteService getfService() {
		return fService;
	}

	public void setfService(FavDocenteService fService) {
		this.fService = fService;
	}

	public FavoritoDocente getFavorito() {
		return favorito;
	}

	public void setFavorito(FavoritoDocente favorito) {
		this.favorito = favorito;
	}

	public List<FavoritoDocente> getListaFavoritos() {
		return listaFavoritos;
	}

	public void setListaFavoritos(List<FavoritoDocente> listaFavoritos) {
		this.listaFavoritos = listaFavoritos;
	}

}
