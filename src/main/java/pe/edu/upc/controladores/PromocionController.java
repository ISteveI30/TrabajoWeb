package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Curso;
import pe.edu.upc.entidades.Docente;
import pe.edu.upc.entidades.Promocion;
import pe.edu.upc.service.CursoService;
import pe.edu.upc.service.IDocenteService;
import pe.edu.upc.service.PromocionService;

@Named
@RequestScoped
public class PromocionController {

	@Inject
	private PromocionService pService;
	private Promocion promocion;
	List<Promocion> listaPromocion;

	@Inject
	private CursoService curService;
	List<Curso> listaCurso;

	@Inject
	private IDocenteService docService;
	List<Docente> listaDocente;

	// constructor
	@PostConstruct
	public void init() {
		this.promocion = new Promocion();
		this.listaPromocion = new ArrayList<Promocion>();
		this.listaCurso = new ArrayList<Curso>();
		this.listaDocente = new ArrayList<Docente>();
		this.list();
		this.listCursos();
		this.listDocentes();

	}

	public void insert() {
		try {
			pService.insert(promocion);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller");
		}
	}

	public void list() {
		try {
			listaPromocion = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller");
		}
	}

	public void listDocentes() {
		try {
			listaDocente = docService.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public void listCursos() {
		try {
			listaCurso = curService.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public void delete(Promocion promocion) {
		try {
			pService.delete(promocion.getIdPromocion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller");
		}
	}

	public String updateProm(Promocion promocion) {
		this.setPromocion(promocion);
		return "promoUpdate";
	}

	public void update() {
		try {
			pService.update(this.promocion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public String newPublicacion() {

		return "publicacion.xhtml";
	}

	// Buscar promocion

	public void findByNamePromocion() {
		try {
			listaPromocion = pService.findByNamePromocion(this.getPromocion());
		} catch (Exception e) {

			System.out.println("error al buscar promocion");
		}

	}

	/*
	 * public String newPromocion() {
	 * 
	 * this.setPromocion(new Promocion()); return null; }
	 */
	public PromocionService getpService() {
		return pService;
	}

	public void setpService(PromocionService pService) {
		this.pService = pService;
	}

	public Promocion getPromocion() {
		return promocion;
	}

	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}

	public List<Promocion> getListaPromocion() {
		return listaPromocion;
	}

	public void setListaPromocion(List<Promocion> listaPromocion) {
		this.listaPromocion = listaPromocion;
	}

	public List<Curso> getListaCurso() {
		return listaCurso;
	}

	public void setListaCurso(List<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}

	public List<Docente> getListaDocente() {
		return listaDocente;
	}

	public void setListaDocente(List<Docente> listaDocente) {
		this.listaDocente = listaDocente;
	}

}
