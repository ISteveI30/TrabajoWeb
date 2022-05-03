package pe.edu.upc.entidades;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Promocion")
public class Promocion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPromocion;
	
	@Column(name = "titulo", nullable = false, length = 50)
	private String titulo;
	
	@Column(name = "descripcion", nullable = false, length = 60)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idDocente", nullable=false)
	private Docente docente;
	
	@ManyToOne
	@JoinColumn(name = "idAcademia", nullable=true)
	private Academia academia;
	
	@ManyToOne
	@JoinColumn(name = "idCurso", nullable=false)
	private Curso curso;
	
	public Promocion() {
		super();
	}

	public Promocion(int idPromocion, String titulo, String descripcion, Docente docente, Academia academia,
			Curso curso) {
		super();
		this.idPromocion = idPromocion;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.docente = docente;
		this.academia = academia;
		this.curso = curso;
	}

	public int getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPromocion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Promocion other = (Promocion) obj;
		return idPromocion == other.idPromocion;
	}
	
}
