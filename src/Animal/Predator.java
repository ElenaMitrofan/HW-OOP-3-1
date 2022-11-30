package Animal;

public class Predator extends Mammal{

    public Predator(String name, int year, String livingEnvironment, double speed, String typeOfFood) {
        super(name, year, livingEnvironment, speed, typeOfFood);
    }
    public void hunt(){
        System.out.println("Охотится");
    }
    public void eat() {
        System.out.println("Ест других животных");
    }
    public void go() {
        System.out.println("Передвигается на 4х лапах по земле");
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() +
                " Кличка животного: " + name +
                ", чем питается: " + typeOfFood +
                ", скорость передвижения - " + speed +
                "км/ч, полных лет - " + year +
                ", среда обитания: " + livingEnvironment  +
                ".";
    }
}
