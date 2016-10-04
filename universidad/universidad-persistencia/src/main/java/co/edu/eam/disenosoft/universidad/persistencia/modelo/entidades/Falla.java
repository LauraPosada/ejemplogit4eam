package co.edu.eam.disenosoft.universidad.persistencia.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_falla")
@IdClass(FallaPK.class)
public class Falla implements Serializable{

	@Id
	@Column(name="id_falla")
	private int idFalla;
	
	@Column(name="numero_fallas",nullable= false)
	private String numeroFalla;
	
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="cedula_estud", referencedColumnName="cedula_est"),
		@JoinColumn(name="codigo_curso", referencedColumnName="codigo_cur")
	})
	private RegistroCurso cod;
	
}
