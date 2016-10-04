package co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones;
import java.util.List;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;

public interface IDAOIngresarCalificacion {
	/**
	 * Listar los cursos de un docente
	 * @param docente
	 * @return
	 * @throws Exception
	 */
	public List<Curso> listarCursosDocente(Docente docente) throws Exception;
	
	public List<Evaluacion> listarCalificaciones(Curso curso) throws Exception;
}
