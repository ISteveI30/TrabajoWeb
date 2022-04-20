package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEstudianteDao;
import pe.edu.upc.entidades.Estudiante;

public class EstudianteImplDao implements IEstudianteDao {

	@PersistenceContext(unitName = "uHelp")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Estudiante est) {
		// TODO Auto-generated method stub
		try {
			em.persist(est);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar estudiante");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Estudiante> list() {
		// TODO Auto-generated method stub
		List<Estudiante> listaEstudiantes=new ArrayList<Estudiante>();
		try {
			Query jpql=em.createQuery("from Estudiante est");
			listaEstudiantes=(List<Estudiante>)jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar estudiantes");
		}
		return listaEstudiantes;
	}

	@Transactional
	@Override
	public void delete(int idEstudiante) {
		// TODO Auto-generated method stub
		try {
			Estudiante est=em.find(Estudiante.class, idEstudiante);
			em.remove(est);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar en el dao");
		}
		
	}

}
