package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IDocenteDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.ISesionCursoDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAODocenteJPA;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOSesionCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;

public class BOSesionCurso {

	private ISesionCursoDAO daoSesion;
	private IDocenteDAO daoDocente;

	public BOSesionCurso() {
		daoSesion = new DAOSesionCurso();
		daoDocente = new DAODocenteJPA();
	}

	/**
	 * 
	 * @param s
	 * @throws Exception
	 */
	public void crear(SesionCurso s) throws Exception {

		List<SesionCurso> sesion = daoSesion.listaSesionDocente(s.getCurso().getDocente());

		boolean entro = false;
		
		for (int i = 0; i < sesion.size(); i++) {

			System.out.println(s.getHoraInicio()+"inicio");
			System.out.println(s.getHoraFinal()+"Final");
			System.out.println(s.getCurso().getDocente().getCedula()+"DOCENTE");

			if (s.getCurso().getDocente().getCedula().equals(sesion.get(i).getCurso().getDocente().getCedula()) && 
					s.getDia().equals(sesion.get(i).getDia()) && s.getHoraInicio() >= sesion.get(i).getHoraInicio()
					&& s.getHoraInicio() < sesion.get(i).getHoraFinal()) {

				System.out.println("Entro!!!!");
				entro = true;
				
			}
		}if(entro == true){
			throw new ExcepcionNegocio("El docente ya tiene un curso asignado en este bloque de horas");
		} else {
			daoSesion.crear(s);
		}

	}
	

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<SesionCurso> listSesionesCur() throws Exception {
		List<SesionCurso> ses = daoSesion.listSesionCur();
		return ses;
	}
	

	/**
	 * 
	 * @param codigo
	 * @throws Exception
	 */
	public void eliminar(int codigo) throws Exception{
		daoSesion.eliminar(codigo);
	}

}
