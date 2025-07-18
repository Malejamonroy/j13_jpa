package com.cursogetafe.jpa.ejemplo10elementcollection;

import com.cursogetafe.jpa.config.Config;

import jakarta.persistence.EntityManager;

public class Test01 {
public static void main(String[] args) {
	EntityManager em = Config.getEmf().createEntityManager();
	
	ContactoConTelefonos c = em.find(ContactoConTelefonos.class, 10);
	
	System.out.println(c.getApellidos()+" " + c.getNombre());
	
	
	em.close();
	
	
	System.out.println(c.getIdContacto());
	System.out.println(c.getApellidos());
//	System.out.println(c.getTelefonos());


	}

}
