class Boat {
    private String model;
    private int capacity;

    public Boat(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void floatOnWater() {
        System.out.println("The boat is floating on the water.");
    }
}
