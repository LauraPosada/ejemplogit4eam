package co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;

public interface ISesionCursoDAO {
	
	public void crear (SesionCurso sesion) throws Exception ;
	
	public SesionCurso buscar(int cod) throws Exception;
	
	public void eliminar(int codigo) throws Exception;
	
	public List<SesionCurso> listSesionCur() throws Exception;
	
	public List<SesionCurso> listaSesionDocente(Docente doc) throws Exception;
	
	
}
