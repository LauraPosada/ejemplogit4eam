package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IAsignaturaDAO;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOAsignaturaJPA implements IAsignaturaDAO {

	public void crear(Asignatura asig) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.persist(asig);

		em.getTransaction().commit();
	}

	public void editar(Asignatura asig) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.merge(asig);

		em.getTransaction().commit();
		
	}

	public void eliminar(String codigo) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		Asignatura c = buscar(codigo);
		if (c != null) {
		em.remove(c);
		}
		em.getTransaction().commit();
		
		
	}

	public Asignatura buscar(String codigo) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Asignatura.class, codigo);
	}

	
	
	
}
