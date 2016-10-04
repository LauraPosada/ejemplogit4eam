package co.edu.eam.disenosoft.universidad.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOEstudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;

public class ControladorAdministradorEstudiante {
	
	// se llama la clase 
	private BOEstudiante boEstudiante;
	
	/**
	 * Constructor
	 */
	public ControladorAdministradorEstudiante(){
		boEstudiante = new BOEstudiante();
	}
	
	/**
	 * Busca a un estudiante recibiendo la cedula del estudiante 
	 * a partir de  BOEstudiante
	 * @param ced cedula por el cual el estudiante es buscado 
	 * @return los datos del estudiante encontrado
	 * @throws Exception
	 */
	public Estudiante buscarEstudiante(String ced) throws Exception{
		return boEstudiante.buscarEstudiante(ced);
	}
	
	/**
	 *  Crea un estudiante recibiendo sus datos desde el BOestudiante
	 * @param est el estudiante que va ha hacer creado
	 * @throws Exception
	 */
	public void crearEstudiante(Estudiante est ) throws Exception{
		boEstudiante.crearEstudiante(est);
	}
	
	/**
	 * edita un estudiante a partir de recibir su cedula 
	 * de la clase BOEstudiante
	 * @param est estudiante que va a ser editado
	 * @throws Exception
	 */
	public void editarEstudiante( Estudiante est) throws Exception{
		boEstudiante.editarEstudiante(est);
	}
	
	/**
	 * Se elimina un estudiante 
	 * @param cedula de estudiante que desea ser eliminado
	 * @throws Exception
	 */
	public void eliminar(String cedula) throws Exception {
		boEstudiante.eliminar(cedula);
	}
	
	

}
