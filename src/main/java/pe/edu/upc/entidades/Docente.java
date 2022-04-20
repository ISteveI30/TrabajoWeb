package pe.edu.upc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Docente")
public class Docente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDocente;
	
	@Column(name="nombre", nullable = false, length=45)
	private String nombre;
	
	@Column(name="apellido", nullable = false, length=45)
	private String apellido;
	
	@Column(name="dni", nullable = false, length=8)
	private String dni;
	
	@Column(name="puntajeDocente", nullable = false)
	private int puntaje;

	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Docente(int idDocente, String nombre, String apellido, String dni, int puntaje) {
		super();
		this.idDocente = idDocente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.puntaje = puntaje;
	}


	public int getIdDocente() {
		return idDocente;
	}


	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}



	
	
}
