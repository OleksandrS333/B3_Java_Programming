package day37_a_abstraction.gym;

public abstract class Exercise {

    String name;

    //static int count;

    public Exercise(String name) {
        this.name = name;
    }

    public abstract void performExercise();

    public abstract int burnCalories (int minutes);

}