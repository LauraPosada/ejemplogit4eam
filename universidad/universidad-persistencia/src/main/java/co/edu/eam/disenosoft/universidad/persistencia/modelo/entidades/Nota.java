/**
 * 
 */
package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Clase que representa una calificacion de una evaluacion de un curso.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */


@Entity
@Table(name="tb_nota")
@IdClass(NotaPK.class)
public class Nota implements Serializable {
	
	@Id
	@Column(name="ID")
	private int idNota;
	
	/**
	 * Curso y estudiante al que pertenece esta nota.
	 */
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="cedula_estud", referencedColumnName="cedula_est"),
		@JoinColumn(name="codigo_curso", referencedColumnName="codigo_cur")
	})
	private RegistroCurso codigoCurso;
	/**
	 * Evaluacion a la que pertenece esta nota.
	 */
	
	
	@ManyToOne
	@JoinColumn(name="id_evaluacion")
	private Evaluacion evaluacion;

	/**
	 * Nota que puso el profesor.
	 */
	
	@Column(name="valor_nota")
	private double valor;

	/**
	 * bandera que indica si la nota ya fue modificada para no dejar que lo sea
	 * una vez mas.
	 */
	@Column(name="editada_nota")
	private boolean editada;
	
	

	/**
	 * Constructor
	 */
	public Nota() {
		super();
	}



	public Nota(int idNota, RegistroCurso codigoCurso, Evaluacion evaluacion, double valor, boolean editada) {
		super();
		this.idNota = idNota;
		this.codigoCurso = codigoCurso;
		this.evaluacion = evaluacion;
		this.valor = valor;
		this.editada = editada;
	}



	/**
	 * @return the idNota
	 */
	public int getIdNota() {
		return idNota;
	}



	/**
	 * @param idNota the idNota to set
	 */
	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}



	/**
	 * @return the codigoCurso
	 */
	public RegistroCurso getCodigoCurso() {
		return codigoCurso;
	}



	/**
	 * @param codigoCurso the codigoCurso to set
	 */
	public void setCodigoCurso(RegistroCurso codigoCurso) {
		this.codigoCurso = codigoCurso;
	}



	/**
	 * @return the evaluacion
	 */
	public Evaluacion getEvaluacion() {
		return evaluacion;
	}



	/**
	 * @param evaluacion the evaluacion to set
	 */
	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}



	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}



	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}



	/**
	 * @return the editada
	 */
	public boolean isEditada() {
		return editada;
	}



	/**
	 * @param editada the editada to set
	 */
	public void setEditada(boolean editada) {
		this.editada = editada;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
		return result;
	}



	/* (non-Javadoc)
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
		if (!(obj instanceof Nota)) {
			return false;
		}
		Nota other = (Nota) obj;
		if (codigoCurso == null) {
			if (other.codigoCurso != null) {
				return false;
			}
		} else if (!codigoCurso.equals(other.codigoCurso)) {
			return false;
		}
		return true;
	}

	




}
