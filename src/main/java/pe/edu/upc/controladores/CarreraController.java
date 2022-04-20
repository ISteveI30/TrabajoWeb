package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Carrera;
import pe.edu.upc.service.CarreraService;

@Named
@RequestScoped
public class CarreraController {

	@Inject
	private CarreraService  cService;
	private Carrera carrera;
	List<Carrera> listaCarrera;

	// constructor
	@PostConstruct
	public void init() {
		this.listaCarrera = new ArrayList<Carrera>();
		this.carrera = new Carrera();
		this.list();
	}

	// métodos

	public String newCarrera() {

		this.setCarrera(new Carrera());
		return "carrera.xhtml";
	}

	public void insert() {
		try {
			cService.insert(carrera);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller carrera");
		}
	}

	public void list() {
		try {
			listaCarrera = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller carrera");
		}
	}

	public void delete(Carrera carrea) {
		try {
			cService.delete(carrea.getIdCarrera());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller carrera");
		}
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public List<Carrera> getListaCarrera() {
		return listaCarrera;
	}

	public void setListaCarrera(List<Carrera> listaCarrera) {
		this.listaCarrera = listaCarrera;
	}
	
	
}
