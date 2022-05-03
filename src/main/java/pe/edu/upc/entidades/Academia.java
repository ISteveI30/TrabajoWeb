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
@Table(name = "Academia")
public class Academia {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAcademia;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "password", nullable =false , length = 20)
	private String password;
	
	@Column(name = "correo", nullable =false , length = 50)
	private String correo;
	
	@Column(name = "telefono", nullable = false, length = 10)
	private String telefono;
	
	@Column(name = "tipo", nullable = true)
	private int tipo;
	
	@ManyToOne
	@JoinColumn(name = "idSede", nullable=false)
	private Sede sede;
	
	
	public Academia() {
		super();
		this.tipo=2;
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

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAcademia);
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
		Academia other = (Academia) obj;
		return idAcademia == other.idAcademia;
	}
	
}
