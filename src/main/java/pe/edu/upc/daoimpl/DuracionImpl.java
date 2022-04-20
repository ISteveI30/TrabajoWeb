package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.DuracionDao;
import pe.edu.upc.entidades.Duracion;

public class DuracionImpl implements DuracionDao {

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Duracion d) {
		try {
			em.persist(d);
		} catch (Exception e) {
			System.out.println("Error al insertar curso");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Duracion> list() {
		List<Duracion> listaDuraciones = new ArrayList<Duracion>();

		try {
			Query jpql = em.createQuery("from Duracion d");
			listaDuraciones = (List<Duracion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaDuraciones;
	}

	@Transactional
	@Override
	public void delete(int idDuracion) {
		try {
			Duracion duracion = em.find(Duracion.class, idDuracion);
			em.remove(duracion);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
	
}
