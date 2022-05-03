package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

<<<<<<< HEAD
import pe.edu.upc.entidades.Academia;
import pe.edu.upc.entidades.FaAcademia;
import pe.edu.upc.service.AcademiaService;
=======
import pe.edu.upc.entidades.FaAcademia;
import pe.edu.upc.entidades.FavoritoDocente;
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
import pe.edu.upc.service.FaAcademiaService;

@Named
@RequestScoped
public class FaAcademiaController {

	@Inject
	private FaAcademiaService  fService;
	private FaAcademia favorito;
	List<FaAcademia> listaFavoritos;
<<<<<<< HEAD
	
	@Inject
	private AcademiaService  aService;
	private Academia academia;
	List<Academia> listaAcademias;
	
	
=======

>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	// constructor
	@PostConstruct
	public void init() {
		this.listaFavoritos = new ArrayList<FaAcademia>();
<<<<<<< HEAD
		this.listaAcademias = new ArrayList<Academia>();
		this.favorito = new FaAcademia();
		this.academia = new Academia();
		this.list();
		this.listAcademias();
=======
		this.favorito = new FaAcademia();
		this.list();
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
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

<<<<<<< HEAD
	public void delete(FaAcademia favorito) {
=======
	public void delete(FavoritoDocente favorito) {
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
		try {
			fService.delete(favorito.getId());
			this.list();
		} catch (Exception e) {
<<<<<<< HEAD
			System.out.println("Error al eliminar en el controller ");
		}
	}
	
	public void agregar(Academia idAcademia) {
		try {
			
			this.academia = fService.agregar(idAcademia.getIdAcademia());
			favorito.setAcademia(academia);
			fService.insert(favorito);
		} catch (Exception e) {
			System.out.println("Error al agregar un favorito en el controller ");
		}
	}
	public void listAcademias() {
		try {
			listaAcademias = aService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller academia");
=======
			System.out.println("Error al eliminar en elcontroller ");
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
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

<<<<<<< HEAD
	public List<Academia> getListaAcademias() {
		return listaAcademias;
	}

	public void setListaAcademias(List<Academia> listaAcademias) {
		this.listaAcademias = listaAcademias;
	}

=======
	
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
}
