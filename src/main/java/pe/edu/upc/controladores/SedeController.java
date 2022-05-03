package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Sede;
import pe.edu.upc.service.SedeService;

@Named
@RequestScoped
public class SedeController {

	@Inject
	private SedeService  sService;
	private Sede sede;
	List<Sede> listaSedes;

	// constructor
	@PostConstruct
	public void init() {
		this.listaSedes = new ArrayList<Sede>();
		this.sede = new Sede();
		this.list();
	}

	// métodos

	public String newSede() {

		this.setSede(new Sede());
		return null;
	}

	public void insert() {
		try {
			sService.insert(sede);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller ");
		}
	}

	public void list() {
		try {
			listaSedes = sService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller ");
		}
	}

	public void delete(Sede sede) {
		try {
			sService.delete(sede.getIdSede());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller ");
		}
	}

	public SedeService getsService() {
		return sService;
	}

	public void setsService(SedeService sService) {
		this.sService = sService;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public List<Sede> getListaSedes() {
		return listaSedes;
	}

	public void setListaSedes(List<Sede> listaSedes) {
		this.listaSedes = listaSedes;
	}
	
}
