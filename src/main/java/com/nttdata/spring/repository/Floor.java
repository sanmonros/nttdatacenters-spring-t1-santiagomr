package com.nttdata.spring.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Clase Planta
 * 
 * @author santiagomr
 *
 */
@Entity
@Table(name = "FLOOR")
public class Floor extends AbstractEntity implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Primary Key */
	private Long floorId;

	/** Número de planta */
	private Long floorNumber;

	/** Número de piso */
	private Long flatNumber;

	/** Lista de pisos asociados */
	private List<Flat> flats;

	/**
	 * Devolver el ID de la planta
	 * 
	 * @return the floorId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FLOOR_ID")
	public Long getFloorId() {
		return floorId;
	}

	/**
	 * Fijar el ID de la planta
	 * 
	 * @param floorId the floorId to set
	 */
	public void setFloorId(Long floorId) {
		this.floorId = floorId;
	}

	/**
	 * Devolver el número de la planta
	 * 
	 * @return the floorNumber
	 */
	@Column(name = "FLOOR_NUMBER")
	public Long getFloorNumber() {
		return floorNumber;
	}

	/**
	 * Fijar el número de la planta
	 * 
	 * @param floorNumber the floorNumber to set
	 */
	public void setFloorNumber(Long floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 * Devolver el número del piso
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
	 * Devolver la lista de pisos
	 * 
	 * @return the flats
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "floorId")
	public List<Flat> getFlats() {
		return flats;
	}

	/**
	 * Fijar la lista de pisos
	 * 
	 * @param flats the flats to set
	 */
	public void setFlats(List<Flat> flats) {
		this.flats = flats;
	}

	@Override
	public String toString() {
		return "Floor [floorId=" + floorId + ", floorNumber=" + floorNumber + ", flatNumber=" + flatNumber + "]";
	}

	/**
	 * Devolver la clase
	 * 
	 * @return
	 */
	@Transient
	public Class<?> getClase() {
		return Floor.class;
	}

}
