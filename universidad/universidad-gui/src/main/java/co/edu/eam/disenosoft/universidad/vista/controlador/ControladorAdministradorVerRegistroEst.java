package co.edu.eam.disenosoft.universidad.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOVerRegistroEstudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorAdministradorVerRegistroEst {
	
	private BOVerRegistroEstudiante boVerRegistroEst;
	
	public ControladorAdministradorVerRegistroEst() {
		boVerRegistroEst = new BOVerRegistroEstudiante();
	}
	
	public List<RegistroCurso> listarRegistroEstudiante(String ced) throws Exception{
		return boVerRegistroEst.listarRegistroEstudiante(ced);
	}
	
	public void elminarResgistroEsttudiante(Estudiante ced, String nombre) throws Exception{
		boVerRegistroEst.elminarResgistroEsttudiante(ced, nombre);
	}

}
