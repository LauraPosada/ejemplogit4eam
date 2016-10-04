package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.ISesionCursoDAO;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOSesionCurso implements ISesionCursoDAO{

	public void crear(SesionCurso sesion) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(sesion);
		em.getTransaction().commit();
		
	}
	

	public SesionCurso buscar(int cod) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(SesionCurso.class, cod);
	}


	public void eliminar(int codigo) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		SesionCurso sc = buscar(codigo);
		if (sc != null) {
		em.remove(sc);
		}
		em.getTransaction().commit();
		
	}
	
	public List<SesionCurso> listSesionCur() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(SesionCurso.CONSULTA_LISTAR_SESIONES);
		
		List<SesionCurso> listSesion = q.getResultList();
		
		return listSesion;
		
	}
		
	public List<SesionCurso> listaSesionDocente(Docente doc) throws Exception {

		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q =  em.createNamedQuery(SesionCurso.CONSULTA_LISTAR_DOCENTE);
		
		q.setParameter(1, doc);

		List<SesionCurso> lisPro = q.getResultList();

		return lisPro;

	}

}
