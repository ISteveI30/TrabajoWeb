package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.FaAcademia;
import pe.edu.upc.entidades.FavoritoDocente;
import pe.edu.upc.service.FaAcademiaService;

@Named
@RequestScoped
public class FaAcademiaController {

	@Inject
	private FaAcademiaService  fService;
	private FaAcademia favorito;
	List<FaAcademia> listaFavoritos;

	// constructor
	@PostConstruct
	public void init() {
		this.listaFavoritos = new ArrayList<FaAcademia>();
		this.favorito = new FaAcademia();
		this.list();
	}

	// métodos

	public String newCurso() {
		this.setFavorito(new FaAcademia());
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

	public FaAcademiaService getfService() {
		return fService;
	}

	public void setfService(FaAcademiaService fService) {
		this.fService = fService;
	}

	public FaAcademia getFavorito() {
		return favorito;
	}

	public void setFavorito(FaAcademia favorito) {
		this.favorito = favorito;
	}

	public List<FaAcademia> getListaFavoritos() {
		return listaFavoritos;
	}

	public void setListaFavoritos(List<FaAcademia> listaFavoritos) {
		this.listaFavoritos = listaFavoritos;
	}

	
}
