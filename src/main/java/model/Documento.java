package model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Documento")
@SequenceGenerator(name = "SEQ_DOCUMENTO", initialValue = 1, allocationSize = 1, sequenceName = "seq_documento")
public class Documento implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DOCUMENTO")
	private long idDocumento;

	@Column
	private String tipo;

	@Column
	private String documento;

	@Column
	private String descricao;

	@Column
	private int cargaHoraria;

	@Column
	private String dataDocumento;

	@ManyToMany(fetch = FetchType.LAZY)
	@Cascade({CascadeType.ALL})
	@JoinTable(name = "documento_policial", joinColumns = @JoinColumn(name = "idDocumento") , inverseJoinColumns = @JoinColumn(name = "idPolicial") )
	private Collection<Policial> policiais;

	public long getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(long id) {
		this.idDocumento = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(String dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public Collection<Policial> getPoliciais() {
		return policiais;
	}

	public void setPoliciais(Collection<Policial> policiais) {
		this.policiais = policiais;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
