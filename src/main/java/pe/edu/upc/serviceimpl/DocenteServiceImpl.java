package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDocenteDao;
import pe.edu.upc.entidades.Docente;
import pe.edu.upc.service.IDocenteService;

@Named
public class DocenteServiceImpl implements IDocenteService{
	@Inject
	private IDocenteDao dDao;

	@Override
	public void insert(Docente d) {
		dDao.insert(d);
	}

	@Override
	public List<Docente> list() {
		return dDao.list();
	}

	@Override
	public void delete(int idDocente) {
		dDao.delete(idDocente);
	}

	@Override
	public void update(Docente d) {
		// TODO Auto-generated method stub
		dDao.update(d);
	}


	@Override
	public List<Docente> findByNameDocente(Docente d) {
		// TODO Auto-generated method stub
		return dDao.findByNameDocente(d);
	}


	
}
