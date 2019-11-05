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
@Table(name="categoria")
public class CategoriaBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long idCategoria;
	
	@Column
	private String nombre;
	
	@Column
	private int plus;
	
	
	@OneToMany(mappedBy = "categoria")
	private List<TrabajadorBean> trabajadores = new ArrayList<TrabajadorBean>();
	
	public void addTrabajador(TrabajadorBean trabajador) {
		
		if (!trabajadores.contains(trabajador)) {
			
			trabajadores.add(trabajador);
			trabajador.setCategoria(this);
		}
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public List<TrabajadorBean> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<TrabajadorBean> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}
	
	
}
