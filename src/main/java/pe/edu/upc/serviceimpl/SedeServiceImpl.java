package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.SedesDao;
import pe.edu.upc.entidades.Sede;
import pe.edu.upc.service.SedeService;

public class SedeServiceImpl implements SedeService {

	@Inject
	private SedesDao sDao;
	
	@Override
	public void insert(Sede s) {
		// TODO Auto-generated method stub
		sDao.insert(s);
	}

	@Override
	public List<Sede> list() {
		// TODO Auto-generated method stub
		return sDao.list();
	}

	@Override
	public void delete(int idSede) {
		// TODO Auto-generated method stub
		sDao.delete(idSede);
	}

}
