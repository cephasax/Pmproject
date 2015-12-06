package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author Cephas
 *
 */

@Entity
@Table(name = "Telefone")
@SequenceGenerator(name = "SEQ_TELEFONE", initialValue = 1, allocationSize = 1, sequenceName = "seq_telefone")
public class Telefone implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TELEFONE")
	private long idTelefone;

	@Column
	private String tipo;

	@Column
	private String numero;

	@ManyToOne
	@JoinColumn(name = "idPolicial")
	private Policial policial;

	public long getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(long id) {
		this.idTelefone = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Policial getPolicial() {
		return policial;
	}

	public void setPolicial(Policial policial) {
		this.policial = policial;
	}

}
