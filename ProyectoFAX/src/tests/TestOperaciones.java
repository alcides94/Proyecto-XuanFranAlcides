package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Cuenta;
import util.Operaciones;

class TestOperaciones {

	
	
	
	
	@Test
	void testCancelar() {
		boolean cuentaEsperada=true;
		boolean cuentaObtenida=Operaciones.cancelarCuenta(new Cuenta(23,"Xuan",34,true));
		assertEquals(cuentaEsperada, cuentaObtenida);	
	}

}
