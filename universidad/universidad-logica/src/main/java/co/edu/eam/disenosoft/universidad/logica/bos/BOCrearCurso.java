package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.ICursoDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOCursoJPA;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOSesionCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;

public class BOCrearCurso {
	
	// se invoca la interface
	private ICursoDAO daoCrearCurso;
	
	/**
	 * constructor
	 */
	public BOCrearCurso() {
		daoCrearCurso =new DAOCursoJPA();
	}

	/**
	 * Crea un curso por medio del DAO
	 * @param curso el cuerso que se desea crear 
	 * @throws Exception
	 */
	public void crear(Curso curso) throws Exception{
	
		Curso cur = daoCrearCurso.buscar(curso.getCodigo());
		
		if(cur == null){
			daoCrearCurso.crear(curso);
		} else {
			throw new ExcepcionNegocio(" El Curso ya existe");
		}
		
	}
	
	/**
	 * Busca un curso
	 * @param codigo por el cual se va a bscar el curso 
	 * @return la busqeda del curso
	 * @throws Exception
	 */
	public Curso buscar(String codigo) throws Exception{
		return daoCrearCurso.buscar(codigo);
	}
	
	

}
