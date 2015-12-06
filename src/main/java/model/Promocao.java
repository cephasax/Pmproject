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
@Table(name = "Promocao")
@SequenceGenerator(name = "SEQ_PROMOCAO", initialValue = 1, allocationSize = 1, sequenceName = "seq_promocao")
public class Promocao implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROMOCAO")
	private long idPromocao;

	@Column
	private String promocao;

	@Column
	private int numeroBg;

	@Column
	private String data;

	@Column
	private String aContar;

	@ManyToOne
	@JoinColumn(name = "idPolicial")
	private Policial policial;

	public long getIdPromocao() {
		return idPromocao;
	}

	public void setIdPromocao(long id) {
		this.idPromocao = id;
	}

	public String getPromocao() {
		return promocao;
	}

	public void setPromocao(String promocao) {
		this.promocao = promocao;
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

	public String getaContar() {
		return aContar;
	}

	public void setaContar(String aContar) {
		this.aContar = aContar;
	}

	public Policial getPolicial() {
		return policial;
	}

	public void setPolicial(Policial policial) {
		this.policial = policial;
	}

}
