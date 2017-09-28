package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import dao.AlteracaoDao;
import dao.CursoDao;
import dao.DocumentoDao;
import dao.GenericDao;
import dao.HistoricoDisciplinarDao;
import dao.PolicialDao;
import dao.PromocaoDao;
import dao.TelefoneDao;
import gui.JFPrincipal;
import model.Alteracao;
import model.Curso;
import model.Documento;
import model.HistoricoDisciplinar;
import model.Policial;
import model.Promocao;
import model.Telefone;

public class Principal {


	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		try {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(Exception e) {
			  System.out.println("Error setting native LAF: " + e);
			}
		JFPrincipal jfp = JFPrincipal.getInstancia();
		
	}

}
