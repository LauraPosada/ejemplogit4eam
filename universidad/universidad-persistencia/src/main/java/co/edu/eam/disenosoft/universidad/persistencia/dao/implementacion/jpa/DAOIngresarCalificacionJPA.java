package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IDAOIngresarCalificacion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOIngresarCalificacionJPA implements IDAOIngresarCalificacion{
	/**
	 * Listar los cursos de un docente
	 * @param docente
	 * @return
	 * @throws Exception
	 */
	public List<Curso> listarCursosDocente(Docente docente) throws Exception{
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Curso.CURSOS_DOCENTE);
		q.setParameter(1, docente);
		List<Curso> cursos = q.getResultList();
		return cursos;
	}

	public List<Evaluacion> listarCalificaciones(Curso curso) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(Evaluacion.LISTA_CALIFICACIONES);

		q.setParameter(1, curso);

		List<Evaluacion> lisPro = q.getResultList();

		return lisPro;
	}
	
	
}
