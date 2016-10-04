package co.edu.eam.disenosoft.universidad.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOEvaluacion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;

public class ControladorAdministradorEvaluacion {

	private BOEvaluacion boEvaluacion;
	
	public ControladorAdministradorEvaluacion() {
	boEvaluacion = new BOEvaluacion();
	}
	
	public List<Curso> listarCurso(String cod) throws Exception{
		return boEvaluacion.listarCurso(cod);
	}
	
	public void crearCalificaciones (Evaluacion evaluacion) throws Exception{
		boEvaluacion.crearCalificaciones(evaluacion);
	}
	
	public double porcentaje(String eval, double nuevoPorc) throws Exception {
		return boEvaluacion.porcentaje(eval, nuevoPorc);
	}
	
	public List<Evaluacion> listEvaluacion(String cod) throws Exception {
		return boEvaluacion.listEvaluacion(cod);
		
		}
	
	
	public void eliminarEvaluaciones (String codCurso, String nomEval) throws Exception{
		boEvaluacion.eliminarEvaluaciones(codCurso, nomEval);
	}
	
	
	public List<Evaluacion> listarCalificacion(String cedDocente) throws Exception{
		return boEvaluacion.listarCalificacion(cedDocente);
	}
	
}
