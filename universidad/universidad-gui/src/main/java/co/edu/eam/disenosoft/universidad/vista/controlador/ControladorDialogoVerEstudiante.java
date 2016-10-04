package co.edu.eam.disenosoft.universidad.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOEvaluacion;
import co.edu.eam.disenosoft.universidad.logica.bos.BORegistrarCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;

public class ControladorDialogoVerEstudiante {
	private BORegistrarCurso bo;
	private BOEvaluacion boE;
	public ControladorDialogoVerEstudiante() {
		bo = new BORegistrarCurso();
		boE = new BOEvaluacion();
	}
	public int sumaCreditosByAlumno(Estudiante estudiante) throws Exception{
		return bo.totalCreditos(estudiante);
	}
	public List<Evaluacion> listarEvaluacionesCurso(Curso curso) throws Exception{
		return boE.listEvaluacion(curso.getCodigo());
	}
	
}
