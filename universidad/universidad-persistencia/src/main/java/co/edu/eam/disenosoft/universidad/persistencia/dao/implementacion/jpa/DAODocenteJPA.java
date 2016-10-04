package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IDocenteDAO;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.ConexionUniversidadJDBC;


public class DAODocenteJPA implements IDocenteDAO{
	
		
	public void crear(Docente docente) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.persist(docente);

		em.getTransaction().commit();
		
	}

	public void editar(Docente docente) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.merge(docente);

		em.getTransaction().commit();
		
	}

	public void eliminar(String cedula) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		Docente c = buscar(cedula);
		if (c != null) {
		em.remove(c);
		}
		em.getTransaction().commit();
		
	}

	public Docente buscar(String ced) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Docente.class, ced);
	}

	public List<Docente> listarDocente() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
