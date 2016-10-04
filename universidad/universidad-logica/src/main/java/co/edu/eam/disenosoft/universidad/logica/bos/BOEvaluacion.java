package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IDocenteDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IEvaluacionAdministrarDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAODocenteJPA;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOEvaluacionAdministrarJPA;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;

public class BOEvaluacion {

	private IEvaluacionAdministrarDAO daoEvaluacion;
	private IDocenteDAO daoDocente;

	public BOEvaluacion() {
		daoEvaluacion = new DAOEvaluacionAdministrarJPA();
		daoDocente = new DAODocenteJPA();
	}

	public List<Curso> listarCurso(String cod) throws Exception {
		return daoEvaluacion.listarCurso(cod);
	}

	public void crearCalificaciones(Evaluacion evaluacion) throws Exception {
		daoEvaluacion.crearCalificaciones(evaluacion);
	}

	public double porcentaje(String eval, double nuevoPorc) throws Exception {
		List<Evaluacion> obtenerPo = daoEvaluacion.obtenerPorcentaje(eval);

		double total = 0.0;

		double falta = 100.0 - nuevoPorc;

		for (int i = 0; i < obtenerPo.size(); i++) {
			if (obtenerPo.get(i).getCodigo().getCodigo().equals(eval)) {
				total += obtenerPo.get(i).getPorcentaje();
			}

		}

		double sin = falta - total;
		
		if(sin <= 0){
			throw new ExcepcionNegocio("No es posible registrar mas porcentajess de notas");
		}
		
		return  sin;
		}

	
	public List<Evaluacion> listEvaluacion(String cod) throws Exception {
	return daoEvaluacion.obtenerPorcentaje(cod);
	
	}
	
	public void eliminarEvaluaciones (String codCurso, String nomEval) throws Exception{
		daoEvaluacion.eliminarEvaluaciones(codCurso, nomEval);
	}
	
	
	
	
	public List<Evaluacion> listarCalificacion(String cedDocente) throws Exception{
		return daoEvaluacion.listarCalificacion(cedDocente);
	}
}
