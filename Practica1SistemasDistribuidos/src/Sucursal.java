
public class Sucursal {
	Cliente[] Client;
	String Name;
	String Tell;
	String Direction;
	String Type;
	
	
	public Sucursal(Cliente[] client, String name, String tell, String direction, String type) {
		super();
		Client = client;
		Name = name;
		Tell = tell;
		Direction = direction;
		Type = type;
	}
	public Sucursal() {

	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTell() {
		return Tell;
	}
	public void setTell(String tell) {
		Tell = tell;
	}
	public String getDirection() {
		return Direction;
	}
	public void setDirection(String direction) {
		Direction = direction;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public void redirigir(Cliente[] VClientes) {
		Cajero cajero1= new Cajero(VClientes);
		cajero1.start();
		cajero1.start();
		cajero1.start();
	}
	
	
	
}
