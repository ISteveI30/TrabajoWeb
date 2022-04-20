package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEstudianteDao;
import pe.edu.upc.entidades.Estudiante;
import pe.edu.upc.service.IEstudianteService;

@Named
public class EstudianteServiceImpl implements IEstudianteService{

	@Inject
	private IEstudianteDao eDao;
	@Override
	public void insert(Estudiante est) {
		// TODO Auto-generated method stub
		eDao.insert(est);
	}

	@Override
	public List<Estudiante> list() {
		// TODO Auto-generated method stub
		return eDao.list();
	}

	@Override
	public void delete(int idEstudiante) {
		// TODO Auto-generated method stub
		eDao.delete(idEstudiante);
	}

}
