package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import model.Telefone;

public class TelefoneDao extends GenericDao  {
	
	//consultar por idPolicial
	public List<Telefone> consultarPorIdPolicial(Integer id) {
		CriteriaBuilder builder = Banco.getInstance().getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<Telefone> query = builder.createQuery(Telefone.class);
		Root<Telefone> root = query.from(Telefone.class);
		Predicate pred = builder.equal(root.get("idpolicial"), id);
		
		query.select(root);
		query.where(pred);
		
		TypedQuery<Telefone> tpQuery = Banco.getInstance().getEntityManager().createQuery(query);
		List<Telefone> list = tpQuery.getResultList();
		return list;
	}

}
