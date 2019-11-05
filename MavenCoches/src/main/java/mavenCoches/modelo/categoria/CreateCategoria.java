package mavenCoches.modelo.categoria;

import javax.persistence.EntityManager;

import mavenCoches.negocio.CategoriaBean;
import mavenCoches.util.ConnectionEntityManager;

public class CreateCategoria {
	public void create(CategoriaBean categoria) {
		EntityManager entityManager = ConnectionEntityManager.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();
	}
}
