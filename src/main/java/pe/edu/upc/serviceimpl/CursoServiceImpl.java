package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.CursoDao;
import pe.edu.upc.entidades.Curso;
import pe.edu.upc.service.CursoService;

@Named
public class CursoServiceImpl implements CursoService {

	@Inject
	private CursoDao cDao;

	@Override
	public void insert(Curso c) {
		cDao.insert(c);
	}

	@Override
	public List<Curso> list() {
		return cDao.list();
	}

	@Override
	public void delete(int idCurso) {
		cDao.delete(idCurso);
	}

}
