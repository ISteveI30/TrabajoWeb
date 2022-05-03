package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Promocion;
import pe.edu.upc.service.PromocionService;

@Named
@RequestScoped
public class PromocionController {

	@Inject
	private PromocionService  pService;
	private Promocion promocion;
	List<Promocion> listaPromocion;

	// constructor
	@PostConstruct
	public void init() {
		this.listaPromocion = new ArrayList<Promocion>();
		this.promocion = new Promocion();
		this.list();
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

	public void delete(Promocion promocion) {
		try {
			pService.delete(promocion.getIdPromocion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller");
		}
	}
	
	public String newPromocion() {

		this.setPromocion(new Promocion());
		return null;
	}
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
	
}
