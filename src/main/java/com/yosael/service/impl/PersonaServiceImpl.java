package com.yosael.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.yosael.dao.IPersona;
import com.yosael.dao.impl.PersonaImpl;
import com.yosael.model.Persona;
import com.yosael.service.IPersonaService;

//@Named
//@RequestScoped
@Stateless
public class PersonaServiceImpl implements IPersonaService, Serializable {
	
	@EJB
	PersonaImpl personaDAO;
	//IPersona personaDAO;

	@Override
	public void agregar(Persona t) throws Exception {
		try {
			personaDAO.agregar(t);
		}
		catch (Exception e) {	
			e.printStackTrace();
		}
	}

	@Override
	public void modificar(Persona t) throws Exception {
		try {
			personaDAO.modificar(t);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(Persona t) throws Exception {
		personaDAO.eliminar(t);
	}

	@Override
	public Persona buscarPorId(int id) throws Exception {
		Persona persona = null;
		try {
			System.out.println("Entro a persona service impl, buscar por id");
			persona = personaDAO.buscarPorId(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}

	@Override
	public List<Persona> buscarTodos() throws Exception {
		List<Persona> personas = new ArrayList<Persona>();
		
		try {
			personas = personaDAO.buscarTodos();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return personas;
	}
	
	public void calcularAlgo() {
		
	}

	
}
