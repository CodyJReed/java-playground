public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModal(String model) {
        String validModel = model.toLowerCase();
        
        if (validModel.equals("accord") || validModel.equals("civic")) {
            this.model = model;
        } 
        this.model = "Unknown";
    }

    public String getModel() {
        return this.model;
    }
}