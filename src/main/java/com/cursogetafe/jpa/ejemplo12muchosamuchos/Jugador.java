package com.cursogetafe.jpa.ejemplo12muchosamuchos;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jugadores_03")
public class Jugador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idJugador;
	private Integer dorsal;
	
	@Column(name = "nombreyapellidos")
	private String nombre;
	private String licencia;
	
	@ManyToMany(mappedBy = "jugadores")
	private Set<Equipo> equipos;
	
	public Integer getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(Integer idJugador) {
		this.idJugador = idJugador;
	}
	public Integer getDorsal() {
		return dorsal;
	}
	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	public Set<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idJugador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(idJugador, other.idJugador);
	}
	@Override
	public String toString() {
		return "Jugador (" + idJugador + ", " + dorsal + ", " + nombre + ", " + licencia + ")";
	}
	
	
}
