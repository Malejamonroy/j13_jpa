package com.cursogetafe.jpa.ejemplo07herenciasingletable;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name= "figuras01")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//estrategia de la herencia
@DiscriminatorColumn (name = "tipo_figura") //hay que indicarle cual es la columna discriminante
public abstract class Figura02 implements Serializable { //concepto abstracta
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFigura;
	private double x;
	private double y;
	
	public Figura02() {}
	
	public Figura02(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public abstract double area(); //metodo abstracto: metodo que no tiene cuerpo, ni codigo, esta creado para obtener decendiente
	//consecuencia:exige que los decendiente tengan codigo;obliga al usuario a que meta los datos que que necesito ai o si 
	//hace que implemenete el metodo area y el metodo perimetro
		
	
	public abstract double perimetro();

	public int getIdFigura() {
		return idFigura;
	}

	public void setIdFigura(int idFigura) {
		this.idFigura = idFigura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFigura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura02 other = (Figura02) obj;
		return idFigura == other.idFigura;
	}

	@Override
	public String toString() {
		return "Figura [idFigura=" + idFigura + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
}
