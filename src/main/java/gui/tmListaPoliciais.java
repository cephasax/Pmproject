package gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import dao.PolicialDao;
import model.Policial;

/**
 * Implementação de Table Model para exibir os Sócios.
 * 
 * @author Eric Yuzo
 */
public class tmListaPoliciais extends AbstractTableModel {
	/* Lista de Sócios que representam as linhas. */
	private List<Policial> linhas;

	/* Array de Strings com o nome das colunas. */
	private String[] colunas = new String[] { "Graduacao", "Nome", "Numero", "Matricula" };

	/* Cria um FuncionarioTableModel vazio. */
	public tmListaPoliciais() {
		linhas = new ArrayList<Policial>();
	}

	/*
	 * Cria um FuncionarioTableModel carregado com a lista de sócios
	 * especificada.
	 */
	public tmListaPoliciais(List<Policial> listaDepoliciais) {
		linhas = new ArrayList<Policial>(listaDepoliciais);
	}

	/* Retorna a quantidade de colunas. */
	public int getColumnCount() {
		// Está retornando o tamanho do array "colunas".
		// Mas como o array é fixo, vai sempre retornar 4.
		return colunas.length;
	}

	/* Retorna a quantidade de linhas. */
	public int getRowCount() {
		// Retorna o tamanho da lista de sócios.
		return linhas.size();
	}

	/*
	 * Retorna o nome da coluna no índice especificado. Este método é usado pela
	 * JTable para saber o texto do cabeçalho.
	 */
	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	};

	/*
	 * Retorna a classe dos elementos da coluna especificada. Este método é
	 * usado pela JTable na hora de definir o editor da célula.
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
	 * Retorna o valor da célula especificada pelos índices da linha e da
	 * coluna.
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		// Pega o sócio da linha especificada.
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
	 * Retorna um valor booleano que define se a célula em questão pode ser
	 * editada ou não. Este método é utilizado pela JTable na hora de definir o
	 * editor da célula. Neste caso, estará sempre retornando false, não
	 * permitindo que nenhuma célula seja editada.
	 */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	/* Retorna o sócio da linha especificada. */
	public Policial getPolicial(int indiceLinha) {
		if (indiceLinha < linhas.size()) {
			return linhas.get(indiceLinha);
		}
		return null;
	}

	/* Verifica se este table model está vazio. */
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