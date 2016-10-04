/**
 * 
 */
package co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones;

import java.util.ArrayList;
import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Profesion;

/**
 * @author Laura Vanessa Posada S
 *clase interfaz de doente que nos permite hacer el crud  por separado
 */
public interface IDocenteDAO {
	
	public void crear(Docente docente) throws Exception;
	
	public void editar (Docente docente) throws Exception;
	
	public void eliminar(String cedula)throws Exception;
	
	public Docente buscar (String ced) throws Exception;
	
	public List<Docente> listarDocente();
	
}
