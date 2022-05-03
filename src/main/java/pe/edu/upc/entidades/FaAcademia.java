package pe.edu.upc.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FaAcademia")
public class FaAcademia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Academia academia;
	
	private Estudiante estudiante;
	
	public FaAcademia() {
		super();
	}

	public FaAcademia(int id, Academia academia, Estudiante estudiante) {
		super();
		this.id = id;
		this.academia = academia;
		this.estudiante = estudiante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
}
