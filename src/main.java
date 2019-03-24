import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		
		SmartPhone x1 = new SmartPhone( "Adroid" );
		
		System.out.println(x1.getNameOs());
		
		x1.installApp("HelloDroid");
		
		x1.installApp("WorldsDroid");
		
		x1.getApps();
		
		
	}

}
