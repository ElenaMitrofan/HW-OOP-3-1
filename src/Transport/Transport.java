package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String productionCountry;
    private String color;
    private int maxSpeed;
    protected double fuelPercentage;

    public Transport(String brand, String model, int year, String productionCountry, String color, int maxSpeed, double fuelPercentage) {

        this.productionCountry = productionCountry;
        if (brand == null || brand == "") {
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "default";
        }else{
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        }else{
            this.year = year;
        }
        if (color == null || color == "") {
            this.color = "default";
        }else{
            this.color = color;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        }else{
            this.maxSpeed = maxSpeed;
        }
        if (fuelPercentage <= 0) {
            this.fuelPercentage = 57.49;
        }else{
            this.fuelPercentage = fuelPercentage;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand == "") {
            this.brand = "default";
        }else{
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model == "") {
            this.model = "default";
        }else{
            this.model = model;
        }
    }

    public int getYear() {
        return year;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color == "") {
            this.color = "default";
        }else{
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage <= 0) {
            this.fuelPercentage = 57.49;
        }else{
            this.fuelPercentage = fuelPercentage;
        }
    }

    public abstract void refill();
}
