package com.nttdata.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Respositorio de pisos
 * 
 * @author santiagomr
 *
 */
@Repository
public interface FlatRepository extends JpaRepository<Flat,Long> {

}
