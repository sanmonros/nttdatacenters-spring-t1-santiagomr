package com.nttdata.spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.repository.Flat;
import com.nttdata.spring.repository.Floor;
import com.nttdata.spring.repository.Neighbour;
import com.nttdata.spring.services.NeighbourManagementServiceI;

/**
 * Primer - Taller - Spring
 * 
 * Clase Principal
 * 
 * @author santiagomr
 *
 */
@SpringBootApplication()
public class NTTDataMainSpring implements CommandLineRunner {

	@Autowired
	private NeighbourManagementServiceI neighbourService;

	/**
	 * Método principal para inicializar nuestra aplicación
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMainSpring.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Generación de vecinos

		Neighbour n1 = new Neighbour();
		n1.setName("Santiago");
		n1.setLastName("Montaño");
		n1.setSecondLastName("Rosario");

		Neighbour n2 = new Neighbour();
		n2.setName("Clara");
		n2.setLastName("López");
		n2.setSecondLastName("Trujillo");

		Neighbour n3 = new Neighbour();
		n3.setName("Lidia");
		n3.setLastName("Moreno");
		n3.setSecondLastName("Huelva");

		Neighbour n4 = new Neighbour();
		n4.setName("Sergio");
		n4.setLastName("Serrano");
		n4.setSecondLastName("Molina");

		Neighbour n5 = new Neighbour();
		n5.setName("Claudia");
		n5.setLastName("Ríos");
		n5.setSecondLastName("Montalvo");

		// Insertar vecinos

		neighbourService.insertNeighbour(n1);
		neighbourService.insertNeighbour(n2);
		neighbourService.insertNeighbour(n3);
		neighbourService.insertNeighbour(n4);
		neighbourService.insertNeighbour(n5);

		// Borrar vecino con la ID 4
		neighbourService.deleteNeighbour(4L);

		// Generación de plantas de edificio
		Floor f1 = new Floor();
		f1.setFloorNumber(0L);
		f1.setFlatNumber(1L);

		Floor f2 = new Floor();
		f2.setFloorNumber(1L);
		f2.setFlatNumber(2L);

		// Insertar plantas
		neighbourService.insertFloor(f1);
		neighbourService.insertFloor(f2);

		// Generación de apartamentos
		Flat fl1 = new Flat();
		fl1.setFlatNumber(1L);
		fl1.setNeighbourId(n1);
		fl1.setFloorId(f1);

		Flat fl2 = new Flat();
		fl2.setFlatNumber(2L);
		fl2.setNeighbourId(n2);
		fl2.setFloorId(f1);

		// Insertar apartamentos
		neighbourService.insertFlat(fl1);
		neighbourService.insertFlat(fl2);

		// Buscar al vecino por nombre completo (Santiago Montaño Rosario)
		List<Neighbour> neighbourList = neighbourService.searchByFullName("Santiago", "Montaño", "Rosario");

		for (Neighbour neighbour : neighbourList) {
			System.out
					.println(neighbour.getName() + " " + neighbour.getLastName() + " " + neighbour.getSecondLastName());
		}

		// Listado de todos los vecinos del edificio
		List<Neighbour> allNeighbour = neighbourService.searchAllNeighbours();
		for (Neighbour neighbour : allNeighbour) {
			System.out.println(neighbour.toString());
		}

	}
}
