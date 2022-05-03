package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.edu.upc.entidades.Academia;
import pe.edu.upc.service.AcademiaService;

public class AcademiaController {

	@Inject
	private AcademiaService  aService;
	private Academia academia;
	List<Academia> listaAcademia;

	// constructor
	@PostConstruct
	public void init() {
		this.listaAcademia = new ArrayList<Academia>();
		this.academia = new Academia();
		this.list();
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

	public void delete(Academia academia) {
		try {
			aService.delete(academia.getIdAcademia());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller academia");
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
	
	
}
