package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.Table;

/**
 * Clase que reprenta un curso registrado por un estudiante.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */

@NamedQueries({
	@NamedQuery(name=RegistroCurso.CREDITOS,query="SELECT asig FROM RegistroCurso reg  JOIN reg.curso cu JOIN cu.asignatura asig WHERE reg.estudiante=?1"),
	@NamedQuery(name= RegistroCurso.LISTAR_CURSO_ESTUDIANTES,query="SELECT r FROM RegistroCurso r "),
@NamedQuery(name=RegistroCurso.REGISTRO_ESTUDIANDO, query="SELECT r FROM RegistroCurso r  JOIN r.estudiante e WHERE e.cedula=?1 "),
@NamedQuery(name = RegistroCurso.BUSCA_REGISTRO_ESTUDIANTE, query = "SELECT r FROM RegistroCurso r JOIN r.curso cu JOIN cu.asignatura a WHERE r.estudiante =?1 AND a.nombre=?2"),
@NamedQuery(name=RegistroCurso.LISTAR_ESTUDIANTES, query = "SELECT r FROM RegistroCurso r JOIN r.curso c WHERE c.codigo=?1"),
@NamedQuery(name=RegistroCurso.LLENAR_TABLA_ESTUDIANTE, query = "SELECT r FROM RegistroCurso r WHERE r.curso=?1"),
@NamedQuery(name = RegistroCurso.NOTAS, query="SELECT r FROM RegistroCurso r WHERE r.notas=?1")

})

@Entity
@Table(name="tb_registrocurso")
@IdClass(RegistroCursoPK.class)
public class RegistroCurso implements Serializable {
	
	
	/**
	 *  consulta creditos que tiene registrado un estudiante
	 */
	public static final String CREDITOS = "RegistroCurso.listEstudiante";
	
	/**
	 * lista
	 */
	public static final String LISTAR_CURSO_ESTUDIANTES= "RegistroCurso.listarCursoEs";
	
	public static final String REGISTRO_ESTUDIANDO = "RegistroCurso.listarRegistro";
	
	public static final String BUSCA_REGISTRO_ESTUDIANTE = "RegistroCurso.eliminarRegistroAsig";
	
	public static final String LISTAR_ESTUDIANTES = "RegistroCurso.listarEstudiantes";
	
	public static final String LLENAR_TABLA_ESTUDIANTE = "RegistroCurso.llenarTablaEstudiante";
	
	public static final String NOTAS = "Nota.notaEvaluacion";

	/**
	 * Estudiante que registro el curso.
	 */
	@Id
	@ManyToOne
	@JoinColumn(name="cedula_est")
	private Estudiante estudiante;

	/**
	 * Curso que registro el estudiante.
	 */
	@Id
	@ManyToOne
	@JoinColumn(name="codigo_cur")	
	private Curso curso;

	/**
	 * Notas que el estudiante tiene registradas en este curso.
	 */
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="codigoCurso",orphanRemoval=true)
	private List<Nota> notas;

	public RegistroCurso() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param estudiante
	 * @param curso
	 * @param notas
	 */
	public RegistroCurso(Estudiante estudiante, Curso curso, List<Nota> notas) {
		super();
		this.estudiante = estudiante;
		this.curso = curso;
		//this.notas = notas;
	}

	/**
	 * @return the estudiante
	 */
	public Estudiante getEstudiante() {
		return estudiante;
	}

	/**
	 * @param estudiante
	 *            the estudiante to set
	 */
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso
	 *            the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	/**
	 * @return the notas
	 */
	
	public List<Nota> getNotas() {
		return notas;
	}

	/**
	 * @param notas
	 *            the notas to set
	 */
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

}
