package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Docente;
import pe.edu.upc.entidades.FavoritoDocente;
import pe.edu.upc.service.FavDocenteService;
import pe.edu.upc.service.IDocenteService;


@Named
@RequestScoped
public class FaDocenteController {

	@Inject
	private FavDocenteService  fService;
	private FavoritoDocente favorito;
	List<FavoritoDocente> listaFavoritos;

	@Inject
	private IDocenteService  dService;
	private Docente docente;
	List<Docente> listaDocentes;
	
	
	
	// constructor
	@PostConstruct
	public void init() {
		this.favorito = new FavoritoDocente();
		this.docente = new Docente(); 
		this.listaFavoritos = new ArrayList<FavoritoDocente>();
		this.listaDocentes = new ArrayList<Docente>();
		this.list();
		this.listDocentes();
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
			System.out.println("Error al eliminar en el controller ");
		}
	}

	
	public void agregar(Docente idDocente) {
		try {
			
			this.docente = fService.agregar(idDocente.getIdDocente());
			favorito.setDocente(docente);
			fService.insert(favorito);
		} catch (Exception e) {
			System.out.println("Error al agregar un favorito en el controller de docente");
		}
	}
	public void listDocentes() {
		try {
			listaDocentes = dService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller deocente estudiante");
		}
	}
	
	public void findByNameDocente() {
		try {
			listaDocentes = dService.findByNameDocente(this.getDocente());
		} catch (Exception e) {
			
			System.out.println("Error al buscar docente en el controlador");
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

	public List<Docente> getListaDocentes() {
		return listaDocentes;
	}

	public void setListaDocentes(List<Docente> listaDocentes) {
		this.listaDocentes = listaDocentes;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
}
