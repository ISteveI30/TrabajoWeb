package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.SedesDao;
import pe.edu.upc.entidades.Sede;

public class SedesImpl implements SedesDao {

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Sede s) {
		try {
			em.persist(s);
		} catch (Exception e) {
			System.out.println("Error al insertar una sede");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sede> list() {
		List<Sede> listaSedes = new ArrayList<Sede>();

		try {
			Query jpql = em.createQuery("from Sede s");
			listaSedes = (List<Sede>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaSedes;
	}

	@Transactional
	@Override
	public void delete(int idSede) {
		try {
			Sede sede = em.find(Sede.class, idSede);
			em.remove(sede);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
	
}
