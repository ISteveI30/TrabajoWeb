package pe.edu.upc.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FaCurso")
public class FaCurso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Curso curso;
	
	private Estudiante estudiante;

	public FaCurso() {
		super();
	}

	public FaCurso(int id, Curso curso, Estudiante estudiante) {
		super();
		this.id = id;
		this.curso = curso;
		this.estudiante = estudiante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}
