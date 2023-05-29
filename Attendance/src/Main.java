
public class Main {
    
	public static void main(String[] args) {
		
		ToyotaVIOS car = new ToyotaVIOS (150.0, "Pink", 3548647.48, "Radial");
        
		System.out.println();
		System.out.println("'TOYOTA-VIOS'");
        System.out.println("Car color: " + car.getColor());
        System.out.println("Speed: " + car.getSpeed() + " km/h");
        System.out.println("Price: PHP " + car.getPrice());
        System.out.println("Tire Type: " + car.getTireType());
        
        car.drive();
        car.stop();

        FandangoYacht boat = new FandangoYacht (30.0, "White", 2803925.00, "Purple");
        
		System.out.println("'FANDANGO YACHT'");
        System.out.println("Boat color: " + boat.getColor());
        System.out.println("Speed: " + boat.getSpeed() + " knots");
        System.out.println("Price: PHP " + boat.getPrice());
        System.out.println("Main Sail Color: " + boat.getMainSailColor());
        
        boat.floatOnWater();
        boat.stop();

        U2SpyPlane plane = new U2SpyPlane (900.0, "Silver", 50000000.00, 30.0);
        
        System.out.println("'U-2 SPY PLANE'");
        System.out.println("Plane color: " + plane.getColor());
        System.out.println("Speed: " + plane.getSpeed() + " mph");
        System.out.println("Price: PHP " + plane.getPrice());
        System.out.println("Wingspan: " + plane.getWingspan() + " meters");
        
        plane.fly();
        plane.stop();
    }
}