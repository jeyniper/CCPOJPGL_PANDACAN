public class Main {
    public static void main(String[] args) {
        Boat boat = new Boat("Speedboat", 4);
        System.out.println("Boat model: " + boat.getModel());
        System.out.println("Capacity: " + boat.getCapacity());
        boat.floatOnWater();

        FandangoYacht yacht = new FandangoYacht("Fandango", 8, "White");
        System.out.println("Yacht model: " + yacht.getModel());
        System.out.println("Capacity: " + yacht.getCapacity());
        System.out.println("Main Sail Color: " + yacht.getMainSailColor());
        yacht.floatOnWater();
    }
}