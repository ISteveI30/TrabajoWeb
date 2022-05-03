package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.FaCursoDao;
import pe.edu.upc.entidades.FaCurso;

public class FaCursoImplDao implements FaCursoDao {

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(FaCurso f) {
		try {
			em.persist(f);
		} catch (Exception e) {
			System.out.println("Error al insertar curso");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FaCurso> list() {
		List<FaCurso> listaFavoritos = new ArrayList<FaCurso>();

		try {
			Query jpql = em.createQuery("from FaCurso f");
			listaFavoritos = (List<FaCurso>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaFavoritos;
	}

	@Transactional
	@Override
	public void delete(int idFavorito) {
		try {
			FaCurso favorito = em.find(FaCurso.class, idFavorito);
			em.remove(favorito);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
	
	
}
