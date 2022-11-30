package Animal;

public  class Flightless extends Bird{

    public Flightless(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment, movementType);
    }
    public void walk(){
        System.out.println("Гуляет");
    }
    public void eat() {
        System.out.println("Ест других животных / едят растения");
    }
    public void go() {
        System.out.println("Передвигается по земле и по воде");
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
