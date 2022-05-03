package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.PromocionDao;
import pe.edu.upc.entidades.Promocion;

public class PromocionImpl implements PromocionDao{

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Promocion p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar promocion");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Promocion> list() {
		List<Promocion> listaPromociones = new ArrayList<Promocion>();

		try {
			Query jpql = em.createQuery("from Promocion P");
			listaPromociones = (List<Promocion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaPromociones;
	}

	@Transactional
	@Override
	public void delete(int idPromocion) {
		try {
			Promocion promocion = em.find(Promocion.class, idPromocion);
			em.remove(promocion);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
	
}
