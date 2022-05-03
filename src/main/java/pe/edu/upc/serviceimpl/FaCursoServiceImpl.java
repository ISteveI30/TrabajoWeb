package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.FaCursoDao;
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
	
}
