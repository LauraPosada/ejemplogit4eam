package co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones;

import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
/**
 * 
 * @author Laura Vanessa Posada S
 *clase interfaz de estudiante que nos permite hacer el crud  por separado
 */
public interface IEstudianteDAO {

	public void crear(Estudiante t) throws Exception;

	public void editar(Estudiante t) throws Exception;

	public void eliminar(String cedula) throws Exception;

	public Estudiante buscar(String ced) throws Exception;

}
