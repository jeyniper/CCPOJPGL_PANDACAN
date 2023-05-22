
public class Main {
    public static void main(String[] args) {
    	
        Plane plane = new Plane("Boeing 747", 300);
        System.out.println("Plane model: " + plane.getModel());
        System.out.println("Capacity: " + plane.getCapacity());
        plane.fly();

        U2SpyPlane spyPlane = new U2SpyPlane("U-2", 2, 80.0);
        System.out.println("Spy Plane model: " + spyPlane.getModel());
        System.out.println("Capacity: " + spyPlane.getCapacity());
        System.out.println("Wingspan: " + spyPlane.getWingspan());
        
 
        spyPlane.fly();
    }
}