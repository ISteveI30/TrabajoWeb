package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAcademiaDao;
import pe.edu.upc.entidades.Academia;


public class AcademiaImpl implements IAcademiaDao {

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Academia a) {
		try {
			em.persist(a);
		} catch (Exception e) {
			System.out.println("Error al insertar academia");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Academia> list() {
		List<Academia> listaAcademias = new ArrayList<Academia>();

		try {
			Query jpql = em.createQuery("from Academia a");
			listaAcademias = (List<Academia>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaAcademias;
	}

	@Transactional
	@Override
	public void delete(int idAcademia) {
		try {
			Academia academia = em.find(Academia.class, idAcademia);
			em.remove(academia);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
		
}
