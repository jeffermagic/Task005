package methodoveriding;
//creating a parent class

public class Sumo {
	void run(){System.out.println("Vehicle is running");}
}
//creating a child class
	class Fortuner extends Sumo {
	 void run(){System.out.println("Car is running safely");}  
	public static void main(String[] args) {
		//creating an instance of child class  
		Fortuner obj =new Fortuner ();
		//calling the method with child class instance  
		 obj.run();
		

	}

}
