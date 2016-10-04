package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IDocenteDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IProfesionDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOProfesionJPA;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Profesion;

public class BOProfesion {
	
	private IProfesionDAO daoProfesion;
	private IDocenteDAO daoDocente;
	
	public BOProfesion() {
		daoProfesion = new DAOProfesionJPA();
	}
	
	public List<Profesion> listProfesion() throws Exception{
		
		
		
		List<Profesion> pro = daoProfesion.listProfesion();
		
		return pro;
		
	}

}
