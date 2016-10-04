package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import co.edu.eam.disenosoft.universidad.modelo.enumeraciones.DiaEnum;

/**
 * Clase que representa una sesion de un curso.
 * @author Camilo Andres Ferrer Bustos.
 *
 */

@NamedQueries({
	@NamedQuery(name=SesionCurso.CONSULTA_LISTAR_SESIONES, query="SELECT s FROM SesionCurso s "),
	@NamedQuery(name= SesionCurso.CONSULTA_LISTAR_DOCENTE,query="SELECT s FROM SesionCurso s JOIN s.curso c WHERE c.docente=?1"),
		
})

@Entity
@Table(name="tb_sesioncurso")
public class SesionCurso implements Serializable{

	public static final String CONSULTA_LISTAR_SESIONES = "Curso.listarSesiones";
	public static final String CONSULTA_LISTAR_DOCENTE = "SesionCurso.listarSesionesDocente";
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private int idSesionCurso;
	
	/**
	 * Curso de la sesion.
	 */
	@ManyToOne
	@JoinColumn(name="codigo_curso", nullable= false)
	private Curso curso;

	/**
	 * Dia de la sesion.
	 */
	@Enumerated(EnumType.STRING)
	private DiaEnum dia;

	/**
	 * Hora en que empieza una sesion.
	 */
	@Column(name="horainicio_sesion", nullable=false)
	private int horaInicio;

	/**
	 * Hora en que termina la sesion.
	 */
	@Column(name="horafinal_sesion",nullable=false)
	private int horaFinal;

	/**
	 * Cosntructor.
	 */
	public SesionCurso() {
		super();
	}

	public SesionCurso( Curso curso, DiaEnum dia, int horaInicio, int horaFinal) {
		super();
		this.curso = curso;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
	}
	
	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the dia
	 */
	public DiaEnum getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(DiaEnum dia) {
		this.dia = dia;
	}

	/**
	 * @return the horaInicio
	 */
	public int getHoraInicio() {
		return horaInicio;
	}

	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * @return the horaFinal
	 */
	public int getHoraFinal() {
		return horaFinal;
	}

	/**
	 * @param horaFinal the horaFinal to set
	 */
	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}

	/**
	 * @return the idSesionCurso
	 */
	public int getIdSesionCurso() {
		return idSesionCurso;
	}

	/**
	 * @param idSesionCurso the idSesionCurso to set
	 */
	public void setIdSesionCurso(int idSesionCurso) {
		this.idSesionCurso = idSesionCurso;
	}
	
	

}
