package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDocenteDao;
import pe.edu.upc.entidades.Docente;

public class DocenteImplDao implements IDocenteDao {
	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Docente d) {
		try {
			em.persist(d);
		} catch (Exception e) {
			System.out.println("Error al insertar docente");
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Docente> list() {
		List<Docente> listaDocentes = new ArrayList<Docente>();
		try {
			Query jpql = em.createQuery("from Docente d");
			listaDocentes = (List<Docente>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar docente");
		}
		return listaDocentes;
	}

	@Transactional
	@Override
	public void delete(int idDocente) {
		try {
			Docente doc = em.find(Docente.class, idDocente);
			em.remove(doc);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao Docente");
		}

	}

}
