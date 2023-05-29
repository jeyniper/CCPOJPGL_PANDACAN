
class FandangoYacht extends Vehicle {
	
    private String mainSailColor;
    public FandangoYacht 
    
   (double speed, String color, double price, String mainSailColor) {
        super(speed, color, price);
        this.mainSailColor = mainSailColor;
    }

    public String getMainSailColor() {
        return mainSailColor;
    }

    @Override
    public void stop() {
        System.out.println("The boat has stopped sailing in the middle of the ocean.");
        System.out.println("************************");
        System.out.println();
    }

    public void floatOnWater() {
        System.out.println("The boat is sailing across the ocean.......");
    }
}