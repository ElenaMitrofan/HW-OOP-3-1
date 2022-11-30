package Animal;

import java.util.Objects;

public class Herbivore extends Mammal{

    public Herbivore(String name, int year, String livingEnvironment, double speed, String typeOfFood) {
        super(name, year, livingEnvironment, speed, typeOfFood);
    }

    public void graze(){
        System.out.println("Пасётся");
    }
    @Override
    public void eat() {
        System.out.println("Ест растения");
    }
    @Override
    public void go() {
        System.out.println("Передвигается на 4х лапах по земле и по деревьям");
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() +
                " Кличка животного: " + name +
                ", чем питается: " + typeOfFood +
                ", скорость передвижения - " + speed +
                "км/ч, полных лет - " + year +
                ", Среда обитания: " + livingEnvironment  +
                ".";
    }
}
