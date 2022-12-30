package com.nttdata.spring.repository;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * Clase Abstracta
 * 
 * @author santiagomr
 *
 */

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;
}
