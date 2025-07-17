package com.cursogetafe.jpa.ejemplo08objetospersistentes;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import com.cursogetafe.jpa.config.Config;
import com.cursogetafe.jpa.ejemplo01mapeosimple.Persona;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Test01 {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Config.getEmf();
		EntityManager em = emf.createEntityManager();

		
		
		Persona p = em.find(Persona.class, 12);
		if(p != null)
			System.out.println(p);
		else {
			System.out.println("este tipo no existe!");
		}
		p.setApodo("tioMolesto");
		
		Persona nueva = new Persona(0,"Ape Nuevo", "Nombre Nuevo");
		em.getTransaction().begin();
		em.persist(nueva);
		em.getTransaction().commit();
			
		em.close();
		
	}

}
