package co.edu.eam.disenosoft.universidad.vista.controlador;

import co.edu.eam.disenosoft.universidad.logica.bos.BOAsignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;

public class ControladorAdministradorAsignatura {

	// se llama la clase
	private BOAsignatura boAsignatura;
	
	// constructor
	public ControladorAdministradorAsignatura() {
		boAsignatura = new BOAsignatura();
	}
	
	/**
	 * Busca a una asignatura recibiendo el codigo de la asignatura 
	 * a partir de  BOAsignatura
	 * @param codigo por el cual la asignatura  es buscada 
	 * @return los datos encontrados de la asignatura buscada
	 * @throws Exception
	 */
	public Asignatura buscar (String codigo) throws Exception{
		return boAsignatura.buscar(codigo);
	}
	
	/**
	 * Crea una asignatura recibiendo sus datos desde el BOAsignatura
	 * @param asig asignatura que va hacer creada
	 * @throws Exception
	 */
	public void crear(Asignatura asig) throws Exception{
		boAsignatura.crear(asig);
	}
	
	/**
	 * Edita una asignatura a partir de recibir su codigo
	 * de la clase BOAsignatura
	 * @param asig asignatura que va hacer editada
	 * @throws Exception
	 */
	public void editar (Asignatura asig) throws Exception{
		boAsignatura.editar(asig);
	}
	
	/**
	 * elimina una asignatura
	 * @param codigo de la asignatura que se desea eliminar
	 * @throws Exception
	 */
	public void eliminar(String codigo)throws Exception{
		boAsignatura.eliminar(codigo);
	}
	
	
}
