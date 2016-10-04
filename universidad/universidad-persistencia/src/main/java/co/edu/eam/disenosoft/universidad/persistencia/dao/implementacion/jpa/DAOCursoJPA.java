package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.ICursoDAO;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOCursoJPA implements ICursoDAO{

	public void crear(Curso curso) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
	
		em.getTransaction().begin();
		
		em.persist(curso);
		
		em.getTransaction().commit();
	}

	public void edita(Curso curso) throws Exception {
	
		
		
	}

	public Curso buscar(String curso) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Curso.class, curso);
	}

	



}
