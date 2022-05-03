package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.FaCursoDao;
<<<<<<< HEAD
import pe.edu.upc.entidades.Curso;
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
import pe.edu.upc.entidades.FaCurso;
import pe.edu.upc.service.FaCursoService;

public class FaCursoServiceImpl implements FaCursoService {

	@Inject
	private FaCursoDao fDao;
	@Override
	public void insert(FaCurso fa) {
		// TODO Auto-generated method stub
		fDao.insert(fa);
	}
	@Override
	public List<FaCurso> list() {
		// TODO Auto-generated method stub
		return fDao.list();
	}
	@Override
	public void delete(int idFavorito) {
		// TODO Auto-generated method stub
		fDao.delete(idFavorito);
	}
<<<<<<< HEAD
	@Override
	public Curso agregar(int idCurso) {
		// TODO Auto-generated method stub
		return fDao.agregar(idCurso);
	}
	@Override
	public List<FaCurso> findByNameFavCurso(FaCurso faCurso) {
		return fDao.findByNameFavCurso(faCurso);
	}
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	
}
