package co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.sql.Select;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IProfesionDAO;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.disenosoft.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAOProfesionJPA implements IProfesionDAO {

	public List<Profesion> listProfesion() throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		Query q = em.createNamedQuery(Profesion.CONSULTA_LISTAR_PROFESION);
		
		
		List<Profesion> lisPro = q.getResultList();
		
		return lisPro;
	}

}
