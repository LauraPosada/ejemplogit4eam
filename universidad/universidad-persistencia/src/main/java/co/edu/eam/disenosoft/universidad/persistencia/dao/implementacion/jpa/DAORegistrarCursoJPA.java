package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IRegistrarCursoDAO;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAORegistrarCursoJPA implements IRegistrarCursoDAO {

	public Estudiante buscarEst(String cedula) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Estudiante.class, cedula);
	}

	public Asignatura buscarAsig(String codigo) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Asignatura.class, codigo);
	}

	public List<Curso> listCursosAsig(Asignatura codAsig) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(Curso.CONSULTA_TABLA_ASIGNATURA);

		q.setParameter(1, codAsig);

		List<Curso> lisPro = q.getResultList();

		return lisPro;
	}

	public List<Asignatura> listEstudiante(Estudiante est) throws Exception {

		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(RegistroCurso.CREDITOS);

		q.setParameter(1, est);

		List<Asignatura> lista = q.getResultList();

		return lista;

	}

	public void registrarCurso(RegistroCurso regiCurso) throws Exception {

		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.merge(regiCurso);

		em.getTransaction().commit();

	}

	public Curso buscarCurso(String codigo) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Curso.class, codigo);
	}

	public List<RegistroCurso> listEstudianteCurso() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(RegistroCurso.LISTAR_CURSO_ESTUDIANTES);

		List<RegistroCurso> listPro = q.getResultList();

		return listPro;
	}

	public List<RegistroCurso> listaEstudiantes(String curso) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(RegistroCurso.LISTAR_ESTUDIANTES);

		q.setParameter(1, curso);

		List<RegistroCurso> listarEstudiante = q.getResultList();

		return listarEstudiante;
	}

	public List<RegistroCurso> listaTablaEstudiantes(Curso curso) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(RegistroCurso.LLENAR_TABLA_ESTUDIANTE);

		q.setParameter(1, curso);

		List<RegistroCurso> listarEstudiante = q.getResultList();

		return listarEstudiante;
	}

}
