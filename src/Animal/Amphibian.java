package Animal;

public class Amphibian extends Animal{

    public Amphibian(String name, int year, String livingEnvironment) {
        super(name, year, livingEnvironment);
    }
    public void hunt(){
        System.out.println("Охотится");
    }
    public void eat() {
        System.out.println("Ест других животных");
    }
    public void go() {
        System.out.println("Передвигается по земле и по воде");
    }

    @Override
    public String toString() {
        return "Класс: " + getClass() +
                " Кличка животного: " + name +
                ", полных лет - " + year +
                ", среда обитания: " + livingEnvironment + ". ";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
