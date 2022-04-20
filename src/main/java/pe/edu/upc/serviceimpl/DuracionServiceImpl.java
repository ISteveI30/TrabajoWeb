package pe.edu.upc.serviceimpl;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.DuracionDao;
import pe.edu.upc.entidades.Duracion;
import pe.edu.upc.service.DuracionService;

@Named
public class DuracionServiceImpl implements DuracionService{

	@Inject
	private DuracionDao dDao;

	@Override
	public void insert(Duracion d) {
		dDao.insert(d);
	}

	@Override
	public List<Duracion> list() {
		return dDao.list();
	}

	@Override
	public void delete(int idDuracion) {
		dDao.delete(idDuracion);
	}
	
}
