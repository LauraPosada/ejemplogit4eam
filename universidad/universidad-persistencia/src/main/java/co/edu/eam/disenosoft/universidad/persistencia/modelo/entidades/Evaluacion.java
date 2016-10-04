/**
 * 
 */
package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Clase que representa la evaluacion de un curso.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
@NamedQueries({
		@NamedQuery(name = Evaluacion.PORCENTAJE, query = "SELECT e FROM Evaluacion e  JOIN e.codigo cu WHERE cu.codigo=?1"),
		@NamedQuery(name = Evaluacion.LISTAR_EVALUACIONES_NOMBRE, query = "SELECT e FROM Evaluacion e JOIN e.codigo cu WHERE cu.codigo =?1 AND e.nombre =?2"),
		@NamedQuery(name = Evaluacion.LISTA_CALIFICACIONES , query = "SELECT e FROM Evaluacion e  WHERE e.codigo =?1")
})

@Entity
@Table(name = "tb_evalucion")
public class Evaluacion implements Serializable {

	public static final String PORCENTAJE = "Evaluacion.porcentajeEvaluaciones";

	public static final String LISTAR_EVALUACIONES_NOMBRE = "Evaluacion.listarEvaluacionesNombres";
	
	public static final String LISTA_CALIFICACIONES = "Evaluacion.listarCursoDocente";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int idEvaluacion;

	/**
	 * Curso al que pertenece esta evaluacion.
	 */
	@ManyToOne
	@JoinColumn(name = "codigo_curso", nullable = false)
	private Curso codigo;

	/**
	 * Nombre de la evaluacion;
	 */
	@Column(name = "nombre_evual", nullable = false)
	private String nombre;

	/**
	 * Porcentaje que vale esta evaluacion dentro del curso.
	 */
	@Column(name = "porcentaje_eval", nullable = false)
	private double porcentaje;

	/**
	 * Constructor.
	 */
	public Evaluacion() {
		super();
	}

	public Evaluacion(int idEvaluacion, Curso codigo, String nombre, double porcentaje) {
		super();
		this.idEvaluacion = idEvaluacion;
		this.codigo = codigo;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	/**
	 * @return the idEvaluacion
	 */
	public int getIdEvaluacion() {
		return idEvaluacion;
	}

	/**
	 * @param idEvaluacion
	 *            the idEvaluacion to set
	 */
	public void setIdEvaluacion(int idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}

	/**
	 * @return the codigo
	 */
	public Curso getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(Curso codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the porcentaje
	 */
	public double getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje
	 *            the porcentaje to set
	 */
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + idEvaluacion;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Evaluacion)) {
			return false;
		}
		Evaluacion other = (Evaluacion) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (idEvaluacion != other.idEvaluacion) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre;
	}
	
	

}
