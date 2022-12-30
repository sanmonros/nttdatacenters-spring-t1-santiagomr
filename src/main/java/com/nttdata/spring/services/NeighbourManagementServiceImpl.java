package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Flat;
import com.nttdata.spring.repository.FlatRepository;
import com.nttdata.spring.repository.Floor;
import com.nttdata.spring.repository.FloorRepository;
import com.nttdata.spring.repository.Neighbour;
import com.nttdata.spring.repository.NeighbourRepository;

/**
 * Servicio de Vecinos
 * 
 * @author santiagomr
 *
 */
@Service
public class NeighbourManagementServiceImpl implements NeighbourManagementServiceI {

	@Autowired
	FlatRepository flatRe;

	@Autowired
	FloorRepository floorRe;

	@Autowired
	NeighbourRepository neighbourRe;

	@Override
	public List<Neighbour> searchAllNeighbours() {
		return neighbourRe.findAll();
	}

	@Override
	public List<Neighbour> searchByFullName(String name, String lastName, String secondLastName) {
		return neighbourRe.findByNameAndLastNameAndSecondLastName(name, lastName, secondLastName);
	}

	@Override
	public void insertNeighbour(Neighbour n) {
		neighbourRe.save(n);

	}

	@Override
	public void deleteNeighbour(Long id) {
		neighbourRe.deleteById(id);

	}

	@Override
	public void insertFloor(Floor f) {
		floorRe.save(f);

	}

	@Override
	public void deleteFloor(Long id) {
		floorRe.deleteById(id);

	}

	@Override
	public void insertFlat(Flat fl) {
		flatRe.save(fl);

	}

	@Override
	public void deleteFlat(Long id) {
		flatRe.deleteById(id);

	}

}
