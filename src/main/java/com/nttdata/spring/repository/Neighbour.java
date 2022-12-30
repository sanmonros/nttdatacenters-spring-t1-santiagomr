package com.nttdata.spring.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Clase Vecino
 * 
 * @author santiagomr
 *
 */
@Entity
@Table(name = "NEIGHBOUR")
public class Neighbour extends AbstractEntity implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador vecino */
	private Long neighbourId;

	/** Nombre de vecino */
	private String name;

	/** Primer apellido de vecino */
	private String lastName;

	/** Seguno apellido de vecino */
	private String secondLastName;

	/**
	 * Devolver el ID del vecino
	 * 
	 * @return the neighbourId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NEIGHBOUR_ID")
	public Long getNeighbourId() {
		return neighbourId;
	}

	/**
	 * Fijar el ID del vecino
	 * 
	 * @param neighbourId the neighbourId to set
	 */
	public void setNeighbourId(Long neighbourId) {
		this.neighbourId = neighbourId;
	}

	/**
	 * Devolver el nombre del vecino
	 * 
	 * @return the name
	 */
	@Column(name = "NEIGHBOUR_NAME")
	public String getName() {
		return name;
	}

	/**
	 * Fijar el nombre del vecino
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Devolver el primer apellido del vecino
	 * 
	 * @return the lastName
	 */
	@Column(name = "NEIGHBOUR_LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	/**
	 * Fijar el primer apellido del vecino
	 * 
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Devolver el segundo apellido del vecino
	 * 
	 * @return the secondLastName
	 */
	@Column(name = "NEIGHBOUR_SECOND_LAST_NAME")
	public String getSecondLastName() {
		return secondLastName;
	}

	/**
	 * Fijar el segundo apellido del vecino
	 * 
	 * @param secondLastname the secondLastName to set
	 */
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	@Override
	public String toString() {
		return "Neighbour [neighbourId=" + neighbourId + ", name=" + name + ", lastName=" + lastName
				+ ", secondLastname=" + secondLastName + "]";
	}

	/**
	 * Devolver la clase
	 * 
	 * @return
	 */
	@Transient
	public Class<?> getClase() {
		return Neighbour.class;
	}

}
