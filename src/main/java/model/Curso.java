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
@Table(name="Curso")
@SequenceGenerator(name="SEQ_CURSO", initialValue=1, allocationSize=1, sequenceName="seq_curso")
public class Curso implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_CURSO")
	private long idCurso;
	
	@Column
	private String curso;
	
	@Column
	private int numeroBg;
	
	@Column
	private String data;
	
	@Column
	private double nota;
	
	@ManyToOne
	@JoinColumn(name="idPolicial")
	private Policial policial;

	public long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(long id) {
		this.idCurso = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
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

	public Policial getPolicial() {
		return policial;
	}

	public void setPolicial(Policial policial) {
		this.policial = policial;
	}

}
