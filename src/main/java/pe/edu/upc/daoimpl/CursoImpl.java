package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.CursoDao;
import pe.edu.upc.entidades.Curso;

public class CursoImpl implements CursoDao {

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Curso c) {
		try {
			em.persist(c);
		} catch (Exception e) {
			System.out.println("Error al insertar curso");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Curso> list() {
		List<Curso> listaCursos = new ArrayList<Curso>();

		try {
			Query jpql = em.createQuery("from Curso c");
			listaCursos = (List<Curso>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaCursos;
	}

	@Transactional
	@Override
	public void delete(int idCurso) {
		try {
			Curso curso = em.find(Curso.class, idCurso);
			em.remove(curso);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
	
	
}
