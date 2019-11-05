package mavenCoches.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="trabajador")
public class TrabajadorBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long idTrabajador;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String dni;
	
	@Column
	private String direccion;
	
	@Column
	private String localidad;
	
	@Column
	private String provincia;
	
	@Column
	private int telefono;
	
	@Column
	private int sueldo_base;
	
	
	@ManyToOne
	@JoinColumn(name="FK_concesionario")
	private ConcesionarioBean concesionario;

	
	@ManyToOne
	@JoinColumn(name="FK_categoria")
	private CategoriaBean categoria;
	
	
	
	public CategoriaBean getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaBean categoria) {
		this.categoria = categoria;
	}


	public long getIdTrabajador() {
		return idTrabajador;
	}


	public void setIdTrabajador(long idTrabajador) {
		this.idTrabajador = idTrabajador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public int getSueldo_base() {
		return sueldo_base;
	}


	public void setSueldo_base(int sueldo_base) {
		this.sueldo_base = sueldo_base;
	}


	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}


	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}
	
	
	
}
