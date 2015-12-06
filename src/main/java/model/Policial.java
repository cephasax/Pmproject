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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author Cephas
 *
 */

@Entity
@Table(name = "Policial")
@SequenceGenerator(name = "SEQ_POLICIAL", initialValue = 1, allocationSize = 1, sequenceName = "seq_policial")
public class Policial implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_POLICIAL")
	private long idPolicial;

	@Column(nullable = false)
	private String nome;

	private String nomePai;
	private String nomeMae;
	private String dataNascimento;
	private String estadoCivil;
	private String naturalidade;
	private String tipoSangue;
	private String nomeGuerra;
	private String dataInclusao;
	private String dataExclusao;
	private String procedencia;
	private String especialidade;
	private String graduacao;
	private String matricula;
	private int numero;
	private String rgPm;
	private String rgCivil;
	private String cpf;
	private String reservista;
	private String pisPasep;
	private float altura;
	private String cor;
	private String corOlhos;
	private String corCabelos;
	private String grauInstrucao;
	private String email;

	@OneToMany(mappedBy = "policial")
	@Cascade({CascadeType.ALL})
	private Collection<Alteracao> alteracoes;

	@OneToMany(mappedBy = "policial")
	@Cascade({CascadeType.ALL})
	private Collection<Curso> cursos;

	@OneToMany(mappedBy = "policial")
	@Cascade({CascadeType.ALL})
	private Collection<HistoricoDisciplinar> historicosDisciplinares;

	@OneToMany(mappedBy = "policial")
	@Cascade({CascadeType.ALL})
	private Collection<Promocao> promocoes;

	@OneToMany(mappedBy = "policial")
	@Cascade({CascadeType.ALL})
	private Collection<Telefone> telefones;

	@ManyToMany(fetch = FetchType.LAZY)
	@Cascade({CascadeType.ALL})
	@JoinTable(name = "documento_policial", joinColumns = @JoinColumn(name = "idPolicial") , inverseJoinColumns = @JoinColumn(name = "idDocumento") )
	private Collection<Documento> documentos;

	public long getIdPolicial() {
		return idPolicial;
	}

	public void setIdPolicial(long idPolicial) {
		this.idPolicial = idPolicial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getTipoSangue() {
		return tipoSangue;
	}

	public void setTipoSangue(String tipoSangue) {
		this.tipoSangue = tipoSangue;
	}

	public String getNomeGuerra() {
		return nomeGuerra;
	}

	public void setNomeGuerra(String nomeGuerra) {
		this.nomeGuerra = nomeGuerra;
	}

	public String getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(String dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public String getDataExclusao() {
		return dataExclusao;
	}

	public void setDataExclusao(String dataExclusao) {
		this.dataExclusao = dataExclusao;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRgPm() {
		return rgPm;
	}

	public void setRgPm(String rgPm) {
		this.rgPm = rgPm;
	}

	public String getRgCivil() {
		return rgCivil;
	}

	public void setRgCivil(String rgCivil) {
		this.rgCivil = rgCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getReservista() {
		return reservista;
	}

	public void setReservista(String reservista) {
		this.reservista = reservista;
	}

	public String getPisPasep() {
		return pisPasep;
	}

	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCorOlhos() {
		return corOlhos;
	}

	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}

	public String getCorCabelos() {
		return corCabelos;
	}

	public void setCorCabelos(String corCabelos) {
		this.corCabelos = corCabelos;
	}

	public String getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(String grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Alteracao> getAlteracoes() {
		return alteracoes;
	}

	public void setAlteracoes(Collection<Alteracao> alteracoes) {
		this.alteracoes = alteracoes;
	}

	public Collection<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Collection<Curso> cursos) {
		this.cursos = cursos;
	}

	public Collection<HistoricoDisciplinar> getHistoricosDisciplinares() {
		return historicosDisciplinares;
	}

	public void setHistoricosDisciplinares(Collection<HistoricoDisciplinar> historicosDisciplinares) {
		this.historicosDisciplinares = historicosDisciplinares;
	}

	public Collection<Promocao> getPromocoes() {
		return promocoes;
	}

	public void setPromocoes(Collection<Promocao> promocoes) {
		this.promocoes = promocoes;
	}

	public Collection<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Collection<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Collection<Documento> documentos) {
		this.documentos = documentos;
	}

}
