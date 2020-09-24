
public class Cajero extends Thread {
	Cliente[] clientes;
	static int contador;
	int pri;
	int cont;
	public Cajero(Cliente[] clientes) {
		super();
		this.clientes = clientes;
		//this.pri=pri;
	}

	public void depositar() {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void retirar() {
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
public void run() {
		
		
		while(cont<clientes.length) {
		contador++;
		cont=contador-1;
		if(clientes[cont].getClientType()==pri && ) {
			depositar();
			retirar();
		}else{
			
			}
		
		}
		contador=0;
}
}
