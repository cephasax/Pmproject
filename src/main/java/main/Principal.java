package main;

import java.util.ArrayList;

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
import model.Policial;

public class Principal {


	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		GenericDao gdao = new GenericDao();
		
		/*Policial pm1 = new Policial();
		pm1.setDataNascimento("11/05/1986");
		pm1.setNome("Cephas Barreto");
		pm1.setMatricula("195.352-4");
		
		Policial pm2 = new Policial();
		pm2.setDataNascimento("11/05/1978");
		pm2.setNome("Mane");
		pm2.setMatricula("195.352-9");
		
		Alteracao alt = new Alteracao();
		alt.setNumeroBg(25);
		alt.setDescricao("primeira alteracao");
		alt.setPolicial(pm1);
		
		Alteracao alt2 = new Alteracao();
		alt2.setNumeroBg(253);
		alt2.setDescricao("segunda alteracao");
		alt2.setPolicial(pm2);
		
		
		
		Curso curso = new Curso();
		curso.setCurso("operações especiais em java");
		curso.setPolicial(pm1);
		
		Curso curso2 = new Curso();
		curso2.setCurso("nada");
		curso2.setPolicial(pm2);
		
		
		
		Documento doc = new Documento();
		doc.setCargaHoraria(4000);
		doc.setDescricao("certificado do BTI");
		doc.setPoliciais(new ArrayList<Policial>());
		doc.getPoliciais().add(pm1);
		doc.getPoliciais().add(pm2);
		
		Documento doc2 = new Documento();
		doc2.setCargaHoraria(40);
		doc2.setDescricao("certificado do biscuit");
		doc2.setPoliciais(new ArrayList<Policial>());
		doc2.getPoliciais().add(pm2);
		
		
		
		HistoricoDisciplinar hd = new HistoricoDisciplinar();
		hd.setComportamento("otimo");
		hd.setData("13/03/1999");
		hd.setPolicial(pm1);
		
		HistoricoDisciplinar hd2 = new HistoricoDisciplinar();
		hd2.setComportamento("ruim");
		hd2.setData("13/03/2002");
		hd2.setPolicial(pm2);
		
		Promocao promo = new Promocao();
		promo.setaContar("25/12/2015");
		promo.setNumeroBg(153);
		promo.setPolicial(pm1);
		
		Promocao promo2 = new Promocao();
		promo2.setaContar("25/12/2011");
		promo2.setNumeroBg(15);
		promo2.setPolicial(pm2);
		
		
		Telefone tel1 = new Telefone();
		tel1.setNumero("8899-0000");
		tel1.setPolicial(pm1);
		
		Telefone tel2 = new Telefone();
		tel2.setNumero("8899-0002");
		tel2.setPolicial(pm1);
		
		Telefone tel3 = new Telefone();
		tel3.setNumero("8899-0003");
		tel3.setPolicial(pm2);
		
		Telefone tel4 = new Telefone();
		tel4.setNumero("8899-0004");
		tel4.setPolicial(pm2);
		
		pm1.setAlteracoes(new ArrayList<Alteracao>());
		pm1.setCursos(new ArrayList<Curso>());
		pm1.setDocumentos(new ArrayList<Documento>());
		pm1.setHistoricosDisciplinares(new ArrayList<HistoricoDisciplinar>());
		pm1.setPromocoes(new ArrayList<Promocao>());
		pm1.setTelefones(new ArrayList<Telefone>());
		
		pm1.getAlteracoes().add(alt);
		pm1.getCursos().add(curso);
		pm1.getDocumentos().add(doc);
		pm1.getHistoricosDisciplinares().add(hd);
		pm1.getPromocoes().add(promo);
		pm1.getTelefones().add(tel1);
		pm1.getTelefones().add(tel2);
		
		
		
		pm2.setAlteracoes(new ArrayList<Alteracao>());
		pm2.setCursos(new ArrayList<Curso>());
		pm2.setDocumentos(new ArrayList<Documento>());
		pm2.setHistoricosDisciplinares(new ArrayList<HistoricoDisciplinar>());
		pm2.setPromocoes(new ArrayList<Promocao>());
		pm2.setTelefones(new ArrayList<Telefone>());
		
		pm2.getAlteracoes().add(alt2);
		pm2.getCursos().add(curso2);
		pm2.getDocumentos().add(doc);
		pm2.getDocumentos().add(doc2);
		pm2.getHistoricosDisciplinares().add(hd2);
		pm2.getPromocoes().add(promo2);
		pm2.getTelefones().add(tel3);
		pm2.getTelefones().add(tel4);*/
		
		
		/*PolicialDao policialDao = new PolicialDao();
		AlteracaoDao altDao = new AlteracaoDao();
		CursoDao cDao = new CursoDao();
		DocumentoDao docDao = new DocumentoDao();
		HistoricoDisciplinarDao hdDao = new HistoricoDisciplinarDao();
		PromocaoDao promoDao = new PromocaoDao();
		TelefoneDao telDao = new TelefoneDao();
		
		ArrayList<Policial> lista = new ArrayList<Policial>();
		lista = policialDao.listar();
		
		for(Policial pm: lista){
			System.out.println(pm.getNome());
		}*/
		
		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		JFPrincipal jfp = JFPrincipal.getInstancia();
		
		
	}

}
