package pe.edu.upc.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCurso;

	@Column(name = "nombre", nullable = false, length = 35)
	private String nombre;
	
	@Column(name = "culminacion", nullable = false)
	private Date culminacion;
	
	@Column(name = "precio", nullable = false)
	private int precio;
	
	@Column(name = "vacantes", nullable = false)
	private int vacantes;

	public Curso() {
		super();
	}
	
	public Curso(int idCurso, String nombre, Date culminacion, int precio, int vacantes) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.culminacion = culminacion;
		this.precio = precio;
		this.vacantes = vacantes;
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

	
	
	
	
	
}
