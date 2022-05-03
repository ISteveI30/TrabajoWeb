package pe.edu.upc.entidades;

<<<<<<< HEAD
import java.util.Objects;

=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
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
<<<<<<< HEAD
	private int idSede;
=======
	private int idSedes;
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012

	@Column(name = "nombre", nullable = false, length = 35)
	private String nombre;
	
	public Sede() {
		super();
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

<<<<<<< HEAD
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
=======
	
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	
}
