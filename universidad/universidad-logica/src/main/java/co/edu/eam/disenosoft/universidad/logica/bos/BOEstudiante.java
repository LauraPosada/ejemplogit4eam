package co.edu.eam.disenosoft.universidad.logica.bos;

import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IEstudianteDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOEstudianteJPA;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;

public class BOEstudiante {

	// Se invoca la interface
	private IEstudianteDAO dao;

	/*
	 * Constructor
	 */
	public BOEstudiante() {
		dao = new DAOEstudianteJPA();
	}

	/**
	 * crea un estudiante por medio del dao
	 * @param est el estudiante que se va a crear
	 * @throws Exception Manda un mensaje diciendo que el estudiante ya existe
	 */
	public void crearEstudiante(Estudiante est) throws Exception {

		Estudiante estudiante = dao.buscar(est.getCedula());

		if (estudiante == null) {
			dao.crear(est);
		} else {
			throw new ExcepcionNegocio("El Estudiante ya existe");
		}
	}

	/**
	 * Busca un estudiante 
	 * @param ced  cedula del estudiante que se desea buscar
	 * @return la busqueda del estudiante
	 * @throws Exception 
	 */
	public Estudiante buscarEstudiante(String ced) throws Exception {
		return dao.buscar(ced);
	}

	/**
	 * edita a un estudiante 
	 * @param est el estudiante que se desea editar
	 * @throws Exception
	 */
	public void editarEstudiante(Estudiante est) throws Exception {

		Estudiante estudiante = dao.buscar(est.getCedula());

		if (estudiante != null) {
			dao.editar(est);
		}else{
			throw new ExcepcionNegocio("El Estudiante no se encuentra "
					+ "Registrado para poder editar");
		}
	}

	/**
	 * elimina un estudiante
	 * @param cedula por la cual se va a eliminar al estudiante
	 * @throws Exception
	 */
	public void eliminar(String cedula) throws Exception {
		dao.eliminar(cedula);
	}

}
