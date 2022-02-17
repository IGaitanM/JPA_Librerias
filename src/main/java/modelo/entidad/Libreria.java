package modelo.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libros")
public class Libreria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_libreria;
	private String nombre;
	private String nombre_due�o;
	private String direcion;
	private List<Libro> libros;
	
	public Libreria() {
		super();
	}

	public Libreria(int id_libreria, String nombre, String nombre_due�o, String direcion, List<Libro> libros) {
		super();
		this.id_libreria = id_libreria;
		this.nombre = nombre;
		this.nombre_due�o = nombre_due�o;
		this.direcion = direcion;
		this.libros = libros;
	}

	public int getId_libreria() {
		return id_libreria;
	}

	public void setId_libreria(int id_libreria) {
		this.id_libreria = id_libreria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre_due�o() {
		return nombre_due�o;
	}

	public void setNombre_due�o(String nombre_due�o) {
		this.nombre_due�o = nombre_due�o;
	}

	public String getDirecion() {
		return direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Libreria [id_libreria=" + id_libreria + ", nombre=" + nombre + ", nombre_due�o=" + nombre_due�o
				+ ", direcion=" + direcion + ", libros=" + libros + "]";
	}
	
	
	

	
}
