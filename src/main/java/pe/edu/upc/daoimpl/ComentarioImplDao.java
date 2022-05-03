package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ComentarioDao;
import pe.edu.upc.entidades.Comentario;

public class ComentarioImplDao implements ComentarioDao {

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Comentario c) {
		try {
			em.persist(c);
		} catch (Exception e) {
			System.out.println("Error al insertar un comentario");
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Comentario> list() {
		List<Comentario> listaComentarios = new ArrayList<Comentario>();
		try {
			Query jpql = em.createQuery("from Comentario c");
			listaComentarios = (List<Comentario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar comentarios");
		}
		return listaComentarios;
	}

	@Transactional
	@Override
	public void delete(int idComentario) {
		try {
			Comentario doc = em.find(Comentario.class, idComentario);
			em.remove(doc);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao ");
		}

	}

	
}
