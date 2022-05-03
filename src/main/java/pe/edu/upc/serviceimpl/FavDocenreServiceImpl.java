package pe.edu.upc.serviceimpl;


import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.FavDocenteDao;
<<<<<<< HEAD
import pe.edu.upc.entidades.Docente;
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
import pe.edu.upc.entidades.FavoritoDocente;
import pe.edu.upc.service.FavDocenteService;

public class FavDocenreServiceImpl implements FavDocenteService{

	@Inject
	private FavDocenteDao fDao;
	@Override
	public void insert(FavoritoDocente fa) {
		// TODO Auto-generated method stub
		fDao.insert(fa);
	}

	@Override
	public List<FavoritoDocente> list() {
		// TODO Auto-generated method stub
		return fDao.list();
	}

	@Override
	public void delete(int idFavorito) {
		// TODO Auto-generated method stub
		fDao.delete(idFavorito);
	}
<<<<<<< HEAD

	@Override
	public Docente agregar(int idDocente) {
		// TODO Auto-generated method stub
		return fDao.agregar(idDocente);
	}
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	
}
