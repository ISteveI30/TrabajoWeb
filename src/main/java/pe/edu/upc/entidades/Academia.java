package pe.edu.upc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Academia")
public class Academia {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAcademia;
	
	@Column(name = "nombre", nullable = false, length = 35)
	private String nombre;
	
	@Column(name = "password", nullable =false , length = 20)
	private String password;
	
	@Column(name = "correo", nullable =false , length = 50)
	private String correo;
	
	@Column(name = "telefono", nullable = false, length = 10)
	private String telefono;

	/*@Column(name = "telefono", nullable = false, length = 10)
	private String telefono;*/
	
	
	public Academia() {
		super();
	}

	public Academia(int idAcademia, String nombre, String password, String correo, String telefono) {
		super();
		this.idAcademia = idAcademia;
		this.nombre = nombre;
		this.password = password;
		this.correo = correo;
		this.telefono = telefono;
	}

	public int getIdAcademia() {
		return idAcademia;
	}
	public void setIdAcademia(int idAcademia) {
		this.idAcademia = idAcademia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
