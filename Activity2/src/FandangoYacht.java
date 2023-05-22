class FandangoYacht extends Boat {
    private String mainSailColor;

    public FandangoYacht(String model, int capacity, String mainSailColor) {
        super(model, capacity);
        this.mainSailColor = mainSailColor;
    }

    public String getMainSailColor() {
        return mainSailColor;
    }

    @Override
    public void floatOnWater() {
        System.out.println("The Fandango Yacht is floating gracefully on the water.");
    }
}