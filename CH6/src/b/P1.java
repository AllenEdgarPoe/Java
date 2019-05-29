package b;

public class P1 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("company: "+ myCar.company);
		System.out.println("model: "+ myCar.model);
		System.out.println("color: "+ myCar.color);
		System.out.println("max speed: "+ myCar.maxSpeed);
		System.out.println("current speed: "+ myCar.speed);
		
		myCar.speed = 60;
		System.out.println("revised speed: "+ myCar.speed);
	}
}