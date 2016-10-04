package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IEvaluacionAdministrarDAO;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOEvaluacionAdministrarJPA implements IEvaluacionAdministrarDAO {

	public List<Curso> listarCurso(String cod) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(Curso.CONSULTA_CARGAR_COMBO);

		q.setParameter(1, cod);

		List<Curso> lisPro = q.getResultList();

		return lisPro;
	}

	public void crearCalificaciones(Evaluacion evaluacion) throws Exception {

		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(evaluacion);
		em.getTransaction().commit();

	}

	public List<Evaluacion> obtenerPorcentaje(String porcentaje) throws Exception {

		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(Evaluacion.PORCENTAJE);

		q.setParameter(1, porcentaje);

		List<Evaluacion> lisPro = q.getResultList();

		return lisPro;

	}
	
	
	public void eliminarEvaluaciones (String codCurso, String nomEval) throws Exception{
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		Query q = em.createNamedQuery(Evaluacion.LISTAR_EVALUACIONES_NOMBRE);

		q.setParameter(1, codCurso);
		q.setParameter(2, nomEval);

		List<Evaluacion> listaEva = q.getResultList();
		Evaluacion reg = listaEva.get(0);
		em.remove(reg);
		em.getTransaction().commit();

	}

	public List<Evaluacion> listarCalificacion(String cedDocente) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(Evaluacion.LISTA_CALIFICACIONES);

		q.setParameter(1, cedDocente);

		List<Evaluacion> lisPro = q.getResultList();

		return lisPro;
	}



	

}
