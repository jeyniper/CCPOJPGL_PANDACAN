
class U2SpyPlane extends Vehicle {
	
    private double wingspan;

    public U2SpyPlane (double speed, String color, double price, double wingspan) {
        super(speed, color, price);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public void stop() {
        System.out.println("The plane has landed.");
        System.out.println("************************");
        System.out.println();
    }

    public void fly() {
        System.out.println("The plane is flying dash the clouds.......");
    }
}