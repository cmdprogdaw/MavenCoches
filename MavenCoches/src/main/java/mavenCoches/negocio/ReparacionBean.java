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
@Table(name="reparacion")
public class ReparacionBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long idReparacion;
	
	@Column
	private String matricula;
	
	@Column
	private String marca;
	
	@Column
	private String modelo;
	
	@Column
	private String color;
	
	@Column
	private String bastidor;
	
	@Column
	private String descripcion;
	
	@Column
	private int presupuesto;
	
	
	@ManyToOne
	@JoinColumn(name="FK_concesionario")
	private ConcesionarioBean concesionario;


	
	public long getIdReparacion() {
		return idReparacion;
	}


	public void setIdReparacion(long idReparacion) {
		this.idReparacion = idReparacion;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBastidor() {
		return bastidor;
	}


	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getPresupuesto() {
		return presupuesto;
	}


	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}


	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}


	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}
	
	
	
	
}
