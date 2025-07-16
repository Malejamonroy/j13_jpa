package com.cursogetafe.jpa.ejemplo02;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //Como la tabla se llama igual a la clase no hace falta referenciarla 
@Table(name = "personas") //si la tabla nos e llama igual hay qye referenciarlo 
public class Persona02 implements Serializable {

	@Id  //atributo que corresponde con la primarikey de la tabla  
	@GeneratedValue (strategy = GenerationType.IDENTITY) //hay que indicarque como se maneja, con una anotacion indicamos que la pk de la tabla es autoincrement   
	@Column(name = "id_persona") //indica que eso es una columna 
	private int idPersona;
	
	@Column(name = "p_apellidos")
	private String apellidos;
	
	@Column(name = "p_apodo")
	private String apodo;
	
	@Column(name = "p_nombre")
	private String nombre;
	
	@Column(name = "p_dni")
	private String dni;
	
	//enumerarlo: para crear un tipo de datos restringidos hay que crear  un enum y luego el metodo Genero
	@Enumerated(EnumType.STRING)  //EnumType.ORDINAL= este es por defecto, devuelve un entero pero lo define java    //EnumType.STRING = utuliza en nombre de las constantes 
	@Column(name = "p_sexo")
	private Genero genero;
	
	public Persona02() {}
	

	public Persona02(int idPersona, String apellido, String nombre) {
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




	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	
	
	
	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
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
		Persona02 other = (Persona02) obj;
		return idPersona == other.idPersona;
	}

	

	
}
