package Transport;

public class Train extends Transport {
    private double tripPrice;
    private int tripTime;
    private String departureStationName;
    private String arrivalStationName;
    private int numberOfWagons;

//     Конструкторы

    public Train(String brand, String model, int year, String productionCountry, String color, int maxSpeed, double tripPrice, int tripTime, String departureStationName, String arrivalStationName, int numberOfWagons, double fuelPercentage) {
        super(brand, model, year, productionCountry, color, maxSpeed, fuelPercentage);

        this.numberOfWagons = numberOfWagons;
        if (tripPrice <= 0) {
            this.tripPrice = 1000;
        }else{
            this.tripPrice = tripPrice;
        }
        if (tripTime <= 0) {
            this.tripTime = 100;
        }else{
            this.tripTime = tripTime;
        }
        if (departureStationName == null || departureStationName == "") {
            this.departureStationName = "default";
        }else{
            this.departureStationName = departureStationName;
        }
        if (arrivalStationName == null || arrivalStationName == "") {
            this.arrivalStationName = "default";
        }else{
            this.arrivalStationName = arrivalStationName;
        }
    }

    public Train(String brand,
                 String model,
                 int year,
                 String productionCountry,
                 int maxSpeed,
                 String departureStationName,
                 String arrivalStationName,
                 double tripPrice,
                 int tripTime,
                 int numberOfWagons,
                 double fuelPercentage) {
        this (brand,
                model,
                year,
                productionCountry,
                "нет цвета",
                maxSpeed,
                tripPrice,
                tripTime,
                departureStationName,
                arrivalStationName,
                numberOfWagons,
                fuelPercentage);
    }


    //    Сеттеры и геттеры



    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        if (tripPrice <= 0) {
            this.tripPrice = 1000;
        }else{
            this.tripPrice = tripPrice;
        }
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        if (tripTime <= 0) {
            this.tripTime = 100;
        }else{
            this.tripTime = tripTime;
        }
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if (departureStationName == null || departureStationName == "") {
            this.departureStationName = "default";
        }else{
            this.departureStationName = departureStationName;
        }
    }

    public String getArrivalStationName() {
        return arrivalStationName;
    }

    public void setArrivalStationName(String arrivalStationName) {
        if (arrivalStationName == null || arrivalStationName == "") {
            this.arrivalStationName = "default";
        }else{
            this.arrivalStationName = arrivalStationName;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0) {
            this.numberOfWagons = 1;
        }else{
            this.numberOfWagons = numberOfWagons;
        }
    }

    @Override
    public String toString() {
        return String.format("Поезд " + getBrand()+
                ", модель " + getModel() +
                ", " + getYear() +
                " года выпуска, страна -  " + getProductionCountry() +
                ",  скорость передвижения — " +getMaxSpeed()+
                "км/ч, отходит от станции " + departureStationName +
                ", и следует до станции " + arrivalStationName + ". " +
                "Цена поездки - " + tripPrice +
                " рублей, время в пути - " + tripTime +
                " минут, в поезде " + numberOfWagons + " вагонов. Запас топлива - %.2f",fuelPercentage)+". ";
    }
    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем.");
        fuelPercentage = 100;
        System.out.println("Запас топлива " + fuelPercentage + "%.");
    }

}
