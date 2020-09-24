
public class  Cliente implements Persona {
	
	String Name;
	String Direction;
	boolean tarea;
	int ClientType;
	int orden;
	public Cliente(int clientType, boolean tarea) {
		super();
		tarea =tarea;
		Name = "Juan";
		Direction = "Caller Peru";
		this.ClientType = clientType;
		this.tarea = tarea;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDirection() {
		return Direction;
	}
	public void setDirection(String direction) {
		Direction = direction;
	}
	public int getClientType() {
		return ClientType;
	}
	public void setClientType(int clientType) {
		ClientType = clientType;
	}
	
	@Override
	public void Deposite() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Retiro() {
		// TODO Auto-generated method stub
		
	}
}
