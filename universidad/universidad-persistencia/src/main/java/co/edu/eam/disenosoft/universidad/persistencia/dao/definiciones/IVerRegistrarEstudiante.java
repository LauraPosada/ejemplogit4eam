package co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;

public interface IVerRegistrarEstudiante {
	
	public List<RegistroCurso> listarRegistroEstudiante (String ced) throws Exception;
	
	public void elminarResgistroEsttudiante(Estudiante ced, String nombre) throws Exception;

}
