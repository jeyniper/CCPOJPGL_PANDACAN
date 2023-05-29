
class ToyotaVIOS extends Vehicle {
	
    private String tireType;

    public ToyotaVIOS (double speed, String color, double price, String tireType) {
        super(speed, color, price);
        this.tireType = tireType;
    }

    public String getTireType() {
        return tireType;
    }

    @Override
    public void stop() {
        System.out.println("The car has stop.");
        System.out.println("************************");
        System.out.println();
    }

    public void drive() {
        System.out.println("The car is now driving...........");
    }
}