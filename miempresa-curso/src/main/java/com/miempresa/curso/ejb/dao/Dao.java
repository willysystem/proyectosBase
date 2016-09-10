package com.miempresa.curso.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.AttributeOverride;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.miempresa.curso.model.Entidad;

/**
 * Clase genérica para todos de la cual hereda todos los DAOs del proyecto. Además este 
 * inyecta <code>EntityManager</code> y lo hace disponible a todos los DAOs
 * @author Willy Hurtado
 * @param <E>
 */
@Stateless
public abstract class Dao<E extends Entidad> {
	
	@Inject
	protected EntityManager em;
	
	public void persist(E e)  {
		em.persist(e);
	}
	
	public E merge(E e) {
		E merge = em.merge(e);
		return merge; 
	} 
	
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public List<E> findAll(Class<E> clazz) {
		
	    CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<E> q = cb.createQuery(clazz);
		q.select(q.from(clazz)) ;
		
		return em.createQuery(q).getResultList();
	}
	
	public void delete(E e){
		em.find(e.getClass(), e.getId());
	}
	
}
