package pe.edu.upc.entidades;

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
	private int idSedes;

	@Column(name = "nombre", nullable = false, length = 35)
	private String nombre;
	
	public Sede() {
		super();
	}

	public Sede(int idSedes, String nombre) {
		super();
		this.idSedes = idSedes;
		this.nombre = nombre;
	}

	public int getIdSedes() {
		return idSedes;
	}

	public void setIdSedes(int idSedes) {
		this.idSedes = idSedes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
