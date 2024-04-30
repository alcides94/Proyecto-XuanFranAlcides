package Modelo;

public class Cuenta {
	/**
	 * crear la variable de los iban,clientes,cantidad,estado
	 */
	private int iban;
	private String clientes;
	private int cantidad;
	private boolean estado ;
	/**
	 * 
	 * @param iban
	 * @param clientes
	 * @param cantidad
	 * @param estado
	 */
	public Cuenta(int iban, String clientes, int cantidad, boolean estado) {
		this.iban = iban;
		this.clientes = clientes;
		this.cantidad = cantidad;
		this.estado = true;
	}
	public int getIban() {
		return iban;
	}
	public void setIban(int iban) {
		this.iban = iban;
	}
	public String getClientes() {
		return clientes;
	}
	public void setClientes(String clientes) {
		this.clientes = clientes;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
