package pe.edu.upc.entidades;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Duracion")
public class Duracion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDuracion;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	
	public Duracion() {
		super();
	}

	public Duracion(int idDuracion, String nombre) {
		super();
		this.idDuracion = idDuracion;
		this.nombre = nombre;
	}

	public int getIdDuracion() {
		return idDuracion;
	}

	public void setIdDuracion(int idDuracion) {
		this.idDuracion = idDuracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDuracion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Duracion other = (Duracion) obj;
		return idDuracion == other.idDuracion;
	}
	
}
