package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IAcademiaDao;
import pe.edu.upc.entidades.Academia;
import pe.edu.upc.service.AcademiaService;

public class AcademiaServiceImpl implements AcademiaService{

	@Inject
	private IAcademiaDao aDao;

	@Override
	public void insert(Academia c) {
		aDao.insert(c);
	}

	@Override
	public List<Academia> list() {
		return aDao.list();
	}

	@Override
	public void delete(int idAcademia) {
		aDao.delete(idAcademia);
	}
	
}
