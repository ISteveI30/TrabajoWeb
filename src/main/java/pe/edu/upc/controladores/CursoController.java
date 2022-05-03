package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Carrera;
import pe.edu.upc.entidades.Curso;
import pe.edu.upc.entidades.Duracion;

import pe.edu.upc.service.CarreraService;
import pe.edu.upc.service.CursoService;
import pe.edu.upc.service.DuracionService;

@Named
@RequestScoped
public class CursoController {

	@Inject
	private CursoService  cService;
	private Curso curso;
	List<Curso> listaCursos;

	
	@Inject
	private CarreraService carrService;
	List<Carrera> listaCarreras;

	@Inject
	private DuracionService durService;
	List <Duracion> listaDuraciones;
	
	
	// constructor
	@PostConstruct
	public void init() {
		this.curso = new Curso();
		this.listaCursos = new ArrayList<Curso>();
		this.listaCarreras = new ArrayList<Carrera>();
		this.listaDuraciones = new ArrayList<Duracion>();
		this.list();
		this.listCarrera();
		this.listDuracion();
	}

	// métodos

	public String newCurso() {

		//this.setCurso(new Curso());
		return "curso.xhtml";
	}

	public void insert() {
		try {
			cService.insert(curso);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller curso");
		}
	}

	public void listCarrera() {
		try {
			listaCarreras = carrService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller curso");
		}
	}

	public void listDuracion() {
		try {
			listaDuraciones = durService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller curso");
		}
	}
	
	public void list() {
		try {
			listaCursos = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller curso");
		}
	}

	public void delete(Curso curso) {
		try {
			cService.delete(curso.getIdCurso());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller curso");
		}
	}

	public void findByName() {

		try {
			listaCursos = cService.findByName(this.getCurso());
		} catch (Exception e) {
			System.out.println("Error al buscar en el controller curso");
		}
	}
	
	public String updateCurso(Curso c) {
		this.setCurso(c);
		return "cursoUpdate.xhtml";
	}

	public void update() {
		try {
			cService.update(this.curso);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	public List<Carrera> getListaCarreras() {
		return listaCarreras;
	}

	public void setListaCarreras(List<Carrera> listaCarreras) {
		this.listaCarreras = listaCarreras;
	}

	public List<Duracion> getListaDuraciones() {
		return listaDuraciones;
	}

	public void setListaDuraciones(List<Duracion> listaDuraciones) {
		this.listaDuraciones = listaDuraciones;
	}
	
	
}
