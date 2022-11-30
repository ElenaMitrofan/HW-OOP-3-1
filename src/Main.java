import Animal.*;
import Transport.Bus;
import Transport.Car;
import Transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", (Math.random()*100));
        System.out.println(lada);
        lada.isRegistrationNumberCorrect();
        lada.refill();
        System.out.println();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", (Math.random()*100));
        audi.setInsurance(new Car.Insurance(LocalDate.now(), 40_000, "12345678"));
        System.out.println(audi);
        audi.getInsurance().checkNumber();
        audi.getInsurance().checkValidity();
        System.out.println();
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", (Math.random()*100));
        bmw.setKey(new Car.Key(true, true));
        System.out.println(bmw);
        System.out.println();
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", (Math.random()*100));
        kia.setCarTires("зимняя");
        System.out.println(kia);
        System.out.println();
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", (Math.random()*100));
        hyundai.setRegistrationNumber("а665ен");
        System.out.println(hyundai);
        System.out.println(hyundai.isRegistrationNumberCorrect());

        System.out.println();

        Train martlet = new Train("Ласточка", "B-901", 2011, "Россия", 301, "Белорусскй вокзал", "Минск-Пассажирский", 3500, 0, 11, (Math.random()*100));
        System.out.println(martlet);
        Train leningrad = new Train("Ленинград", "BD-125", 2019, "Россия", 270, "Ленинградский вокзал", "Ленинград-Пассажирский", 1700, 0, 8, (Math.random()*100));
        System.out.println(leningrad);
        leningrad.refill();

        System.out.println();

        Bus zis = new Bus("ЗИС-154", "ПАЗ-561", 1946, "СССР", "Бело-красный", 0, "для коротких загородных маршрутов или служебных нужд", (Math.random()*100));
        System.out.println(zis);
        Bus altrena = new Bus("Альтерна", "4216", 1993, "СССР", "Белый", 0, "междугородный", (Math.random()*100));
        System.out.println(altrena);
        Bus raf = new Bus("РАФ", "2203", 1960, "СССР", "Синий", 0, "пассажирский", (Math.random()*100));
        System.out.println(raf);
        raf.refill();

        System.out.println();

        Herbivore gazelle = new Herbivore("Грация", 5, "степь", 50, "растения");
        System.out.println(gazelle);
        Herbivore giraffe = new Herbivore("Длинный", 6, "саванна", 55, "растения");
        System.out.println(giraffe);

        Herbivore horse = new Herbivore("Быстрый", 6, "хлев", 16, "растения");
        System.out.println(horse);
        Predator hyena = new Predator("Смешнявочка", 9, "степь", 64, "другие животные");
        System.out.println(hyena);
        Predator tiger = new Predator("Полосатик", 7, "джунгли", 64, "другие животные");
        System.out.println(tiger);
        Predator bear = new Predator("Пушистик", 8, "леса", 64, "другие животные");
        System.out.println(bear);
        Amphibian frog1 = new Amphibian("Липучка", 2, "земноводный");
        System.out.println(frog1);
        Amphibian frog2 = new Amphibian("Липучка", 2, "земноводный");
        System.out.println(frog2);
        boolean equals = frog1.equals(frog2);
        System.out.println(equals);

        Amphibian snake = new Amphibian("Клиповый", 1, "земноводный");
        System.out.println(snake);
        Flightless peacock = new Flightless("Павлуша", 1, "джунгли / леса", "нелетающий");
        System.out.println(peacock);
        Flightless penguin = new Flightless("Милашка", 2, "Антарктида", "нелетающий");
        System.out.println(penguin);
        Flightless dodo = new Flightless("Пицца", 10, "Маврикий", "нелетающий");
        System.out.println(dodo);
        Flying gull = new Flying("Джонатан Ливингстон", 3, "в небе", "летающий");
        System.out.println(gull);
        Flying albatross = new Flying("Красавчик", 2, "в небе", "летающий");
        System.out.println(albatross);
        Flying falcon = new Flying("Ракета", 5, "в небе", "летающий");
        System.out.println(falcon);

    }
}