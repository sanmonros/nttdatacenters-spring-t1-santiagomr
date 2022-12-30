package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.repository.Flat;
import com.nttdata.spring.repository.Floor;
import com.nttdata.spring.repository.Neighbour;

/**
 * Interfaz de Vecinos
 * 
 * @author santiagomr
 *
 */
public interface NeighbourManagementServiceI {

	/**
	 * Información de vecinos que componen el edificio
	 * 
	 * @return
	 */
	public List<Neighbour> searchAllNeighbours();

	/**
	 * Información del nombre completo de un vecino del edificio
	 * 
	 * @return
	 */
	public List<Neighbour> searchByFullName(String name, String lastName, String secondLastName);

	/**
	 * Insertar a un vecino
	 * 
	 * @param n(vecino)
	 */
	public void insertNeighbour(Neighbour n);

	/**
	 * Borrar a un vecino
	 * 
	 * @param id
	 */
	public void deleteNeighbour(Long id);

	/**
	 * Insertar una planta
	 * 
	 * @param f(planta)
	 */
	public void insertFloor(Floor f);

	/**
	 * Borrar una planta
	 * 
	 * @param id
	 */
	public void deleteFloor(Long id);

	/**
	 * Insertar un piso
	 * 
	 * @param fl(piso)
	 */
	public void insertFlat(Flat fl);

	/**
	 * Borrar un piso
	 * 
	 * @param id
	 */
	public void deleteFlat(Long id);
}
