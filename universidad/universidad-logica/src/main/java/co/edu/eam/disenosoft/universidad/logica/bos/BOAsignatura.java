package co.edu.eam.disenosoft.universidad.logica.bos;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IAsignaturaDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOAsignaturaJPA;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;

public class BOAsignatura {

	// se invoca la interface
	private IAsignaturaDAO daoAsig;

	/**
	 * constructor
	 */
	public BOAsignatura() {
		daoAsig = new DAOAsignaturaJPA();
	}

	/**
	 * crea una Asignatura por medio del dao
	 * 
	 * @param asig
	 *            Asignatura que se va a crear
	 * @throws Exception
	 *             Manda un mensaje diciendo que la Asignatura ya existe
	 */
	public void crear(Asignatura asig) throws Exception {

		Asignatura asi = daoAsig.buscar(asig.getCodigo());

		if (asi == null) {
			daoAsig.crear(asig);
		} else {
			throw new ExcepcionNegocio(" La Asignatura ya existe");
		}

	}

	/**
	 * Busca una Asignatura
	 * 
	 * @param codigo
	 *            por la cual se busca la asignatura
	 * @return la busquedda de la asignatura
	 * @throws Exception
	 */
	public Asignatura buscar(String codigo) throws Exception {
		return daoAsig.buscar(codigo);
	}

	/**
	 * edita una Asiganatura
	 * 
	 * @param asig
	 *            la asignatura que desea ser editada
	 * @throws Exception
	 */
	public void editar(Asignatura asig) throws Exception {

		Asignatura asi = daoAsig.buscar(asig.getCodigo());

		if (asi != null) {
			daoAsig.editar(asig);
		} else {
			throw new ExcepcionNegocio("La asignatura no se encuentra " + "Registrada para poder editar");
		}

	}

	/**
	 * Elimina una asignatura
	 * 
	 * @param codigo
	 *            de la asignatura que se desea eliminar
	 * @throws Exception
	 */
	public void eliminar(String codigo) throws Exception {
		daoAsig.eliminar(codigo);
	}

}
