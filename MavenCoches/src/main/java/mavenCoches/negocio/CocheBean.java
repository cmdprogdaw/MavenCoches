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
@Table(name="coche")
public class CocheBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long idCoche;

	@Column
	private String bastidor;
	
	@Column
	private String modelo;
	
	@Column
	private int plazas;
	
	@Column
	private int caballos;
	
	@Column
	private int ejes;
	
	@Column
	private int precio_min;
	
	
	@ManyToOne
	@JoinColumn(name="FK_concesionario")
	private ConcesionarioBean concesionario;

	
	
	
	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}


	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}
	

	public long getIdCoche() {
		return idCoche;
	}


	public void setIdCoche(long idCoche) {
		this.idCoche = idCoche;
	}


	public String getBastidor() {
		return bastidor;
	}


	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getPlazas() {
		return plazas;
	}


	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}


	public int getCaballos() {
		return caballos;
	}


	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}


	public int getEjes() {
		return ejes;
	}


	public void setEjes(int ejes) {
		this.ejes = ejes;
	}


	public int getPrecio_min() {
		return precio_min;
	}


	public void setPrecio_min(int precio_min) {
		this.precio_min = precio_min;
	}
	
	
	
}
