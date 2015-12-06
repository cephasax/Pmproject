package interceptor;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import dao.GenericDao;
import model.Alteracao;
import model.Curso;
import model.Documento;
import model.HistoricoDisciplinar;
import model.LogDatabase;
import model.Policial;
import model.Promocao;
import model.Telefone;

public class InterceptorPadrao extends EmptyInterceptor {

	private static final long serialVersionUID = 1L;
	private String tipoOperacao;

	private Set<Alteracao> alteracoesSalvas = new HashSet<Alteracao>();
	private Set<Curso> cursosSalvos = new HashSet<Curso>();
	private Set<Documento> documentosSalvos = new HashSet<Documento>();
	private Set<HistoricoDisciplinar> historicosDisciplinaresSalvos = new HashSet<HistoricoDisciplinar>();
	private Set<Policial> policiaisSalvos = new HashSet<Policial>();
	private Set<Promocao> promocoesSalvas = new HashSet<Promocao>();
	private Set<Telefone> telefonesSalvos = new HashSet<Telefone>();

	private Set<Alteracao> alteracoesExcluidas = new HashSet<Alteracao>();
	private Set<Curso> cursosExcluidos = new HashSet<Curso>();
	private Set<Documento> documentosExcluidos = new HashSet<Documento>();
	private Set<HistoricoDisciplinar> historicosDisciplinaresExcluidos = new HashSet<HistoricoDisciplinar>();
	private Set<Policial> policiaisExcluidos = new HashSet<Policial>();
	private Set<Promocao> promocoesExcluidas = new HashSet<Promocao>();
	private Set<Telefone> telefonesExcluidos = new HashSet<Telefone>();

	private Set<Alteracao> alteracoesAtualizadas = new HashSet<Alteracao>();
	private Set<Curso> cursosAtualizados = new HashSet<Curso>();
	private Set<Documento> documentosAtualizados = new HashSet<Documento>();
	private Set<HistoricoDisciplinar> historicosDisciplinaresAtualizados = new HashSet<HistoricoDisciplinar>();
	private Set<Policial> policiaisAtualizados = new HashSet<Policial>();
	private Set<Promocao> promocoesAtualizadas = new HashSet<Promocao>();
	private Set<Telefone> telefonesAtualizados = new HashSet<Telefone>();

	GenericDao gdao = new GenericDao();	

	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {

		if (entity instanceof Alteracao) {
			Alteracao ent = (Alteracao) entity;
			alteracoesSalvas.add(ent);
		}

		if (entity instanceof Curso) {
			Curso ent = (Curso) entity;
			cursosSalvos.add(ent);
		}

		if (entity instanceof Documento) {
			Documento ent = (Documento) entity;
			documentosSalvos.add(ent);
		}

		if (entity instanceof HistoricoDisciplinar) {
			HistoricoDisciplinar ent = (HistoricoDisciplinar) entity;
			historicosDisciplinaresSalvos.add(ent);
		}

		if (entity instanceof Policial) {
			Policial ent = (Policial) entity;
			policiaisSalvos.add(ent);
		}

		if (entity instanceof Promocao) {
			Promocao ent = (Promocao) entity;
			promocoesSalvas.add(ent);
		}

		if (entity instanceof Telefone) {
			Telefone ent = (Telefone) entity;
			telefonesSalvos.add(ent);
		}

		tipoOperacao = "Save";

		return super.onSave(entity, id, state, propertyNames, types);
	}

	public void onDelete(Object entity, Serializable id, Object[] state, 
			String[] propertyNames, Type[] types) {

		if (entity instanceof Alteracao) {
			Alteracao ent = (Alteracao) entity;
			alteracoesExcluidas.add(ent);
		}

		if (entity instanceof Curso) {
			Curso ent = (Curso) entity;
			cursosExcluidos.add(ent);
		}

		if (entity instanceof Documento) {
			Documento ent = (Documento) entity;
			documentosExcluidos.add(ent);
		}

		if (entity instanceof HistoricoDisciplinar) {
			HistoricoDisciplinar ent = (HistoricoDisciplinar) entity;
			historicosDisciplinaresExcluidos.add(ent);
		}

		if (entity instanceof Policial) {
			Policial ent = (Policial) entity;
			policiaisExcluidos.add(ent);
		}

		if (entity instanceof Promocao) {
			Promocao ent = (Promocao) entity;
			promocoesExcluidas.add(ent);
		}

		if (entity instanceof Telefone) {
			Telefone ent = (Telefone) entity;
			telefonesExcluidos.add(ent);
		}

		tipoOperacao = "Delete";

		super.onDelete(entity, id, state, propertyNames, types);
	}

	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, 
			Object[] previousState,	String[] propertyNames, Type[] types) {

		if (entity instanceof Alteracao) {
			Alteracao ent = (Alteracao) entity;
			alteracoesAtualizadas.add(ent);
			tipoOperacao = "Update";
			return true;
		}

		if (entity instanceof Curso) {
			Curso ent = (Curso) entity;
			cursosAtualizados.add(ent);
			tipoOperacao = "Update";
			return true;
		}

		if (entity instanceof Documento) {
			Documento ent = (Documento) entity;
			documentosAtualizados.add(ent);
			tipoOperacao = "Update";
			return true;
		}

		if (entity instanceof HistoricoDisciplinar) {
			HistoricoDisciplinar ent = (HistoricoDisciplinar) entity;
			historicosDisciplinaresAtualizados.add(ent);
			tipoOperacao = "Update";
			return true;
		}

		if (entity instanceof Policial) {
			Policial ent = (Policial) entity;
			policiaisAtualizados.add(ent);
			tipoOperacao = "Update";
			return true;
		}

		if (entity instanceof Promocao) {
			Promocao ent = (Promocao) entity;
			promocoesAtualizadas.add(ent);
			tipoOperacao = "Update";
			return true;
		}

		if (entity instanceof Telefone) {
			Telefone ent = (Telefone) entity;
			telefonesAtualizados.add(ent);
			tipoOperacao = "Update";
			return true;
		}

		return false;
	}

	@Override
	public void postFlush(@SuppressWarnings("rawtypes") Iterator entities) {
		
		super.postFlush(entities);

		try {
			// Alteracao
			for (Alteracao alt : alteracoesSalvas) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(alt.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(alt.getIdAlteracao()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Alteracao alt : alteracoesExcluidas) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(alt.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(alt.getIdAlteracao()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Alteracao alt : alteracoesAtualizadas) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(alt.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(alt.getIdAlteracao()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			// Curso
			for (Curso curso : cursosSalvos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(curso.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(curso.getIdCurso()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Curso curso : cursosExcluidos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(curso.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(curso.getIdCurso()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Curso curso : cursosAtualizados) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(curso.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(curso.getIdCurso()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			// Documento
			for (Documento doc : documentosSalvos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(doc.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(doc.getIdDocumento()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Documento doc : documentosExcluidos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(doc.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(doc.getIdDocumento()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Documento doc : documentosAtualizados) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(doc.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(doc.getIdDocumento()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			// HistoricoDisciplinar
			for (HistoricoDisciplinar doc : historicosDisciplinaresSalvos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(doc.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(doc.getIdHistoricoDisciplinar()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (HistoricoDisciplinar doc : historicosDisciplinaresExcluidos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(doc.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(doc.getIdHistoricoDisciplinar()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (HistoricoDisciplinar doc : historicosDisciplinaresAtualizados) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(doc.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(doc.getIdHistoricoDisciplinar()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			// Policial
			for (Policial pol : policiaisSalvos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(pol.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(pol.getIdPolicial()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Policial pol : policiaisExcluidos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(pol.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(pol.getIdPolicial()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Policial pol : policiaisAtualizados) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(pol.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(pol.getIdPolicial()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			// Promocao
			for (Promocao pol : promocoesSalvas) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(pol.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(pol.getIdPromocao()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Promocao pol : promocoesExcluidas) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(pol.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(pol.getIdPromocao()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Promocao pol : promocoesAtualizadas) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(pol.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(pol.getIdPromocao()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			// Telefone
			for (Telefone pol : telefonesSalvos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(pol.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(pol.getIdTelefone()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Telefone pol : telefonesExcluidos) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(pol.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(pol.getIdTelefone()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

			for (Telefone pol : telefonesAtualizados) {
				LogDatabase log = new LogDatabase();
				log.setEntidade(pol.getClass().getCanonicalName());
				log.setTipoOperacao(tipoOperacao);
				log.setValorAlterado(Long.toString(pol.getIdTelefone()));
				log.setDataAlteracao(new Date());
				gdao.inserirLog(log);
			}

		} finally {
			
			alteracoesSalvas.clear();
			cursosSalvos.clear();
			documentosSalvos.clear();
			historicosDisciplinaresSalvos.clear();
			policiaisSalvos.clear();
			promocoesSalvas.clear();
			telefonesSalvos.clear();

			alteracoesExcluidas.clear();
			cursosExcluidos.clear();
			documentosExcluidos.clear();
			historicosDisciplinaresExcluidos.clear();
			policiaisExcluidos.clear();
			promocoesExcluidas.clear();
			telefonesExcluidos.clear();

			alteracoesAtualizadas.clear();
			cursosAtualizados.clear();
			documentosAtualizados.clear();
			historicosDisciplinaresAtualizados.clear();
			policiaisAtualizados.clear();
			promocoesAtualizadas.clear();
			telefonesAtualizados.clear();

		}

	}
	
}
