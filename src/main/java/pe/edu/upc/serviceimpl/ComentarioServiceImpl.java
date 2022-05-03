package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.ComentarioDao;
import pe.edu.upc.entidades.Comentario;
import pe.edu.upc.service.ComentarioService;

public class ComentarioServiceImpl implements ComentarioService {

	@Inject
	private ComentarioDao cDao;

	@Override
	public void insert(Comentario c) {
		cDao.insert(c);
	}

	@Override
	public List<Comentario> list() {
		return cDao.list();
	}

	@Override
	public void delete(int idComentario) {
		cDao.delete(idComentario);
	}
}
