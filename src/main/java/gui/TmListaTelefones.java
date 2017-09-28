// Em produ��o


/*package gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import dao.PolicialDao;
import model.Policial;
import model.Telefone;

*//**
 * Implementa��o de Table Model para exibir os S�cios.
 * 
 * @author Eric Yuzo
 *//*
public class TmListaTelefones extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	
	private List<Telefone> linhasTelefone;
	private List<Policial> linhasPolicial;

	private String[] colunas = new String[] { "", "Graduacao", "Nome", "Telefone", "Tipo" };

	public TmListaTelefones() {
		linhasTelefone = new ArrayList<Telefone>();
	}

	public TmListaTelefones(List<Telefone> listaTelefones) {
		linhasTelefone = new ArrayList<Telefone>(listaTelefones);
		PolicialDao pmDao = new PolicialDao();
		
		linhasPolicial = new ArrayList<Policial>();
		linhasPolicial = pmDao.listar();
		for(Policial pm: linhasPolicial){
			
		}
	}

	public int getColumnCount() {
		return colunas.length;
	}

	public int getRowCount() {
		return linhasTelefone.size();
	}

	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	};

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 1: // graduacao
			return String.class;
		case 2: // nome
			return String.class;
		case 3: // Telefone
			return String.class;
		case 4: // Tipo
			return String.class;
		default:
			return null;
		}
	}

	
	public Object getValueAt(int rowIndex, int columnIndex) {

		Telefone telefone = linhasTelefone.get(rowIndex);

		switch (columnIndex) {
		case 1: // graduacao
			return policial.getGraduacao();
		case 2: // nome
			return policial.getNome();
		case 3: // numero
			return policial.getNumero();
		case 4: // matricula
			return policial.getMatricula();
		default:
			return null;
		}

	}

	
	 * Retorna um valor booleano que define se a c�lula em quest�o pode ser
	 * editada ou n�o. Este m�todo � utilizado pela JTable na hora de definir o
	 * editor da c�lula. Neste caso, estar� sempre retornando false, n�o
	 * permitindo que nenhuma c�lula seja editada.
	 
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	 Retorna o s�cio da linha especificada. 
	public Telefone getTelefone(int indiceLinha) {
		if (indiceLinha < linhas.size()) {
			return linhas.get(indiceLinha);
		}
		return null;
	}

	 Verifica se este table model est� vazio. 
	public boolean isEmpty() {
		return linhas.isEmpty();
	}

	public List<Telefone> getLinhas() {
		return linhas;
	}

	public void setLinhas(List<Telefone> linhas) {
		this.linhas = linhas;
	}

	public String[] getColunas() {
		return colunas;
	}

	public void setColunas(String[] colunas) {
		this.colunas = colunas;
	}

}*/