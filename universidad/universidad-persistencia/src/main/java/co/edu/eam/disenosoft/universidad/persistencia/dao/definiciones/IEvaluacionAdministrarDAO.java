package co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;

public interface IEvaluacionAdministrarDAO {
	
	public List<Curso> listarCurso (String cod) throws Exception;
	
	public void crearCalificaciones (Evaluacion evaluacion) throws Exception;
	
	public List<Evaluacion> obtenerPorcentaje (String porcentaje) throws Exception;
	
	public void eliminarEvaluaciones (String codCurso, String nomEval) throws Exception;
	
	
	public List<Evaluacion> listarCalificacion (String cedDocente) throws Exception;
	

	
	

}
