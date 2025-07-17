package com.cursogetafe.jpa.ejemplo06herenciajoined;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "circulo_02")
public class Circulo extends Figura{
	
	@Column(name = "r")
	private double radio;
	
	public Circulo() {}
		
	public Circulo(double x,double y,double radio) {
		super(x,y);
		this.radio = radio;
			
	}

	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	@Override
	public double area() {
		return Math.PI*Math.pow(this.radio,2);
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI*this.radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}


	

	
	
}
