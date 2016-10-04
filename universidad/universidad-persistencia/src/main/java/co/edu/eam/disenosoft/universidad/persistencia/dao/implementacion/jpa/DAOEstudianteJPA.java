package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IEstudianteDAO;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;


public class DAOEstudianteJPA implements IEstudianteDAO {

	public void crear(Estudiante t) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.persist(t);

		em.getTransaction().commit();

	}

	public void editar(Estudiante t) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		
		em.merge(t);
		
		em.getTransaction().commit();

	}

	public void eliminar(String cedula) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		Estudiante c = buscar(cedula);
		if (c != null) {
		em.remove(c);
		}
		em.getTransaction().commit();

	}

	public Estudiante buscar(String ced) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Estudiante.class, ced);
	}

}
