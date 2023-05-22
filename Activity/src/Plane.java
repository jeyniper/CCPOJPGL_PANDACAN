
class Plane {
	
    private String model;
    private int capacity;

    public Plane(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void fly() {
        System.out.println("The plane is flying.");
    }
}