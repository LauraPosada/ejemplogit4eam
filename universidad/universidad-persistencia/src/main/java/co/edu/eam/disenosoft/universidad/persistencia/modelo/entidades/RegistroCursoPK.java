package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

public class RegistroCursoPK implements Serializable{
	
	private String estudiante;
	
	private String curso;
	
	public RegistroCursoPK() {
		// TODO Auto-generated constructor stub
	}

	public RegistroCursoPK(String estudiante, String curso) {
		super();
		this.estudiante = estudiante;
		this.curso = curso;
	}

	/**
	 * @return the estudiante
	 */
	public String getEstudiante() {
		return estudiante;
	}

	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((estudiante == null) ? 0 : estudiante.hashCode());
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
		if (!(obj instanceof RegistroCursoPK)) {
			return false;
		}
		RegistroCursoPK other = (RegistroCursoPK) obj;
		if (curso == null) {
			if (other.curso != null) {
				return false;
			}
		} else if (!curso.equals(other.curso)) {
			return false;
		}
		if (estudiante == null) {
			if (other.estudiante != null) {
				return false;
			}
		} else if (!estudiante.equals(other.estudiante)) {
			return false;
		}
		return true;
	}
	
	
	
	

}
