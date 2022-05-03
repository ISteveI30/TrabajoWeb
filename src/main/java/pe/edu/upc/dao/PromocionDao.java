package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Promocion;

public interface PromocionDao {

	public void insert(Promocion p);

	public List<Promocion> list();
	
	public void delete(int idPromocion);
<<<<<<< HEAD
	
	public void update(Promocion p);
	
	public List<Promocion> findByNamePromocion(Promocion p);
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
}
