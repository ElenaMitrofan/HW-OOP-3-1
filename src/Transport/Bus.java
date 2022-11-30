package Transport;

public class Bus extends Transport{
    private String appointment;


    public Bus(String brand, String model, int year, String productionCountry, String color, int maxSpeed, String appointment, double fuelPercentage) {
        super(brand, model, year, productionCountry, color, maxSpeed, fuelPercentage);
        if (appointment == null || appointment == "") {
            this.appointment = "междугородний";
        }else{
            this.appointment = appointment;
        }
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        if (appointment == null || appointment == "") {
            this.appointment = "междугородний";
        }else{
            this.appointment = appointment;
        }
    }

    @Override
    public String toString() {
        return String.format("Автобус " + getBrand() +
                ", модель " + getModel() +
                ", " + getYear() +
                " года выпуска, страна -  " + getProductionCountry() +
                ",  скорость передвижения — " + getMaxSpeed() +
                "км/ч. Назначение - " + appointment  +
                ". Запас топлива - %.2f",fuelPercentage) + ". ";
    }
    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
        fuelPercentage = 100;
        System.out.println("Запас топлива " + fuelPercentage + "%.");
    }
}

