package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.FaCurso;
import pe.edu.upc.entidades.FavoritoDocente;
import pe.edu.upc.service.FaCursoService;

@Named
@RequestScoped
public class FaCursoController {


	@Inject
	private FaCursoService  fService;
	private FaCurso favorito;
	List<FaCurso> listaFavoritos;

	// constructor
	@PostConstruct
	public void init() {
		this.listaFavoritos = new ArrayList<FaCurso>();
		this.favorito = new FaCurso();
		this.list();
	}

	// métodos

	public String newCurso() {
		this.setFavorito(new FaCurso());
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

	public FaCursoService getfService() {
		return fService;
	}

	public void setfService(FaCursoService fService) {
		this.fService = fService;
	}

	public FaCurso getFavorito() {
		return favorito;
	}

	public void setFavorito(FaCurso favorito) {
		this.favorito = favorito;
	}

	public List<FaCurso> getListaFavoritos() {
		return listaFavoritos;
	}

	public void setListaFavoritos(List<FaCurso> listaFavoritos) {
		this.listaFavoritos = listaFavoritos;
	}
	
}
