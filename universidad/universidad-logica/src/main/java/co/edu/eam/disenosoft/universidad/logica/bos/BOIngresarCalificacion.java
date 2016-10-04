package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IDAOIngresarCalificacion;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOIngresarCalificacionJPA;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;


public class BOIngresarCalificacion {
	private IDAOIngresarCalificacion dao;
	public BOIngresarCalificacion() {
		dao = new DAOIngresarCalificacionJPA();
	}
	/**
	 * Listar los cursos de un docente
	 * @param docente
	 * @return
	 * @throws Exception
	 */
	public List<Curso> listarCursosDocente(Docente docente) throws Exception{
		return dao.listarCursosDocente(docente);
	}
	
	public List<Evaluacion> listarCalificaciones(Curso curso) throws Exception{
		return dao.listarCalificaciones(curso);
	}
	
	
	
}
