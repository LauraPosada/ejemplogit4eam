package co.edu.eam.disenosoft.universidad.persistencia.utilidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdministradorEntityManager {

	private static EntityManager em;
	
	public static EntityManager getEntityManager(){
		
//		if(emF == null){
//			emF = Persistence.createEntityManagerFactory("jpa_Universidad");
//		}
//		return emF.createEntityManager();
		
		
		if (em == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_Universidad");

			em = emf.createEntityManager();
		}
		return em;
	}
}
