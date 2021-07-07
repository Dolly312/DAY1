package p1;

public class DemoMail {
	public static void main(String[] args) {
		Memory m= new Memory(200);
		Bluetooth bt = new Bluetooth(true);
		 ElectronicDevice d1=new Computer(150,200,1234,m,bt);
		 d1.powerConsumption();
		 d1.deviceNumber();
		  ElectronicDevice d2=new Laptop(250,100,125,m,bt);
		  d2.powerConsumption();
		  d2.deviceNumber();
		  ElectronicDevice d3=new Camera(350,150,234,m,bt);
		  d3.powerConsumption();
		  d3.deviceNumber();
		  ElectronicDevice d4=new TV(400,150,2774,m,bt);
		  d4.powerConsumption();
		  d4.deviceNumber();
		  ElectronicDevice d5=new AC(700,150,00034,m,bt);
		  d5.powerConsumption();
		  d5.deviceNumber();
		  ElectronicDevice d6=new WashingMachine(1000,150,99934,m,bt);
		  d6.powerConsumption();
		  d6.deviceNumber();
		  ElectronicDevice d7=new Moble(3000,150,26664,m,bt);
		  d7.powerConsumption();
		  d7.deviceNumber();
	}

}
