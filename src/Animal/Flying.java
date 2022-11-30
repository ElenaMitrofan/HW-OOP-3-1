package Animal;

public class Flying extends Bird {

    public Flying(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment, movementType);
    }

    public void walk() {
        System.out.println("Летает");
    }
    public void eat() {
        System.out.println("Ест других животных / едят растения");
    }
    public void go() {
        System.out.println("Передвигается по воздуху");
    }
    @Override
    public String toString() {
        return "Класс: " + getClass() +
                " Кличка животного: " + name +
                ", полных лет - " + year +
                ", среда обитания: " + livingEnvironment +
                ", тип перемещения -  " + getMovementType() + ".";
    }
}
