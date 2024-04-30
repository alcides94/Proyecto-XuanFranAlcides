package util;

import Modelo.Cuenta;

public class Operaciones {
	
	
	/**
	 * Realiza la tranferencia de dienero entre cuenta de origen a destino
	 * 
	 * @param cuentaOrigen	se especifica la cuenta de donde se sacara la cantidad
	 * @param cuentaDestino	se especifica la cuenta de donde se depositara la cantida enviada
	 * @param cantidad		se recibe la cantidad que se enviara a la cuenta de destino
	 */
	public void transferencias (Cuenta cuentaOrigen, Cuenta cuentaDestino, int cantidad) {
		
		cuentaDestino.setCantidad=cuentaDestino.getCantidad+cantidad;
		
		cuentaOrigen.setCantidad=cuentaOrigen.getCantidad-cantidad;
		
	}
	

	
	
}
