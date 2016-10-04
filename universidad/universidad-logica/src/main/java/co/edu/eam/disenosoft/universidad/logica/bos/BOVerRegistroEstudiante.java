package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IRegistrarCursoDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IVerRegistrarEstudiante;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAORegistrarCursoJPA;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOVerRegistrarEstudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;

public class BOVerRegistroEstudiante {

	private IVerRegistrarEstudiante daoRegistrar;
	

	public BOVerRegistroEstudiante() {
		daoRegistrar = new DAOVerRegistrarEstudiante();
	}
	
	public List<RegistroCurso> listarRegistroEstudiante (String ced) throws Exception{
		return daoRegistrar.listarRegistroEstudiante(ced);
	}
	
	public void elminarResgistroEsttudiante(Estudiante ced, String nombre) throws Exception{
		daoRegistrar.elminarResgistroEsttudiante(ced, nombre);
	}


	
}
