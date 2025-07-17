package com.cursogetafe.jpa.ejemplo04pkcompuesta;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test01B {

	public static void main(String[] args) {
		EntityManager em = Config.getEmf().createEntityManager();
		
		Persona04B p = em.find(Persona04B.class, new DniB(12121212, 'A'));
		
		System.out.println(p);
		
		Persona04B nuevo = new Persona04B(new DniB(9876,'Z'),"otro mas");
		
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();

	}

}
