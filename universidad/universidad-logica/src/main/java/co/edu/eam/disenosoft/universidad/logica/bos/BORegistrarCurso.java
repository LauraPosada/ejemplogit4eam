package co.edu.eam.disenosoft.universidad.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IEstudianteDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.definiciones.IRegistrarCursoDAO;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAOEstudianteJPA;
import co.edu.eam.disenosoft.universidad.persistencia.dao.implementacion.jpa.DAORegistrarCursoJPA;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.RegistroCurso;
import co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades.SesionCurso;
import co.edu.eam.ingesoft.desarrollo.logica.excepciones.ExcepcionNegocio;

public class BORegistrarCurso {

	private IRegistrarCursoDAO daoRegistrar;
	private IEstudianteDAO daoEs;

	public BORegistrarCurso() {
		daoRegistrar = new DAORegistrarCursoJPA();
		daoEs = new DAOEstudianteJPA();
	}

	public Estudiante buscarEst(String ced) throws Exception {
		return daoRegistrar.buscarEst(ced);
	}

	public Asignatura buscarAsig(String codigo) throws Exception {
		
		return daoRegistrar.buscarAsig(codigo);
	}

	public List<Curso> listCursosAsig(Asignatura codAsig) throws Exception {
		return daoRegistrar.listCursosAsig(codAsig);
	}
	
	
	public int  totalCreditos (Estudiante es )throws Exception{
		List<Asignatura> creditos = daoRegistrar.listEstudiante(es);
		
		int total = 0;
		
		for(int i =0; i<creditos.size() ; i++){
			total += creditos.get(i).getNumeroCreditos();
		}
		
		return total;
	}
	
	
	public void registrarCurso(RegistroCurso regiCurso, Estudiante est , int creditos) throws Exception{
		
		List<Asignatura> cred = daoRegistrar.listEstudiante(est);
		List<RegistroCurso> lisRegistroCurso = daoRegistrar.listEstudianteCurso();
		
		int total =0;
		int sumar= 0;
		int totalEstudiante = 0;
		boolean validarCursoActual = false;
		
		for(int i =0;i<cred.size();i++){
			total += cred.get(i).getNumeroCreditos();
			sumar = total + creditos;
		}
		
		for(int j =0;j<cred.size();j++){
			if(lisRegistroCurso.get(j).getCurso().getCodigo().equals(regiCurso.getCurso().getCodigo())){
				if(totalEstudiante <= 4){
					totalEstudiante++;
				
				}else{
					throw new ExcepcionNegocio("El curso ya se encuentra lleno");
			}
		}
		}
		
		for(int l =0;l<cred.size();l++){
			String veriCodigo = lisRegistroCurso.get(l).getCurso().getAsignatura().getCodigo();
			String entra = regiCurso.getCurso().getAsignatura().getCodigo();
			
			String estudiante = lisRegistroCurso.get(l).getEstudiante().getCedula();
			String estudianteEntrada = est.getCedula();
			
			if(veriCodigo.equals(entra) && estudiante.equals(estudianteEntrada)){
				validarCursoActual= true;
				throw new ExcepcionNegocio("El estudiante ya tiene registrada esta asignatura");
			}
		}
		
		if(sumar <13 && totalEstudiante <4 && validarCursoActual == false){
			daoRegistrar.registrarCurso(regiCurso);
		}else{
			throw new Exception("El estudiante ya no puede registrar mas creditos");
		}

				
	}
	
	public Curso buscarCurso(String codigo) throws Exception{
		return daoRegistrar.buscarCurso(codigo);
	}
	
	public List<RegistroCurso> listaEstudiantes(String curso) throws Exception{
		return daoRegistrar.listaEstudiantes(curso);
	}
	
	public List<RegistroCurso> listaTablaEstudiantes(Curso curso) throws Exception{
		return daoRegistrar.listaTablaEstudiantes(curso);
	}


}
