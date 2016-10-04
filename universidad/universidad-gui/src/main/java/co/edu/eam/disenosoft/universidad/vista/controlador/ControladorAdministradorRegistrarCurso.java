package co.edu.eam.disenosoft.universidad.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BORegistrarCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;

public class ControladorAdministradorRegistrarCurso {
	
	private BORegistrarCurso boRegistrarCurso;
	
	public ControladorAdministradorRegistrarCurso() {
		boRegistrarCurso = new BORegistrarCurso();
	}
	
	public Estudiante buscarEst(String ced) throws Exception{
		return boRegistrarCurso.buscarEst(ced);
	}
	
	public Asignatura buscarAsig(String codigo) throws Exception{
		return boRegistrarCurso.buscarAsig(codigo);
	}
	
	public List<Curso> listCursosAsig(Asignatura se) throws Exception{
		return boRegistrarCurso.listCursosAsig(se);
	}
	
	public void registrarCurso(RegistroCurso regiCurso, Estudiante est , int creditos) throws Exception{
		boRegistrarCurso.registrarCurso(regiCurso, est, creditos);; 
	}
	
	public Curso buscarCurso(String codigo) throws Exception{
		return boRegistrarCurso.buscarCurso(codigo);
	}
	
	public int  totalCreditos (Estudiante es )throws Exception{
		return boRegistrarCurso.totalCreditos(es);
	}
	
	public List<RegistroCurso> listaEstudiantes(String curso) throws Exception{
		return boRegistrarCurso.listaEstudiantes(curso);
	}
	
	public List<RegistroCurso> listaTablaEstudiantes(Curso curso) throws Exception{
		return boRegistrarCurso.listaTablaEstudiantes(curso);
	}


}
