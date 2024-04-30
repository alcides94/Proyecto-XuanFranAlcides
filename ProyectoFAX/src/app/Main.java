package app;




import Modelo.Cliente;
import Modelo.Cuenta;
import util.Operaciones;
public class Main {

	public static void main(String[] args) {
		Cliente C1=new Cliente ("Xuan","Dong",33);
		Cliente C2=new Cliente ("Alcides","Quinteros",30);
		Cuenta Cu1=new Cuenta(23,"Xuan",34,true);
		Cuenta Cu2=new Cuenta(24,"Alcides",45,false);
		
		Operaciones op1 = new Operaciones ();
		
		op1.transferencias(Cu1, Cu2, 10);
		
	}

}
