package com.miempresa.curso.ejb.dao;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.miempresa.curso.model.Curso;

public class CursoDao extends Dao<Curso> {
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void persist(Curso c)  {
		em.persist(c);
	}
}
