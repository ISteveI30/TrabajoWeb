package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.FaAcademiaDao;
<<<<<<< HEAD
import pe.edu.upc.entidades.Academia;
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
import pe.edu.upc.entidades.FaAcademia;
import pe.edu.upc.service.FaAcademiaService;

public class FaAcademiaServiceImpl implements FaAcademiaService {

	@Inject
	private FaAcademiaDao fDao;
	@Override
	public void insert(FaAcademia fa) {
		// TODO Auto-generated method stub
		fDao.insert(fa);
	}
	@Override
	public List<FaAcademia> list() {
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
	public Academia agregar(int idAcademia) {
		// TODO Auto-generated method stub
		return fDao.agregar(idAcademia);
	}
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	
}
