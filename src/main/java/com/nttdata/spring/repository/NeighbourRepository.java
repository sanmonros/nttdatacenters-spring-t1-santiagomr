package com.nttdata.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de vecinos
 * 
 * @author santiagomr
 *
 */
@Repository
public interface NeighbourRepository extends JpaRepository<Neighbour, Long> {

	/**
	 * Método para encontrar a un vecino por su nombre completo
	 * 
	 * @param name
	 * @param lastName
	 * @param secondLastName
	 * @return
	 */
	public List<Neighbour> findByNameAndLastNameAndSecondLastName(String name, String lastName, String secondLastName);
}
