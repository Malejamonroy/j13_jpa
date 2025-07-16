package com.cursogetafe.jpa.ejemplo02;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test01 {

	public static void main(String[] args) {
		EntityManager em = Config.getEmf().createEntityManager();
		
		Persona02 p = em.find(Persona02.class, 7);
		System.out.println(p);
		
		Persona02 nuevo = new Persona02(0, "Federico", "Garcia Lorca");
		nuevo.setGenero(Genero.MASC);
		
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();
		
		em.close();
	}
}
