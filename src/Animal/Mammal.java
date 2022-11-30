package Animal;

import java.util.Objects;

public abstract class Mammal extends Animal{
    protected final double speed;
    protected final String typeOfFood;

    public Mammal(String name, int year, String livingEnvironment, double speed, String typeOfFood) {
        super(name, year, livingEnvironment);
        if (speed <= 0) {
            this.speed = 1.1;
        }else{
            this.speed = speed;
        }
        if (typeOfFood == null || typeOfFood == "") {
            this.typeOfFood = "тип пищи";
        }else{
            this.typeOfFood = typeOfFood;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void walk(){
        System.out.println("Гуляет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammal mammal = (Mammal) o;
        return super.equals(o) && Double.compare(mammal.speed, speed) == 0 && Objects.equals(typeOfFood, mammal.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, typeOfFood);
    }
}
