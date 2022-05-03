package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.CarreraDao;
import pe.edu.upc.entidades.Carrera;

public class CarreraImpl implements CarreraDao {

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Carrera c) {
		try {
			em.persist(c);
		} catch (Exception e) {
			System.out.println("Error al insertar carrera");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Carrera> list() {
		List<Carrera> listaCarreras = new ArrayList<Carrera>();

		try {
			Query jpql = em.createQuery("from Carrera c");
			listaCarreras = (List<Carrera>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaCarreras;
	}

	@Transactional
	@Override
	public void delete(int idCarrera) {
		try {
			Carrera carrera = em.find(Carrera.class, idCarrera);
			em.remove(carrera);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Carrera> findByNameCarrera(Carrera carrera) {
		List<Carrera> lista = new ArrayList<Carrera>();
		try {
			Query q = em.createQuery("from Carrera carrera where carrera.nombre like ?1");
			q.setParameter(1, "%" + carrera.getNombre() + "%");
			lista = (List<Carrera>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar en el dao de carrera");
		}
		return lista;
	}

	@Transactional
	@Override
	public void update(Carrera carrera) {
		try {
			em.merge(carrera);
		} catch (Exception e) {
			System.out.println("Error al buscar en el dao de carrera");
		}
	}

}
