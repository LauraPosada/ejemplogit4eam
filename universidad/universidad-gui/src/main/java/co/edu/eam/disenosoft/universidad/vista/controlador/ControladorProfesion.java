package co.edu.eam.disenosoft.universidad.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.universidad.logica.bos.BOProfesion;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Profesion;

public class ControladorProfesion {
	
	//
	private BOProfesion boProfesion;
	
	/**
	 * 
	 */
	public ControladorProfesion() {
		boProfesion = new BOProfesion();
	}
	
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Profesion> listProfesion() throws Exception{
	return	boProfesion.listProfesion();
	}

}
