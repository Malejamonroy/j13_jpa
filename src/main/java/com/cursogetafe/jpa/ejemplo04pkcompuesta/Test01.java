package com.cursogetafe.jpa.ejemplo04pkcompuesta;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test01 {

	public static void main(String[] args) {
		EntityManager em = Config.getEmf().createEntityManager();
		
		Persona04 p = em.find(Persona04.class, new Dni(12121212, 'A'));
		
		System.out.println(p);
		
		Persona04 nuevo = new Persona04(1234, 'X',"Pepito");
		
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();

	}

}
