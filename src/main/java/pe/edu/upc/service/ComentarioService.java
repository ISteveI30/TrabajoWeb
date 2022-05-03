package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Comentario;

public interface ComentarioService {

	public void insert(Comentario c);

	public List<Comentario> list();

	public void delete(int idComentario);
}
