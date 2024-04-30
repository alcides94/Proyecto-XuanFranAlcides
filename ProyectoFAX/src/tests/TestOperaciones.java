package tests;

import util.Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOperaciones {

	@Test
	void testTranferencia() {
		int TransferenciaEsperada=20;
		int TransferenciaObtenida=Operaciones.transferencias(10);;
		assertEquals(TransferenciaEsperada,TransferenciaObtenida);
	}

}
