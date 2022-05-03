package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.FaAcademiaDao;
import pe.edu.upc.entidades.Academia;
import pe.edu.upc.entidades.FaAcademia;

public class FaAcademiaImplDao implements FaAcademiaDao{

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(FaAcademia f) {
		try {
			em.persist(f);
		} catch (Exception e) {
			System.out.println("Error al insertar academia");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FaAcademia> list() {
		List<FaAcademia> listaFavoritos = new ArrayList<FaAcademia>();

		try {
			Query jpql = em.createQuery("from FaAcademia f");
			listaFavoritos = (List<FaAcademia>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaFavoritos;
	}

	@Transactional
	@Override
	public void delete(int idFavorito) {
		try {
			FaAcademia favorito = em.find(FaAcademia.class, idFavorito);
			em.remove(favorito);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}

	@Transactional
	@Override
	public Academia agregar(int idAcademia) {
		// TODO Auto-generated method stub
		Academia academia =new Academia();
		try {
			academia = em.find(Academia.class, idAcademia);		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al agregar un curso en el dao");
		}
		return academia;
	}
	
	
}
