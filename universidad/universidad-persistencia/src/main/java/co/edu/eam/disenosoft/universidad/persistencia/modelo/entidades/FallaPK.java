package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

public class FallaPK implements Serializable{

	
	private int idFalla;
	
	private RegistroCurso cod;
	
	public FallaPK() {
		// TODO Auto-generated constructor stub
	}

	public FallaPK(int idFalla, RegistroCurso cod) {
		super();
		this.idFalla = idFalla;
		this.cod = cod;
	}

	/**
	 * @return the idFalla
	 */
	public int getIdFalla() {
		return idFalla;
	}

	/**
	 * @param idFalla the idFalla to set
	 */
	public void setIdFalla(int idFalla) {
		this.idFalla = idFalla;
	}

	/**
	 * @return the cod
	 */
	public RegistroCurso getCod() {
		return cod;
	}

	/**
	 * @param cod the cod to set
	 */
	public void setCod(RegistroCurso cod) {
		this.cod = cod;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod == null) ? 0 : cod.hashCode());
		result = prime * result + idFalla;
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
		if (!(obj instanceof FallaPK)) {
			return false;
		}
		FallaPK other = (FallaPK) obj;
		if (cod == null) {
			if (other.cod != null) {
				return false;
			}
		} else if (!cod.equals(other.cod)) {
			return false;
		}
		if (idFalla != other.idFalla) {
			return false;
		}
		return true;
	}
	
	
	
}
