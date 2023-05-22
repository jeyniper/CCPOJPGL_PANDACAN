
class U2SpyPlane extends Plane {
    private double wingspan;

    public U2SpyPlane(String model, int capacity, double wingspan) {
        super(model, capacity);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public void fly() {
        System.out.println("The U-2 Spy Plane is flying at high altitudes for reconnaissance.");
    }
}