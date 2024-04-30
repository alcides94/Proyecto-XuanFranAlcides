package tests;

import util.Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Cuenta;
import util.Operaciones;

class TestOperaciones {

	
	
	
	
	@Test
<<<<<<< HEAD
	void testTranferencia() {
		int TransferenciaEsperada=20;
		int TransferenciaObtenida=Operaciones.transferencias(10);;
		assertEquals(TransferenciaEsperada,TransferenciaObtenida);
=======
	void testCancelar() {
		boolean cuentaEsperada=true;
		boolean cuentaObtenida=Operaciones.cancelarCuenta(new Cuenta(23,"Xuan",34,true));
		assertEquals(cuentaEsperada, cuentaObtenida);	
>>>>>>> d36e93d9e5cb1d0966951e52cc302ed44230494e
	}

}
