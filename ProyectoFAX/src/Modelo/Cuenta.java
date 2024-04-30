package Modelo;

public class Cuenta {
	private int iban;
	private String clientes;
	private int cantidad;
	private boolean estado ;
	public Cuenta(int iban, String clientes, int cantidad, boolean estado) {
		this.iban = iban;
		this.clientes = clientes;
		this.cantidad = cantidad;
		this.estado = true;
	}
	
	public void transferencia () {
		
	}
	
}
