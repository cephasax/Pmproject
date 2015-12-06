package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import model.Documento;

public class DocumentoDao extends GenericDao  {

	//consultar por idPolicial
	public List<Documento> consultarPorIdPolicial(Integer id) {
		CriteriaBuilder builder = Banco.getInstance().getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<Documento> query = builder.createQuery(Documento.class);
		Root<Documento> root = query.from(Documento.class);
		Predicate pred = builder.equal(root.get("idpolicial"), id);
		
		query.select(root);
		query.where(pred);
		
		TypedQuery<Documento> tpQuery = Banco.getInstance().getEntityManager().createQuery(query);
		List<Documento> list = tpQuery.getResultList();
		return list;
	}
	
}
