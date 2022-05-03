package pe.edu.upc.entidades;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FaAcademia")
public class FaAcademia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "idAcademia", nullable=false)
	private Academia academia;
	
	@ManyToOne
	@JoinColumn(name = "idEstudiante", nullable=true)
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaAcademia other = (FaAcademia) obj;
		return id == other.id;
	}
	
	
	
}
