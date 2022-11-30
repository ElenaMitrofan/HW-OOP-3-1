package Animal;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected int year;
    protected String livingEnvironment;

    public Animal(String name, int year, String livingEnvironment) {
        if (name == null || name == "") {
            this.name = "name";
        }else{
            this.name = name;
        }
        if (year <= 0) {
            this.year = 200;
        }else{
            this.year = year;
        }
        if (name == livingEnvironment || name == "") {
            this.livingEnvironment = "livingEnvironment";
        }else{
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name == "") {
            this.name = "name";
        }else{
            this.name = name;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            this.year = 1;
        }else{
            this.year = year;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (name == livingEnvironment || name == "") {
            this.livingEnvironment = "livingEnvironment";
        }else{
            this.livingEnvironment = livingEnvironment;
        }
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("Спит");
    }
    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return year == animal.year && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
