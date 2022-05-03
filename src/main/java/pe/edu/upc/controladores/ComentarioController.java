package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Comentario;
import pe.edu.upc.service.ComentarioService;

@Named
@RequestScoped
public class ComentarioController {
	@Inject
	private ComentarioService  cService;
	private Comentario comentario;
	List<Comentario> listaComentarios;

	// constructor
	@PostConstruct
	public void init() {
		this.listaComentarios = new ArrayList<Comentario>();
		this.comentario = new Comentario();
		this.list();
	}

	// métodos

	public String newComentario() {

		this.setComentario(new Comentario());
		return "carrera.xhtml";
	}

	public void insert() {
		try {
			cService.insert(comentario);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller ");
		}
	}

	public void list() {
		try {
			listaComentarios = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller ");
		}
	}

	public void delete(Comentario comentario) {
		try {
			cService.delete(comentario.getId());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller carrera");
		}
	}

	public ComentarioService getcService() {
		return cService;
	}

	public void setcService(ComentarioService cService) {
		this.cService = cService;
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public List<Comentario> getListaComentarios() {
		return listaComentarios;
	}

	public void setListaComentarios(List<Comentario> listaComentarios) {
		this.listaComentarios = listaComentarios;
	}
	
}
