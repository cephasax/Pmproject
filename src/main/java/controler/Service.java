package controler;

import dao.*;

import model.*;


public class Service {

		 public void cadastrarPolicial(Policial pm){
			 PolicialDao pmDao = new PolicialDao();
			 pmDao.inserir(pm);
			 System.out.println("Policial: " + pm.getNome() + " cadastrado com sucesso");

		 }
		 
		 public void cadastrarAlteracao(Alteracao alteracao, Policial policial){
			 AlteracaoDao altDao = new AlteracaoDao();
			 alteracao.setPolicial(policial);
			 altDao.inserir(alteracao);
			 
			 System.out.println("Alteracao " + alteracao.getDescricao() + " cadastrada com sucesso");
		 }
		 
		 public void cadastrarCurso(Curso curso, Policial policial){
			 CursoDao cursoDao = new CursoDao();
			 curso.setPolicial(policial);
			 cursoDao.inserir(curso);
			 
			 System.out.println("Curso: " + curso.getCurso() + " cadastrado com sucesso");
		 }
		 
		 public void cadastrarHistoricoDisciplinar(HistoricoDisciplinar hd, Policial policial){
			 HistoricoDisciplinarDao hdDao = new HistoricoDisciplinarDao();
			 hd.setPolicial(policial);
			 hdDao.inserir(hd);
			 System.out.println("historico disciplinar " + hd.getDescricao() + " cadastrado com sucesso");
		 }
		 
		 public void cadastrarPromocao(Promocao promo, Policial policial){
			 PromocaoDao promoDao = new PromocaoDao();
			 promo.setPolicial(policial);
			 promoDao.inserir(promo);
			 
			 System.out.println("Promocao: " + promo.getPromocao() + " cadastrado com sucesso");
		 }
		 
		 public void cadastrarTelefone(Telefone tel, Policial policial){
			 TelefoneDao telDao = new TelefoneDao();
			 tel.setPolicial(policial);
			 telDao.inserir(tel);
			 
			 System.out.println("Telefone: " + tel.getNumero() + " cadastrado com sucesso");
		 }
		 
		 public void excluirPolicial(Policial policial){
			 PolicialDao pmDao = new PolicialDao();
			 pmDao.excluir(policial);
			 System.out.println("Policial: " + policial.getNome() + " excluido com sucesso");

		 }
		 
		 public void atualizarPolicial(Policial policial){
			 PolicialDao pmDao = new PolicialDao();
			 pmDao.atualizar(policial);
			 System.out.println("Policial: " + policial.getNome() + " alterado");

		 }
	
}
