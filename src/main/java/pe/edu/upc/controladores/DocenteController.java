package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Docente;
import pe.edu.upc.service.IDocenteService;

@Named
@RequestScoped
public class DocenteController {

	@Inject
	private IDocenteService dService;

	private Docente d;
	List<Docente> listaDocentes;

	// constructor
	@PostConstruct
	public void init() {
		this.listaDocentes = new ArrayList<Docente>();
		this.d = new Docente();
		this.list();
	}

	// métodos
	/*public String newDocente() {

		this.setD(new Docente());
		return "docente.xhtml";
	}*/

	public void insert() {
		try {
			dService.insert(d);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller docente");
		}
	}

	private void list() {
		try {
			listaDocentes = dService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller docente");
		}

	}

	public void delete(Docente doc) {
		try {
			dService.delete(doc.getIdDocente());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller persona");
		}
	}

	public String updateDocente(Docente d) {
		this.setD(d);
		return "docenteUpdate.xhtml";
	}

	//Metodo buscar Docente por nombre
		public void findByNameDocente() {
			try {
				listaDocentes= dService.findByNameDocente(this.getD());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error al buscar docente en el controlador");
			}
		}
	
	public void update() {
		try {
			dService.update(this.d);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	// getters and setters

	public Docente getD() {
		return d;
	}

	public void setD(Docente d) {
		this.d = d;
	}

	public List<Docente> getListaDocentes() {
		return listaDocentes;
	}

	public void setListaDocentes(List<Docente> listaDocentes) {
		this.listaDocentes = listaDocentes;
	}
}
