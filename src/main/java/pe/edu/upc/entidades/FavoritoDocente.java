package pe.edu.upc.entidades;

<<<<<<< HEAD
import java.util.Objects;

=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
import javax.persistence.Table;

@Entity
@Table(name = "FavoritoDocente")
public class FavoritoDocente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
<<<<<<< HEAD
	@ManyToOne
	@JoinColumn(name = "idDocente", nullable=false)
	private Docente docente;
	
	@ManyToOne
	@JoinColumn(name = "idEstudiante", nullable=true)
=======
	private Docente docente;
	
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	private Estudiante estudiante;

	
	public FavoritoDocente() {
		super();
	}

	public FavoritoDocente(int id, Docente docente, Estudiante estudiante) {
		super();
		this.id = id;
		this.docente = docente;
		this.estudiante = estudiante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
<<<<<<< HEAD
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FavoritoDocente other = (FavoritoDocente) obj;
		return id == other.id;
=======
>>>>>>> 45adecbe1e425614d640425de4f65524e7cbe012
	}	
	
}
