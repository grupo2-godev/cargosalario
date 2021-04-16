package br.com.proway.senior.cargosalario;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class CargoTest {

	@Test
	void cadastrarCargoTeste() {
		Cargo cargo = new Cargo(1, "Gerente", 4, "Supervisor", 500.40,LocalDateTime.now(),LocalDateTime.now(), "5842320-32", "21314", 55, "Superior Completo",
				"12 meses", "Desenvolvedor", "nenhuma", 1);
		
		cargo.setCbo94("1651515");
		
		
		assertEquals(1,cargo.getIdCargo());
		
		
	}

}
