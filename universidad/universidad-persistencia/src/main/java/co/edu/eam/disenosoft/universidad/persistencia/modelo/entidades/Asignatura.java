/**
 * 
 */
package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import co.edu.eam.disenosoft.universidad.modelo.enumeraciones.TipoAsignaturaEnum;

/**
 * Clase que representa a una asignatura.
 * @author user
 *
 */
@Entity
@Table(name="tb_asignatura")
public class Asignatura implements Serializable{

	/**
	 * Nombre de la asignatura-
	 */
	@Column(name="nombre_asig")
	private String nombre;
	/**
	 * Nombre de la asignatura
	 */
	@Id
	@Column(name="codigo_asig")
	private String codigo;
	
	/**
	 * Tipo de asignatura
	 */
	@Column(name="tipo_asig")
	@Enumerated(EnumType.STRING)
	private TipoAsignaturaEnum tipo;
	
	/**
	 * Numero de creditos asignatura.
	 */
	@Column(name="numerocreditos_asig")
	private int numeroCreditos;
	
	/**
	 * Numero de semestre de la asignatura
	 */
	@Column(name="semestre_asig")
	private int semestre;
	
	public Asignatura(){
		
	}
	
	public Asignatura(String nombre, String codigo, TipoAsignaturaEnum tipo, int numeroCreditos, int semestre) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
		this.semestre = semestre;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the tipo
	 */
	public TipoAsignaturaEnum getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoAsignaturaEnum tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the numeroCreditos
	 */
	public int getNumeroCreditos() {
		return numeroCreditos;
	}
	/**
	 * @param numeroCreditos the numeroCreditos to set
	 */
	public void setNumeroCreditos(int numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}

	/**
	 * 
	 * @return
	 */
	public int getSemestre() {
		return semestre;
	}
	
	/**
	 * 
	 * @param semestre
	 */
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	

}
