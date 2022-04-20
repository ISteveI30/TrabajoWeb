package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Estudiante;
import pe.edu.upc.service.IEstudianteService;

@Named
@RequestScoped
public class EstudianteController {
	@Inject
	private IEstudianteService eService;
	
	private Estudiante est;
	List<Estudiante> listaEstudiantes;

//constructor
	@PostConstruct
	public void init() {
		this.listaEstudiantes = new ArrayList<Estudiante>();
		this.est = new Estudiante();
		this.list();
	}

	public String newEstudiante() {

		this.setest(new Estudiante());
		return "Estudiante.xhtml";
	}
	public void insert() {
		try {
			eService.insert(est);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller estudiante");
		}
	}
	

	public void list() {
		try {
			listaEstudiantes = eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller estudiante");
		}
	}

	public void delete(Estudiante estu) {
		try {
			eService.delete(estu.getIdEstudiante());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller estudiante");
		}
	}
	public Estudiante getest() {
		return est;
	}



	public void setest(Estudiante est) {
		this.est = est;
	}



	public List<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	


}
