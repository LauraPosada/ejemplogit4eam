package co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;

/**
 * 
 * @author laura posada
 *
 */
public interface IRegistrarCursoDAO {

	public void registrarCurso(RegistroCurso regiCurso) throws Exception;

	public List<Curso> listCursosAsig(Asignatura codAsig) throws Exception;

	public Curso buscarCurso(String codigo) throws Exception;

	public List<Asignatura> listEstudiante(Estudiante est) throws Exception;
	
	public List<RegistroCurso> listEstudianteCurso () throws Exception;
	
	public List<RegistroCurso> listaEstudiantes(String curso) throws Exception;
	
	public List<RegistroCurso> listaTablaEstudiantes(Curso curso) throws Exception;
	

	public Asignatura buscarAsig(String codigo) throws Exception;

	public Estudiante buscarEst(String cedula) throws Exception;

}
