package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import model.Alteracao;
import model.Curso;

public class AlteracaoDao extends GenericDao {

	//consultar por idPolicial
	public List<Alteracao> consultarPorIdPolicial(Integer id) {
		CriteriaBuilder builder = Banco.getInstance().getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<Alteracao> query = builder.createQuery(Alteracao.class);
		Root<Alteracao> root = query.from(Alteracao.class);
		Predicate pred = builder.equal(root.get("idpolicial"), id);
		
		query.select(root);
		query.where(pred);
		
		TypedQuery<Alteracao> tpQuery = Banco.getInstance().getEntityManager().createQuery(query);
		List<Alteracao> list = tpQuery.getResultList();
		return list;
	}

}
