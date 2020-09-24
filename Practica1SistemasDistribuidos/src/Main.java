import java.util.Random;
public class Main {

	public static void main (String args[]) {
		Random rd = new Random();
		Cliente[] cliente1 =  new Cliente[3];
		Cliente[] cliente2 =  new Cliente[2];
		Cliente[] cliente3 =  new Cliente[15];
		for(int i=0;i<cliente1.length;i++) {
			cliente1[i] = new Cliente(1,rd.nextBoolean());
		}
		for(int i=0;i<cliente2.length;i++) {
			cliente1[i] = new Cliente(1,rd.nextBoolean());
		}
		for(int i=0;i<cliente3.length;i++) {
			cliente1[i] = new Cliente(1,rd.nextBoolean());
		}
		Operation operacion = new Operation();
		operacion.redirec(cliente1,cliente2,cliente3);
	}
	
}