package p1;

public class Bluetooth {
    boolean connection;
	
	public Bluetooth(boolean connection) {
		super();
		this.connection = connection;
	}
	public Bluetooth() {
		// TODO Auto-generated constructor stub
	}
	public boolean isConnection() {
		return connection;
	}
	public void setConnection(boolean connection) {
		this.connection = connection;
	}

}
