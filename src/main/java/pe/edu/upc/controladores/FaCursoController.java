package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

<<<<<<< HEAD
import pe.edu.upc.entidades.Curso;
import pe.edu.upc.entidades.FaCurso;
import pe.edu.upc.service.CursoService;
=======
import pe.edu.upc.entidades.FaCurso;
import pe.edu.upc.entidades.FavoritoDocente;
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
import pe.edu.upc.service.FaCursoService;

@Named
@RequestScoped
public class FaCursoController {


	@Inject
	private FaCursoService  fService;
	private FaCurso favorito;
	List<FaCurso> listaFavoritos;

<<<<<<< HEAD
	@Inject
	private CursoService  cService;
	private Curso curso;
	List<Curso> listaCursos;
	
	// constructor
	@PostConstruct
	public void init() {
		this.favorito = new FaCurso();
		this.curso = new Curso();
		this.listaFavoritos = new ArrayList<FaCurso>();
		this.listaCursos = new ArrayList<Curso>();
		this.list();
		this.listCursos();
=======
	// constructor
	@PostConstruct
	public void init() {
		this.listaFavoritos = new ArrayList<FaCurso>();
		this.favorito = new FaCurso();
		this.list();
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	}

	// métodos

	public String newCurso() {
		this.setFavorito(new FaCurso());
		return null;
	}

<<<<<<< HEAD
	
	
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
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
	public void delete(FaCurso favorito) {
		try {
			fService.delete(favorito.getId());
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller ");
		}
	}
	
	
	public void agregar(Curso idCurso) {
		try {
			
			this.curso = fService.agregar(idCurso.getIdCurso());
			favorito.setCurso(curso);
			fService.insert(favorito);
		} catch (Exception e) {
			System.out.println("Error al agregar un favorito en el controller ");
		}
	}
	public void listCursos() {
		try {
			listaCursos = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller curso");
		}
	}
	
	public void findByName() {

		try {
			listaCursos = cService.findByName(this.getCurso());
		} catch (Exception e) {
			System.out.println("Error al buscar en el controller curso");
		}
	}
	
	public void findByNameFavCurso() {

		try {
			listaFavoritos = fService.findByNameFavCurso(this.getFavorito());
		} catch (Exception e) {
			System.out.println("Error al buscar en el controller curso");
=======
	public void delete(FavoritoDocente favorito) {
		try {
			fService.delete(favorito.getId());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller ");
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
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
<<<<<<< HEAD

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	
}
