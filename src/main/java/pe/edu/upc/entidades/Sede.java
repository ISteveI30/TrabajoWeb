package pe.edu.upc.entidades;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sedes")
public class Sede {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSede;

	@Column(name = "nombre", nullable = false, length = 35)
	private String nombre;
	
	public Sede() {
		super();
	}

	public Sede(int idSede, String nombre) {
		super();
		this.idSede = idSede;
		this.nombre = nombre;
	}

	public int getIdSede() {
		return idSede;
	}

	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idSede, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sede other = (Sede) obj;
		return idSede == other.idSede && Objects.equals(nombre, other.nombre);
	}
	
}
