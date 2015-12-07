package main;

import java.util.ArrayList;

import dao.AlteracaoDao;
import dao.CursoDao;
import dao.DocumentoDao;
import dao.GenericDao;
import dao.HistoricoDisciplinarDao;
import dao.PolicialDao;
import dao.PromocaoDao;
import dao.TelefoneDao;
import model.Alteracao;
import model.Curso;
import model.Documento;
import model.HistoricoDisciplinar;
import model.Policial;
import model.Promocao;
import model.Telefone;

public class CriaDados {

	public static void main(String[] args) {
		
		Policial pm1 = new Policial();
		
		pm1.setCor("Parda");
		pm1.setCorCabelos("Castanho escuros");
		pm1.setCorOlhos("Esverdeados");
		pm1.setCpf("42950724434");
		pm1.setDataExclusao("0");
		pm1.setDataInclusao("14/05/2001");
		pm1.setDataNascimento("14/05/2001");
		pm1.setEmail("juscelino_estevam@hotmail.com");
		pm1.setEspecialidade("Combatente");
		pm1.setEstadoCivil("Divorciado");
		pm1.setGraduacao("3 Sargento");
		pm1.setGrauInstrucao("Ensino médio completo");
		pm1.setMatricula("545457");
		pm1.setNaturalidade("Ielmo Marinho - RN");
		pm1.setNome("Juscelino Estevam De Lima");
		pm1.setNomeMae("Augustinha Araújo De Lima");
		pm1.setNomeGuerra("Juscelino");
		pm1.setNomePai("Luiz Estevam De Lima");
		pm1.setNumero(87301);
		pm1.setPisPasep("17023074978");
		pm1.setProcedencia("");
		pm1.setReservista("240812185512");
		pm1.setRgCivil("733977");
		pm1.setRgPm("7647");
		pm1.setTipoSangue("AB +");
		
		Policial pm2 = new Policial();
		
		pm2.setCor("Morena");
		pm2.setCorCabelos("Castanho escuros");
		pm2.setCorOlhos("Castanho médios");
		pm2.setCpf("44363710420");
		pm2.setDataExclusao("0");
		pm2.setDataInclusao("14/05/2001");
		pm2.setDataNascimento("14/05/1975");
		pm2.setEmail("joaoilton1@gmail.com");
		pm2.setEspecialidade("Combatente");
		pm2.setEstadoCivil("Casado");
		pm2.setGraduacao("Cabo");
		pm2.setGrauInstrucao("Ensino médio incompleto");
		pm2.setMatricula("545201");
		pm2.setNaturalidade("Monte Alegre  - RN");
		pm2.setNome("João Ilton Alves Do Nascimento");
		pm2.setNomeMae("Agripina Barbosa Da Silva");
		pm2.setNomeGuerra("Ilton");
		pm2.setNomePai("José Alves Do Nascimento");
		pm2.setNumero(84379);
		pm2.setPisPasep("17023074919");
		pm2.setProcedencia("0");
		pm2.setReservista("0");
		pm2.setRgCivil("761950");
		pm2.setRgPm("7725");
		pm2.setTipoSangue("A +");
		
		Policial pm3 = new Policial();
		
		pm3.setCor("Parda");
		pm3.setCorCabelos("Castanho médios");
		pm3.setCorOlhos("Castanho médios");
		pm3.setCpf("62404210491");
		pm3.setDataExclusao("0");
		pm3.setDataInclusao("29/06/1999");
		pm3.setDataNascimento("14/05/1988");
		pm3.setEmail("mariosergiomsas91@gmail.ccom.br");
		pm3.setEspecialidade("Combatente");
		pm3.setEstadoCivil("Casado");
		pm3.setGraduacao("3 Sargento");
		pm3.setGrauInstrucao("Ensino médio incompleto");
		pm3.setMatricula("152056");
		pm3.setNaturalidade("Natal - RN");
		pm3.setNome("Mário Sérgio Alves De Souza");
		pm3.setNomeMae("Elizabete Antonia De Souza");
		pm3.setNomeGuerra("Mário");
		pm3.setNomePai("Manoel Alves De Souza");
		pm3.setNumero(88557);
		pm3.setPisPasep("17037668239");
		pm3.setProcedencia("0");
		pm3.setReservista("0");
		pm3.setRgCivil("825631");
		pm3.setRgPm("9082");
		pm3.setTipoSangue("O +");
		
		
		Policial pm4 = new Policial();
		pm4.setDataNascimento("11/05/1986");
		pm4.setNome("Cephas Barreto");
		pm4.setMatricula("195.352-4");
		
		Policial pm5 = new Policial();
		pm5.setDataNascimento("11/05/1978");
		pm5.setNome("Mane");
		pm5.setMatricula("195.352-9");
		
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
				
		Documento doc2 = new Documento();
		doc2.setCargaHoraria(40);
		doc2.setDescricao("certificado do biscuit");
		
		
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
		pm2.getTelefones().add(tel4);
		
		
		PolicialDao policialDao = new PolicialDao();
		AlteracaoDao altDao = new AlteracaoDao();
		CursoDao cDao = new CursoDao();
		DocumentoDao docDao = new DocumentoDao();
		HistoricoDisciplinarDao hdDao = new HistoricoDisciplinarDao();
		PromocaoDao promoDao = new PromocaoDao();
		TelefoneDao telDao = new TelefoneDao();
		
		
		policialDao.inserir(pm1);
		policialDao.inserir(pm2);
		policialDao.inserir(pm3);
		policialDao.inserir(pm4);
		policialDao.inserir(pm5);
		
		altDao.inserir(alt);
		altDao.inserir(alt2);
		
		cDao.inserir(curso);
		cDao.inserir(curso2);

		
		docDao.inserir(doc);
		docDao.inserir(doc2);
		
		hdDao.inserir(hd);
		hdDao.inserir(hd2);
		
		promoDao.inserir(promo);
		promoDao.inserir(promo2);
		
		telDao.inserir(tel1);
		telDao.inserir(tel2);
		telDao.inserir(tel3);
		telDao.inserir(tel4);

	}

}
