package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

public class NotaPK implements Serializable{

	private RegistroCurso codigoCurso;
	
	private int idNota;
	
	
	public NotaPK() {
		// TODO Auto-generated constructor stub
	}


	public NotaPK(RegistroCurso registroCurso, int idNota) {
		super();
		this.codigoCurso = registroCurso;
		this.idNota = idNota;
	}


	/**
	 * @return the registroCurso
	 */
	public RegistroCurso getRegistroCurso() {
		return codigoCurso;
	}


	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setRegistroCurso(RegistroCurso registroCurso) {
		this.codigoCurso = registroCurso;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idNota;
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
		if (!(obj instanceof NotaPK)) {
			return false;
		}
		NotaPK other = (NotaPK) obj;
		if (idNota != other.idNota) {
			return false;
		}
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
