package co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;

public interface ICursoDAO {
	
	public void crear (Curso curso) throws Exception;
	
	public void edita (Curso curso) throws Exception;
	
	public Curso buscar (String curso) throws Exception;
	
	

}
