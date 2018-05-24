package com.yosael.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.yosael.dao.IPersona;
import com.yosael.model.Persona;

@Stateless
public class PersonaImpl implements IPersona, Serializable {
	
	@PersistenceContext(unitName = "PersonaPU_Rest")
	private EntityManager em;

	@Override
	public void agregar(Persona t) throws Exception {
		em.persist(t);
	}

	@Override
	public void modificar(Persona t) throws Exception {
		em.merge(t);
		
	}

	@Override
	public void eliminar(Persona t) throws Exception {
		em.remove(t);
		
	}

	@Override
	public Persona buscarPorId(int id) throws Exception {
		System.out.println("Entro a persona DAO impl, buscar por id");
		return em.find(Persona.class, id);
	}

	@Override
	public List<Persona> buscarTodos() throws Exception {
		Query query = em.createNamedQuery("FROM Persona");
		return query.getResultList();
	}
	
	

}
