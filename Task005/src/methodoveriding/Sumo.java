package methodoveriding;

public class Sumo {
	void run(){System.out.println("Vehicle is running");}
}
	class Fortuner extends Sumo {
	 void run(){System.out.println("Car is running safely");}  
	public static void main(String[] args) {
		Fortuner obj =new Fortuner ();
		 obj.run();
		

	}

}
