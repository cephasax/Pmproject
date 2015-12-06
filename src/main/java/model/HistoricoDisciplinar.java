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

@Entity
@Table(name="HistoricoDisciplinar")
@SequenceGenerator(name="SEQ_HISTORICO", initialValue=1, allocationSize=1, sequenceName="seq_historico")
public class HistoricoDisciplinar implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_HISTORICO")
	private long idHistoricoDisciplinar;
	
	@Column
	private int numeroBg;
	
	@Column
	private String data;
	
	@Column
	private double nota;
	
	@Column
	private String descricao;
	
	@Column
	private String comportamento;
	
	@ManyToOne
	@JoinColumn(name="idPolicial")
	private Policial policial;

	public long getIdHistoricoDisciplinar() {
		return idHistoricoDisciplinar;
	}

	public void setIdHistoricoDisciplinar(long id) {
		this.idHistoricoDisciplinar = id;
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

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

	public Policial getPolicial() {
		return policial;
	}

	public void setPolicial(Policial policial) {
		this.policial = policial;
	}

}
