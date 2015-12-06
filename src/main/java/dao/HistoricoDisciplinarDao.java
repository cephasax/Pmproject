package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import model.HistoricoDisciplinar;

public class HistoricoDisciplinarDao extends GenericDao  {
	
	//consultar por idPolicial
	public List<HistoricoDisciplinar> consultarPorIdPolicial(Integer id) {
		CriteriaBuilder builder = Banco.getInstance().getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<HistoricoDisciplinar> query = builder.createQuery(HistoricoDisciplinar.class);
		Root<HistoricoDisciplinar> root = query.from(HistoricoDisciplinar.class);
		Predicate pred = builder.equal(root.get("idpolicial"), id);
		
		query.select(root);
		query.where(pred);
		
		TypedQuery<HistoricoDisciplinar> tpQuery = Banco.getInstance().getEntityManager().createQuery(query);
		List<HistoricoDisciplinar> list = tpQuery.getResultList();
		return list;
	}
}
