package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import model.Alteracao;
import model.Policial;

public class PolicialDao extends GenericDao{

	public List<Policial> listar() {
		CriteriaBuilder builder = Banco.getInstance().getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<Policial> query = builder.createQuery(Policial.class);
		Root<Policial> root = query.from(Policial.class);
		
		query.select(root);
		
		TypedQuery<Policial> tpQuery = Banco.getInstance().getEntityManager().createQuery(query);
		ArrayList<Policial> list = (ArrayList<Policial>) tpQuery.getResultList();
		return list;
	}
	
}
