package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="LogDatabase")
@SequenceGenerator(name="SEQ_LOG", initialValue=1, allocationSize=1, sequenceName="seq_log")
public class LogDatabase implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_LOG")
	private Long id;
	
	private String entidade;
	private String valorAlterado;
	private String tipoOperacao;
	private Date dataAlteracao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEntidade() {
		return entidade;
	}

	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}

	public String getValorAlterado() {
		return valorAlterado;
	}

	public void setValorAlterado(String valorAlterado) {
		this.valorAlterado = valorAlterado;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
}
