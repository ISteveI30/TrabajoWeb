package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Promocion;

public interface PromocionService {

	public void insert(Promocion p);

	public List<Promocion> list();
	
	public void delete(int idPromocion);
	
	public void update(Promocion p);
	
	public List<Promocion> findByNamePromocion(Promocion p);
}
