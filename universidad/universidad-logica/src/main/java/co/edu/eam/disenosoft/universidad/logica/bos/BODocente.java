package co.edu.eam.disenosoft.universidad.logica.bos;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IDocenteDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAODocenteJPA;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;

public class BODocente {
	
	// se invoca la interface
	private IDocenteDAO daoDocente;
	
	/**
	 * Constructor
	 */
	public BODocente() {
		daoDocente = new DAODocenteJPA();
	}
	
	/**
	 * crea un docente por medio del dao
	 * @param docente que se va a crear
	 * @throws Exception Manda un mensaje diciendo que el docente ya se
	 * encuentra registrado
	 */
	public void crearDocente(Docente docente) throws Exception{
		Docente doc = daoDocente.buscar(docente.getCedula());
		
		if(doc == null){
			daoDocente.crear(docente);
		}else{
			throw new ExcepcionNegocio("El docente ya se encuentra registrado");
		}
	}
	
	/**
	 * Busca un docente 
	 * @param ced cedula del docente que se desea buscar
	 * @return la busqueda del docente
	 * @throws Exception
	 */
	public Docente buscarDocente(String ced) throws Exception{
		return daoDocente.buscar(ced);
	}
	
	
	/**
	 * edita a un docente 
	 * @param docente el docente que se desea editar
	 * @throws Exception
	 */
	public void editar(Docente docente) throws Exception {
		
		Docente doc = daoDocente.buscar(docente.getCedula());
		
		if(doc != null){
			daoDocente.editar(docente);
		}else{
			throw new ExcepcionNegocio("El Docente no se encuentra "
					+ "Registrado para poder editar");
		}
		
	}
	
	/**
	 * elimina un docente
	 * @param cedula por la cual se va a eliminar al docente
	 * @throws Exception
	 */
	public void eliminar(String cedula) throws Exception{
		daoDocente.eliminar(cedula);
	}

}
