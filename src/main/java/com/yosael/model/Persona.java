package com.yosael.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "persona")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;
	
	@Column(name="nombres",length = 40,nullable = false)
	private String nombres;
	
	@Column(name = "apellidos",length = 40, nullable = false)
	private String apellidos;
	
	@Column(name = "fecha_nac")
	private Date fechaNac;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "foto")
	private byte[] foto;
	
	
	
	
	

	public Persona() {
		
	}

	public Persona(int idPersona, String nombres, String apellidos, Date fechaNac, String sexo, String direccion,
			byte[] foto) {
		super();
		this.idPersona = idPersona;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.direccion = direccion;
		this.foto = foto;
	}
	
	public Persona(int idPersona) {
		
		this.idPersona = idPersona;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	
	
}
