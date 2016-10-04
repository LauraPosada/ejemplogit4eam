package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name=Curso.CONSULTA_TABLA_ASIGNATURA,query="SELECT c FROM Curso c JOIN c.asignatura asig  WHERE asig=?1"),
	@NamedQuery(name = Curso.CONSULTA_CARGAR_COMBO , query = "SELECT c FROM Curso c JOIN c.asignatura a WHERE a.codigo=?1"),
	@NamedQuery(name = Curso.CURSOS_DOCENTE , query = "SELECT c FROM Curso c WHERE c.docente=?1")

})

@Entity
@Table(name="tb_curso")
public class Curso implements Serializable {

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return codigo;
	}

	public static final String CONSULTA_TABLA_ASIGNATURA = "Curso.listCursosAsig";
	
	public static final String CONSULTA_CARGAR_COMBO = "Curso.llenarCombo";
	/**
	 * Consulta para listar los cursos de un docente
	 */
	public static final String CURSOS_DOCENTE = "Curso.cursosDocente";
	
	
	
	/**
	 * Codigo del curso. el codigo se forma con el codigo de la
	 * asignatura+a�o+semestre del a�o (I o II)
	 */
	@Id
	@Column(name="codigo_curso",length=50)
	private String codigo;
	

	@ManyToOne
	@JoinColumn(name="cedula_docente")
	private Docente docente;

	/**
	 * Asignatura de este curso.
	 */
	@ManyToOne
	@JoinColumn(name="codigo_asignatura",nullable=false)
	private Asignatura asignatura;
	

	/**
	 * Sesiones del curso. las sesiones son los dias en que los estudiantes y el
	 * profesor se encuentran para la clase.
	 */

	@OneToMany(cascade= CascadeType.ALL, fetch= FetchType.LAZY, orphanRemoval= true, mappedBy="curso")
	private List<SesionCurso> sesiones;
	
	/**
	 * Estudiantes registrados en este curso.
	 */
	
//	@OneToMany(cascade= CascadeType.ALL, fetch= FetchType.LAZY, orphanRemoval= true, mappedBy="estudiante")
//	private List<RegistroCurso> estudiantes;
	
	/**
	 * Evaluaciones del curso.
	 */
//	@OneToMany(cascade= CascadeType.ALL, fetch= FetchType.LAZY, orphanRemoval= true, mappedBy="codigo")
//	private List<Evaluacion> evaluaciones;
	
	/**
	 * Constructor.
	 */
	public Curso() {
		super();
	}
	
	/**
	 * Constructor.
	 * 
	 * @param codigo
	 * @param docente
	 * @param asignatura
	 */
	public Curso(String codigo, Docente docente, Asignatura asignatura) {
		super();
		this.codigo = codigo;
		this.docente = docente;
		this.asignatura = asignatura;
	}

	

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the docente
	 */
	public Docente getDocente() {
		return docente;
	}

	/**
	 * @param docente
	 *            the docente to set
	 */
	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	/**
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura
	 *            the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @return the sesiones
	 */
  	public List<SesionCurso> getSesiones() {
		return sesiones;
	}

	/**
	 * @param sesiones the sesiones to set
	 */
	public void setSesiones(List<SesionCurso> sesiones) {
		this.sesiones = sesiones;
	}

	/**
	 * @return the estudiantes
	 */
//	public List<RegistroCurso> getEstudiantes() {
//		return estudiantes;
//	}
//
//	/**
//	 * @param estudiantes the estudiantes to set
//	 */
//	public void setEstudiantes(List<RegistroCurso> estudiantes) {
//		this.estudiantes = estudiantes;
//	}
//
//	/**
//	 * @return the evaluaciones
//	 */
//	public List<Evaluacion> getEvaluaciones() {
//		return evaluaciones;
//	}
//
//	/**
//	 * @param evaluaciones the evaluaciones to set
//	 */
//	public void setEvaluaciones(List<Evaluacion> evaluaciones) {
//		this.evaluaciones = evaluaciones;
//	}

}
