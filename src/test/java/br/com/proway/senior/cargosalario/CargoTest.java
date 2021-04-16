package br.com.proway.senior.cargosalario;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CargoTest {

	@Test
	void testCadastrarCargo() {
		Cargo cargo = new Cargo(1, "Gerente", 4, "Supervisor", 500.40, LocalDateTime.now(), LocalDateTime.now(),
				"5842320-32", "21314", 55, "Superior Completo", "12 meses", "Desenvolvedor", "nenhuma", 1);

		cargo.setCbo94("1651515");

		assertEquals(1, cargo.getIdCargo());

	}
	
	@Test
	public void testCadastrarCargo2() {
		Cargo cargo = new Cargo(1, "desenvolvedor");
		ArrayList<Cargo> listaCargo = new ArrayList<Cargo>();	
		listaCargo.add(cargo);
		
		System.out.println(listaCargo);
		
		Cargo cargo2 = new Cargo(2, "Tester");
		listaCargo.add(cargo2);
		System.out.println(listaCargo.get(0));
		System.out.println(listaCargo.get(1));
		
		 CargoService cs = new CargoService();
		 cs.cadastrarCargo(cargo, listaCargo);
		 System.out.println(cs.cadastrarCargo(cargo, listaCargo));
		assertTrue(!listaCargo.isEmpty());
	}
	
	 @Test//TODO
	 public void testRemoverCargo() {
		 Cargo cargo = new Cargo(1, "desenvolvedor");
			ArrayList<Cargo> listaCargo = new ArrayList<Cargo>();	
			listaCargo.add(cargo);
			
			System.out.println(listaCargo);
			
			Cargo cargo2 = new Cargo(2, "Tester");
			listaCargo.add(cargo2);
			System.out.println(listaCargo.get(0));
			System.out.println(listaCargo.get(1));
			
			 CargoService cs = new CargoService();
			 cs.cadastrarCargo(cargo, listaCargo);
			 System.out.println(cs.cadastrarCargo(cargo, listaCargo));
	 }
	 
}