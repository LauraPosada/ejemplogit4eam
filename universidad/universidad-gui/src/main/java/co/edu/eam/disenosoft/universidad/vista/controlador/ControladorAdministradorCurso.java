package co.edu.eam.disenosoft.universidad.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOCrearCurso;
import co.edu.eam.disenosoft.universidad.logica.bos.BOSesionCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;

public class ControladorAdministradorCurso {
	
	private BOCrearCurso boCrearCurso;
	private BOSesionCurso boSesion;
	
	public ControladorAdministradorCurso() {
		boCrearCurso = new BOCrearCurso();
		boSesion = new BOSesionCurso();
	}
	
	public Curso buscar(String codigo) throws Exception{
		return boCrearCurso.buscar(codigo);
	}
	
	public void crear(Curso curso) throws Exception{
		
		boCrearCurso.crear(curso);
	}
	
	public void crear (SesionCurso sesion) throws Exception{
		boSesion.crear(sesion);
	}
	
	public List<SesionCurso> listSesiones() throws Exception{
		return boSesion.listSesionesCur();
	}
	
	public void eliminar(int codigo) throws Exception{
		boSesion.eliminar(codigo);
	}
	
	

}
