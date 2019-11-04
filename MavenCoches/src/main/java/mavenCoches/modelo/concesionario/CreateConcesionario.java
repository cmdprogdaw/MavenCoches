package mavenCoches.modelo.concesionario;

import javax.persistence.EntityManager;

import mavenCoches.negocio.ConcesionarioBean;
import mavenCoches.util.ConnectionEntityManager;

public class CreateConcesionario {

	public void create(ConcesionarioBean concesionario) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(concesionario);
		entityManager.getTransaction().commit();
	}
}
