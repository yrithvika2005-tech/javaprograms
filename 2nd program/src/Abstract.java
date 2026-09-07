// Abstract abstract class 
abstract class vehicle
 {
	
	 abstract void drive();
	 void applyGear() {
		 System.out.println("Applying break");
	 }

	  class Car extends vehicle 
 {
	 void drive()
	 {
		 System.out.println("Driving a car");
	 }
	 void changeGear()
	 {
		 System.out.println("Changing Gear");
	 }
	 
 }
public class AbstractDemo {


	public static void main(String[] args) {
		//vehicle v = new vehicle();//error
		vehicle v= new Car();
		v.drive();
	   v.applyBreak();
		//v.changeGear();//error
	    Car c = new Car();
		c.changeGear();
	}
	
}