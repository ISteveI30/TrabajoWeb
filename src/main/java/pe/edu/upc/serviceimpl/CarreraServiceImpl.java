package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.CarreraDao;
import pe.edu.upc.entidades.Carrera;
import pe.edu.upc.service.CarreraService;


@Named
public class CarreraServiceImpl implements CarreraService{

	@Inject
	private CarreraDao cDao;

	@Override
	public void insert(Carrera c) {
		cDao.insert(c);
	}

	@Override
	public List<Carrera> list() {
		return cDao.list();
	}

	@Override
	public void delete(int idCarrera) {
		cDao.delete(idCarrera);
	}

	@Override
	public List<Carrera> findByNameCarrera(Carrera carrera) {
		return cDao.findByNameCarrera(carrera);
		
	}

	@Override
	public void update(Carrera carrera) {
		
		cDao.update(carrera);
	}
	
}
