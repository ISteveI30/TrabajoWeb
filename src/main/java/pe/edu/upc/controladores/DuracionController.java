package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Duracion;
import pe.edu.upc.service.DuracionService;

@Named
@RequestScoped
public class DuracionController {

	@Inject
	private DuracionService  dService;
	private Duracion duracion;
	List<Duracion> listaDuracion;

	// constructor
	@PostConstruct
	public void init() {
		this.listaDuracion = new ArrayList<Duracion>();
		this.duracion = new Duracion();
		this.list();
	}

	// métodos

	public String newCurso() {

		this.setDuracion(new Duracion());
		return "curso.xhtml";
	}

	public void insert() {
		try {
			dService.insert(duracion);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller duracion");
		}
	}

	public void list() {
		try {
			listaDuracion = dService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller duracion");
		}
	}

	public void delete(Duracion duracion) {
		try {
			dService.delete(duracion.getIdDuracion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller curso");
		}
	}
	
	public void findByNameCarrera() {

		try {
			listaDuracion= dService.findByNameDuracion(this.getDuracion());
		} catch (Exception e) {
			System.out.println("Error al buscar en el controller curso");
		}
	}
	
	public String UpdatePre(Duracion duracion) {
		this.setDuracion(duracion);
		return "duracionUpdate.xhtml";
	}
	
	public void update() {
		
		try {
			dService.update(this.duracion);
		} catch (Exception e) {
			System.out.println("Error al modificar en el controlador de carrera");
		}
	}

	public Duracion getDuracion() {
		return duracion;
	}

	public void setDuracion(Duracion duracion) {
		this.duracion = duracion;
	}

	public List<Duracion> getListaDuracion() {
		return listaDuracion;
	}

	public void setListaDuracion(List<Duracion> listaDuracion) {
		this.listaDuracion = listaDuracion;
	}
	
	
}
