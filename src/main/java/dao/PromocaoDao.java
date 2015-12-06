package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import model.Promocao;

public class PromocaoDao extends GenericDao  {

	//consultar por idPolicial
	public List<Promocao> consultarPorIdPolicial(Integer id) {
		CriteriaBuilder builder = Banco.getInstance().getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<Promocao> query = builder.createQuery(Promocao.class);
		Root<Promocao> root = query.from(Promocao.class);
		Predicate pred = builder.equal(root.get("idpolicial"), id);
		
		query.select(root);
		query.where(pred);
		
		TypedQuery<Promocao> tpQuery = Banco.getInstance().getEntityManager().createQuery(query);
		List<Promocao> list = tpQuery.getResultList();
		return list;
	}
	
}
