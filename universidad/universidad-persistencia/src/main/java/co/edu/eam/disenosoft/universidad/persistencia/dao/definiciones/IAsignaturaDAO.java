package co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones;

import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
/**
 * 
 * @author Laura Vanessa Posada S
 *
 */
public interface IAsignaturaDAO {

	public void crear(Asignatura asig) throws Exception;
	
	public void editar (Asignatura asig) throws Exception;
	
	public void eliminar(String codigo)throws Exception;
	
	public Asignatura buscar (String codigo) throws Exception;
	
}
