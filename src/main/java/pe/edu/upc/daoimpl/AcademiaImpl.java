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

	@SuppressWarnings("unchecked")
	@Override
	public List<Academia> findByNameAcademia(Academia academia) {
		List<Academia> lista=new ArrayList<Academia>();
		try {
		Query q=em.createQuery("from Academia academia where academia.nombre like ?1");
		q.setParameter(1, "%"+academia.getNombre()+"%");
		lista=(List<Academia>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar en el dao de curso");
		}
		return lista;
	}
		
}
