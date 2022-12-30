
package com.nttdata.spring.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Clase Piso
 * 
 * @author santiagomr
 *
 */
@Entity
@Table(name = "FLAT")
public class Flat extends AbstractEntity implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Etiqueta (PK) */
	private Long flatId;

	/** Numero de piso **/
	private Long flatNumber;

	/** Vecino relacionado (FK) */
	private Neighbour neighbourId;

	/** Planta relacionada (FK) */
	private Floor floorId;

	/**
	 * Recupera el ID del piso
	 * 
	 * @return the flatId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FLAT_ID")
	public Long getFlatId() {
		return flatId;
	}

	/**
	 * Fijar el valor del ID del piso
	 * 
	 * @param flatId the flatId to set
	 */
	public void setFlatId(Long flatId) {
		this.flatId = flatId;
	}

	/**
	 * Recuperar el número del piso
	 * 
	 * @return the flatNumber
	 */
	@Column(name = "FLAT_NUMBER")
	public Long getFlatNumber() {
		return flatNumber;
	}

	/**
	 * Fijar el número del piso
	 * 
	 * @param flatNumber the flatNumber to set
	 */
	public void setFlatNumber(Long flatNumber) {
		this.flatNumber = flatNumber;
	}

	/**
	 * Recuperar el ID de vecino
	 * 
	 * @return the neighbourId
	 */
	@OneToOne
	@JoinColumn(name = "NEIGHBOUR_ID")
	public Neighbour getNeighbourId() {
		return neighbourId;
	}

	/**
	 * Fijar el ID de vecino
	 * 
	 * @param neighbourId the neighbourId to set
	 */
	public void setNeighbourId(Neighbour neighbourId) {
		this.neighbourId = neighbourId;
	}

	/**
	 * Recuperar el ID de la planta
	 * 
	 * @return the floorId
	 */
	@ManyToOne
	@JoinColumn(name = "FLOOR_ID")
	public Floor getFloorId() {
		return floorId;
	}

	/**
	 * Fijar el ID de la planta
	 * 
	 * @param floorId the floorId to set
	 */
	public void setFloorId(Floor floorId) {
		this.floorId = floorId;
	}

	/**
	 * Devolver la clase
	 * 
	 * @return Class
	 */
	@Transient
	public Class<?> getClase() {
		return Flat.class;
	}
}
