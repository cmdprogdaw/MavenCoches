package mavenCoches.modelo.reparacion;

import javax.persistence.EntityManager;

import mavenCoches.negocio.ReparacionBean;
import mavenCoches.util.ConnectionEntityManager;

public class CreateReparacion {
	
	public void create(ReparacionBean reparacion) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(reparacion);
		entityManager.getTransaction().commit();
	}
}
