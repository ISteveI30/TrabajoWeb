package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.FaCursoDao;
<<<<<<< HEAD
import pe.edu.upc.entidades.Curso;
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
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
<<<<<<< HEAD

	@Transactional
	@Override
	public Curso agregar(int idCurso) {

		Curso curso = new Curso();
		try {
			curso = em.find(Curso.class, idCurso);
		} catch (Exception e) {

			System.out.println("Error al agregar un curso en el dao");
		}
		return curso;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FaCurso> findByNameFavCurso(FaCurso faCurso) {
		List<FaCurso> lista = new ArrayList<FaCurso>();
		try {
			Query q = em.createQuery("from FaCurso fa where fa.nombre like ?1");
			q.setParameter(1, "%" + faCurso.getCurso() + "%");
			lista = (List<FaCurso>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar en el dao de curso");
		}
		return lista;
	}

	

=======
	
	
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
}
