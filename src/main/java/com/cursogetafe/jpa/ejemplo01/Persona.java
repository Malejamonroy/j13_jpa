package com.cursogetafe.jpa.ejemplo01;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //Como la tabla se llama igual a la clase no hace falta referenciarla 
@Table(name = "persona") //si la tabla nos e llama igual hay qye referenciarlo 
public class Persona implements Serializable {

	@Id  //atributo que corresponde con la primarikey de la tabla  
	@GeneratedValue (strategy = GenerationType.IDENTITY) //hay que indicarque como se maneja, con una anotacion indicamos que la pk de la tabla es autoincrement   
	private int idPersona;
	private String apellidos;
	private String apodo;
	private String nombre;
	private String dni;
	
	public Persona() {}
	

	public Persona(int idPersona, String apellido, String nombre) {
		super();
		this.idPersona = idPersona;
		this.apellidos = apellido;
		this.nombre = nombre;
	}
	


	public int getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}


	public String getApellido() {
		return apellidos;
	}


	public void setApellido(String apellido) {
		this.apellidos = apellido;
	}


	public String getApodo() {
		return apodo;
	}


	public void setApodo(String apodo) {
		this.apodo = apodo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona (idPersona=" + idPersona + ", apellido=" + apellidos + ", apodo=" + apodo + ", nombre=" + nombre
				+ ", dni=" + dni + ")";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return idPersona == other.idPersona;
	}

	

	
}
