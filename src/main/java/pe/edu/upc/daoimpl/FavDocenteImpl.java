package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import pe.edu.upc.dao.FavDocenteDao;
import pe.edu.upc.entidades.FavoritoDocente;

public class FavDocenteImpl implements FavDocenteDao {

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(FavoritoDocente f) {
		try {
			em.persist(f);
		} catch (Exception e) {
			System.out.println("Error al insertar curso");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FavoritoDocente> list() {
		List<FavoritoDocente> listaFavoritos = new ArrayList<FavoritoDocente>();

		try {
			Query jpql = em.createQuery("from FavoritoDocente f");
			listaFavoritos= (List<FavoritoDocente>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaFavoritos;
	}

	@Transactional
	@Override
	public void delete(int idFavorito) {
		try {
			FavoritoDocente favorito = em.find(FavoritoDocente.class, idFavorito);
			em.remove(favorito);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
	
}
