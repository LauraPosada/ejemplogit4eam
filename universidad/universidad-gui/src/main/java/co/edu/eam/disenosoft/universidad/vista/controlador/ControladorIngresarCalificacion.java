package co.edu.eam.disenosoft.universidad.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOIngresarCalificacion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;

public class ControladorIngresarCalificacion {
	/*
	 * Controlador encargada de las operaciones de la ventana ingresar calificaciones
	 */
	private BOIngresarCalificacion bo;
	public ControladorIngresarCalificacion() {
		bo = new BOIngresarCalificacion();
	}
	/**
	 * Listamos los cursos de un docente
	 * @param docente
	 * @return
	 */
	public List<Curso> listarCursosDocente(Docente docente) throws Exception{
		return bo.listarCursosDocente(docente);
	}
	
	public List<Evaluacion> listarCalificaciones(Curso curso) throws Exception{
		return bo.listarCalificaciones(curso);
	}
}
