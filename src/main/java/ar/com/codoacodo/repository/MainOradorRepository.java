package ar.com.codoacodo.repository;

import java.time.LocalDate;

import ar.com.codoacodo.entity.Orador;

// Cambie tabla db de oradores a orador id_orador a id!!!!!!
public class MainOradorRepository {

	 public static void main(String[] args) {
		
		 //Interface i = new ClaseQueImplementa();
		 OradorRepository repository = new MySqlOradorRepository();
		 
		/* Orador newOrador = new Orador("carlos", "lopez", "123@mail.com", "java", LocalDate.now()); //LocalDate.now()
		 repository.save(newOrador);
		 */
		 
		 //obtener un orador desde la db
		 //Orador orador = repository(getById(newOrador.getId));
		 
		 //List<Orador> listado = repository.findAll();
		 
		// System.out.println(listado);
		 
		 Orador newOrador = repository.getById(4L);
		 
		 System.out.println(newOrador);
	 }
	 }