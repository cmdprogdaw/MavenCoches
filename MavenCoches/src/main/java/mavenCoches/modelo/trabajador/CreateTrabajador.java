package mavenCoches.modelo.trabajador;

import javax.persistence.EntityManager;

import mavenCoches.negocio.TrabajadorBean;
import mavenCoches.util.ConnectionEntityManager;

public class CreateTrabajador {
	
	public void create(TrabajadorBean trabajador) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(trabajador);
		entityManager.getTransaction().commit();
	}
}
