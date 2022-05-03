package pe.edu.upc.entidades;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Estudiante")
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEstudiante;
	
	@Column(name = "nombre", nullable = false, length = 35)
	private String nombre;
	@Column(name = "apellido", nullable = false, length = 35)
	private String apellido;
	@Column(name = "password", nullable =false , length = 40)
	private String password;
	@Column(name = "correo", nullable =false , length = 50)
	private String correo;
	@Column(name = "tipo", nullable = true)
	private int tipo;
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
		this.tipo = 1;
	}

	public Estudiante(int idEstudiante, String nombre, String apellido, String password, String correo) {
		super();
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.correo = correo;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEstudiante);
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return idEstudiante == other.idEstudiante;
	}
	
}
