package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {
		
		//creo objeto clase orador que luego se manda a la db
		
		Orador nuevoOrador = new Orador("asd","asd","asd@asd.com","java", LocalDate.now());
		
		System.out.println(nuevoOrador);
		
	}

}
