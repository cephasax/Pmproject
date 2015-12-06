package gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import dao.PolicialDao;
import model.Policial;

/**
 * Implementa��o de Table Model para exibir os S�cios.
 * 
 * @author Eric Yuzo
 */
public class tmListaPoliciais extends AbstractTableModel {
	/* Lista de S�cios que representam as linhas. */
	private List<Policial> linhas;

	/* Array de Strings com o nome das colunas. */
	private String[] colunas = new String[] { "Graduacao", "Nome", "Numero", "Matricula" };

	/* Cria um FuncionarioTableModel vazio. */
	public tmListaPoliciais() {
		linhas = new ArrayList<Policial>();
	}

	/*
	 * Cria um FuncionarioTableModel carregado com a lista de s�cios
	 * especificada.
	 */
	public tmListaPoliciais(List<Policial> listaDepoliciais) {
		linhas = new ArrayList<Policial>(listaDepoliciais);
	}

	/* Retorna a quantidade de colunas. */
	public int getColumnCount() {
		// Est� retornando o tamanho do array "colunas".
		// Mas como o array � fixo, vai sempre retornar 4.
		return colunas.length;
	}

	/* Retorna a quantidade de linhas. */
	public int getRowCount() {
		// Retorna o tamanho da lista de s�cios.
		return linhas.size();
	}

	/*
	 * Retorna o nome da coluna no �ndice especificado. Este m�todo � usado pela
	 * JTable para saber o texto do cabe�alho.
	 */
	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	};

	/*
	 * Retorna a classe dos elementos da coluna especificada. Este m�todo �
	 * usado pela JTable na hora de definir o editor da c�lula.
	 */
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0: // graduacao
			return String.class;
		case 1: // nome
			return String.class;
		case 2: // numero
			return int.class;
		case 3: // matricula
			return String.class;
		default:
			return null;
		}
	}

	/*
	 * Retorna o valor da c�lula especificada pelos �ndices da linha e da
	 * coluna.
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		// Pega o s�cio da linha especificada.
		Policial policial = linhas.get(rowIndex);

		switch (columnIndex) {
		case 0: // graduacao
			return policial.getGraduacao();
		case 1: // nome
			return policial.getNome();
		case 2: // numero
			return policial.getNumero();
		case 3: // matricula
			return policial.getMatricula();
		default:
			return null;
		}

	}

	/*
	 * Retorna um valor booleano que define se a c�lula em quest�o pode ser
	 * editada ou n�o. Este m�todo � utilizado pela JTable na hora de definir o
	 * editor da c�lula. Neste caso, estar� sempre retornando false, n�o
	 * permitindo que nenhuma c�lula seja editada.
	 */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	/* Retorna o s�cio da linha especificada. */
	public Policial getPolicial(int indiceLinha) {
		if (indiceLinha < linhas.size()) {
			return linhas.get(indiceLinha);
		}
		return null;
	}

	/* Verifica se este table model est� vazio. */
	public boolean isEmpty() {
		return linhas.isEmpty();
	}

	public List<Policial> getLinhas() {
		return linhas;
	}

	public void setLinhas(List<Policial> linhas) {
		this.linhas = linhas;
	}

	public String[] getColunas() {
		return colunas;
	}

	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}

}