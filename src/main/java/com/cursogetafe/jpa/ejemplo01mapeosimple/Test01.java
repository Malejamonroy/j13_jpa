package com.cursogetafe.jpa.ejemplo01mapeosimple;

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
//		String sql = "select idpersona, apellido,nombre apodo,dni from persona where idpersona = ?";
//		PreparedStatement ps = cx.prepareStatement (sql);
//		ps.setInt(1, 12);
//		ResultSet rs = ps.executeQuery();
//		if(rs.next()) {
//			//si existe 
//			Persona p = new Persona();
//		}
		
		
		Persona02 p = em.find(Persona02.class, 12);
		if(p != null)
			System.out.println(p);
		else {
			System.out.println("este tipo no existe!");
			
		em.close();
		}
	}

}
