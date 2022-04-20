package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Curso;
import pe.edu.upc.service.CursoService;

@Named
@RequestScoped
public class CursoController {

	@Inject
	private CursoService  cService;
	private Curso curso;
	List<Curso> listaCursos;

	// constructor
	@PostConstruct
	public void init() {
		this.listaCursos = new ArrayList<Curso>();
		this.curso = new Curso();
		this.list();
	}

	// métodos

	public String newCurso() {

		this.setCurso(new Curso());
		return "curso.xhtml";
	}

	public void insert() {
		try {
			cService.insert(curso);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller curso");
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
	
}
