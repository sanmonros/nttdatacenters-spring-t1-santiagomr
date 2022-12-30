package com.nttdata.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Respositorio de plantas
 * 
 * @author santiagomr
 *
 */
@Repository
public interface FloorRepository extends JpaRepository<Floor, Long> {

}
