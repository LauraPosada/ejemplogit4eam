package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IVerRegistrarEstudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOVerRegistrarEstudiante implements IVerRegistrarEstudiante{

	public List<RegistroCurso> listarRegistroEstudiante(String ced) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(RegistroCurso.REGISTRO_ESTUDIANDO);

		q.setParameter(1, ced);

		List<RegistroCurso> lista = q.getResultList();
		
		return lista;
	}

	public void elminarResgistroEsttudiante(Estudiante ced, String nombre) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		Query q = em.createNamedQuery(RegistroCurso.BUSCA_REGISTRO_ESTUDIANTE);
		q.setParameter(1, ced);
		q.setParameter(2, nombre);
		List<RegistroCurso> lista = q.getResultList();
		RegistroCurso reg = lista.get(0);
		em.remove(reg);
		em.getTransaction().commit();
		
	}

	
	
}
