package modelo.entidad;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "autores")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_autor;
	private String apellidos;
	
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	private List<Libro> libros;

	public Autor(int id_autor, String apellidos, Date fechaNacimiento, List<Libro> libros) {
		super();
		this.id_autor = id_autor;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.libros = libros;
	}

	public Autor() {
		super();
		
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id_autor=" + id_autor + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", libros=" + libros + "]";
	}

}