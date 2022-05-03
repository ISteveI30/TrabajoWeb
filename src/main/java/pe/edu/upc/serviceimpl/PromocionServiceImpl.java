package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.PromocionDao;
import pe.edu.upc.entidades.Promocion;
import pe.edu.upc.service.PromocionService;

public class PromocionServiceImpl implements PromocionService {

	@Inject
	private PromocionDao pDao;
	
	@Override
	public void insert(Promocion p) {
		// TODO Auto-generated method stub
		pDao.insert(p);
	}

	@Override
	public List<Promocion> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}

	@Override
	public void delete(int idPromocion) {
		// TODO Auto-generated method stub
		pDao.delete(idPromocion);
	}

<<<<<<< HEAD
	@Override
	public void update(Promocion p) {
		// TODO Auto-generated method stub
		pDao.update(p);
	}

	@Override
	public List<Promocion> findByNamePromocion(Promocion p) {
		// TODO Auto-generated method stub
		return pDao.findByNamePromocion(p);
	}
	
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
}
