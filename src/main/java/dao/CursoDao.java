package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import model.Curso;

public class CursoDao extends GenericDao {

	//consultar por idPolicial
	public List<Curso> consultarPorIdPolicial(Integer id) {
		CriteriaBuilder builder = Banco.getInstance().getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<Curso> query = builder.createQuery(Curso.class);
		Root<Curso> root = query.from(Curso.class);
		Predicate pred = builder.equal(root.get("idpolicial"), id);
		
		query.select(root);
		query.where(pred);
		
		TypedQuery<Curso> tpQuery = Banco.getInstance().getEntityManager().createQuery(query);
		List<Curso> list = tpQuery.getResultList();
		return list;
	}
	
}
