package mavenCoches.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="concesionario")
public class ConcesionarioBean {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long idConcesionario;
	
	@Column
	private String nombre;
	
	@Column
	private String cif;
	
	@Column
	private String localidad;
	
	@Column
	private String provincia;
	
	@Column
	private int telefono;

	
	@OneToMany(mappedBy = "concesionario")
	private List<CocheBean> coches = new ArrayList<CocheBean>();
	
	
	public void addCoches(CocheBean coche) {
		
		if (!coches.contains(coche)) {
			
			coches.add(coche);
			coche.setConcesionario(this);
		}
	}
	
	
	@OneToMany(mappedBy = "concesionario")
	private List<TrabajadorBean> trabajadores = new ArrayList<TrabajadorBean>();
	
	
	public void addTrabajador(TrabajadorBean trabajador) {
		
		if (!trabajadores.contains(trabajador)) {
			
			trabajadores.add(trabajador);
			trabajador.setConcesionario(this);
		}
	}
	
	
	@OneToMany(mappedBy = "concesionario")
	private List<ReparacionBean> reparaciones = new ArrayList<ReparacionBean>();
	
	
	public void addReparacion(ReparacionBean reparacion) {
		
		if (!reparaciones.contains(reparacion)) {
			
			reparaciones.add(reparacion);
			reparacion.setConcesionario(this);
		}
	}
	
	
	public List<CocheBean> getCoches() {
		return coches;
	}

	public void setCoches(List<CocheBean> coches) {
		this.coches = coches;
	}

	public long getIdConcesionario() {
		return idConcesionario;
	}

	public void setIdConcesionario(long idConcesionario) {
		this.idConcesionario = idConcesionario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
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
	
	
}
