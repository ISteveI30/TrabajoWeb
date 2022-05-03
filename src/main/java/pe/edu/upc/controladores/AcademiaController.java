package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Academia;
import pe.edu.upc.entidades.Sede;

import pe.edu.upc.service.AcademiaService;
import pe.edu.upc.service.SedeService;

@Named
@RequestScoped
public class AcademiaController {

	@Inject
	private AcademiaService  aService;
	private Academia academia;
	List<Academia> listaAcademia;

	@Inject
	private SedeService sService;
	private List<Sede> listaSedes;
	
	// constructor
	@PostConstruct
	public void init() {
		this.academia = new Academia();
		this.listaAcademia = new ArrayList<Academia>();
		this.listaSedes = new ArrayList<Sede>();
		this.list();
		this.listaSedes();
	}
	public void insert() {
		try {
			aService.insert(academia);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller academia");
		}
	}

	public void list() {
		try {
			listaAcademia = aService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller academia");
		}
	}
	
	public void listaSedes() {
		try {
			listaSedes = sService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller");
		}
	}

	public void delete(Academia academia) {
		try {
			aService.delete(academia.getIdAcademia());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller academia");
		}
	}
	
	public void findByNameCarrera() {

		try {
			listaAcademia = aService.findByNameAcademia(this.getAcademia());
		} catch (Exception e) {
			System.out.println("Error al buscar en el controller curso");
		}
	}
	
	// métodos

	public String newCarrera() {

		this.setAcademia(new Academia());
		return "carrera.xhtml";
	}

	public AcademiaService getaService() {
		return aService;
	}

	public void setaService(AcademiaService aService) {
		this.aService = aService;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}

	public List<Academia> getListaAcademia() {
		return listaAcademia;
	}

	public void setListaAcademia(List<Academia> listaAcademia) {
		this.listaAcademia = listaAcademia;
	}
	public List<Sede> getListaSedes() {
		return listaSedes;
	}
	public void setListaSedes(List<Sede> listaSedes) {
		this.listaSedes = listaSedes;
	}
	public SedeService getsService() {
		return sService;
	}
	public void setsService(SedeService sService) {
		this.sService = sService;
	}
	
	
}
