package com.cursogetafe.jpa.ejemplo05tipoacceso;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import com.cursogetafe.jpa.config.Config;
import com.cursogetafe.jpa.ejemplo02columnyenum.Persona02;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Test01 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Config.getEmf();
		EntityManager em = emf.createEntityManager();
		
		Persona05 p = em.find(Persona05.class, 12);
		if(p != null)
			System.out.println(p);
		else {
			System.out.println("este tipo no existe!");
			
		em.close();
		}
	}

}
