package co.edu.eam.disenosoft.universidad.vista.controlador;

import co.edu.eam.disenosoft.universidad.logica.bos.BODocente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;

public class ControladorAdministrarDocente {
	
	// Se llama la clase de la logica
	private BODocente boDocente;
	
	/**
	 * Constructor
	 */
	public ControladorAdministrarDocente() {
		boDocente = new BODocente();
	}
	
	/**
	 * Busca a un docente recibiendo la cedula del docente 
	 * a partir de  BODocente
	 * @param ced cedula por el cual el docente es buscado 
	 * @return los datos del docente encontrado
	 * @throws Exception
	 */
	public Docente buscarDocente(String ced) throws Exception{
		return boDocente.buscarDocente(ced);
	}
	
	/**
	 * Crea un docente recibiendo sus datos desde el BODocente
	 * @param docente  que va ha hacer creado
	 * @throws Exception
	 */
	public void crearDocente(Docente docente) throws Exception{
		boDocente.crearDocente(docente);
	}
	
	/**
	 * edita un docente a partir de recibir su cedula 
	 * de la clase BODocente
	 * @param docente docente que va a ser editado
	 * @throws Exception
	 */
	public void editar(Docente docente) throws Exception{
		boDocente.editar(docente);
	}
	
	/**
	 * Se elimina un docente
	 * @param cedula de docente que desea ser eliminado
	 * @throws Exception
	 */
	public void eliminar(String cedula) throws Exception{
		boDocente.eliminar(cedula);
	}
	

}
