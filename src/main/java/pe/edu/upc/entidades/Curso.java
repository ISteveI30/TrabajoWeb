package pe.edu.upc.entidades;

import java.util.Date;
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
@Table(name = "Curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCurso;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "culminacion", nullable = false)
	private Date culminacion;
	
	@Column(name = "precio", nullable = false)
	private int precio;
	
	@Column(name = "vacantes", nullable = false)
	private int vacantes;

	@ManyToOne
	@JoinColumn(name = "idCarrera", nullable=false)
	private Carrera carrera;
	
	@ManyToOne
	@JoinColumn(name = "idDuracion", nullable=false)
	private Duracion duracion;
	
	@ManyToOne
	@JoinColumn(name = "idAcademia", nullable=true)
	private Academia academia;
	
	public Curso() {
		super();
	}
	
	public Curso(int idCurso, String nombre, Date culminacion, int precio, int vacantes, Carrera carrera,
			Duracion duracion, Academia academia) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.culminacion = culminacion;
		this.precio = precio;
		this.vacantes = vacantes;
		this.carrera = carrera;
		this.duracion = duracion;
		this.academia = academia;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getCulminacion() {
		return culminacion;
	}

	public void setCulminacion(Date culminacion) {
		this.culminacion = culminacion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVacantes() {
		return vacantes;
	}

	public void setVacantes(int vacantes) {
		this.vacantes = vacantes;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Duracion getDuracion() {
		return duracion;
	}

	public void setDuracion(Duracion duracion) {
		this.duracion = duracion;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCurso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return idCurso == other.idCurso;
	}
	
}
