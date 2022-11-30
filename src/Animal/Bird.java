package Animal;

import java.util.Objects;

public abstract class Bird extends Animal{
    private final String movementType;

    public Bird(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        if (movementType == null || movementType == "") {
            this.movementType = "тип перемещения";
        }else{
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public void hunt(){
        System.out.println("Охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(movementType, bird.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}
