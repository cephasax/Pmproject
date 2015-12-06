package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author Cephas
 *
 */

@Entity
@Table(name = "Alteracao")
@SequenceGenerator(name = "SEQ_ALTERACAO", initialValue = 1, allocationSize = 1, sequenceName = "seq_alteracao")
public class Alteracao implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ALTERACAO")
	private long idAlteracao;

	@Column
	private String descricao;

	@Column
	private int numeroBg;

	@Column
	private String data;

	@ManyToOne
	@JoinColumn(name = "idPolicial")
	private Policial policial;

	public long getIdAlteracao() {
		return idAlteracao;
	}

	public void setIdAlteracao(long id) {
		this.idAlteracao = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumeroBg() {
		return numeroBg;
	}

	public void setNumeroBg(int numeroBg) {
		this.numeroBg = numeroBg;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Policial getPolicial() {
		return policial;
	}

	public void setPolicial(Policial policial) {
		this.policial = policial;
	}

}
