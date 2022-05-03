package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Comentario;

public interface ComentarioDao {
	public void insert(Comentario c);

	public List<Comentario> list();

	public void delete(int idComentario);
	
}
