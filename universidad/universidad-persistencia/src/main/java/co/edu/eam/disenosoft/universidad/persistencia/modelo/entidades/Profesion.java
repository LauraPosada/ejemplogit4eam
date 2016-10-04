package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Clase que representa una profesion docente.
 * 
 * @author Laura Vanessa Posada S
 *
 */

@NamedQueries({ @NamedQuery(name=Profesion.CONSULTA_LISTAR_PROFESION, query="SELECT prof FROM Profesion prof") })

@Entity
@Table(name = "tb_profesion")
public class Profesion implements Serializable {

	/**
	 * Consulta para listar las profesiones de un docente
	 */
	public static final String CONSULTA_LISTAR_PROFESION = "Profesion.listarProfesiones";

	/**
	 * codigo de la profesion.
	 */
	@Id
	@Column(name = "codigo_prof")
	private String codigo;
	/**
	 * Nombre de la profesion.
	 */
	@Column(name = "nombre_prof")
	private String nombre;

	/**
	 * COnstructor.
	 */
	public Profesion() {
		super();
	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Profesion(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		if (!(obj instanceof Profesion)) {
			return false;
		}
		Profesion other = (Profesion) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		return true;
	}
	
	

}
