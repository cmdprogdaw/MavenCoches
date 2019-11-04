package mavenCoches.modelo.coche;


import javax.persistence.EntityManager;

import mavenCoches.negocio.CocheBean;
import mavenCoches.util.ConnectionEntityManager;

public class CreateCoche {
	
	public void create(CocheBean coche) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(coche);
		entityManager.getTransaction().commit();
	}
}
