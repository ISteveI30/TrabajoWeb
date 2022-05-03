package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.FaAcademiaDao;
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
	
}
