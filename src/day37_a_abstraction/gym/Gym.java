package day37_a_abstraction.gym;

public class Gym {
    public static void main(String[] args) {

        //Exercise obj1 = new Exercise("Runnig");

        Running obj1 = new Running("Marathon");
        obj1.performExercise();
        System.out.println(obj1.burnCalories(10));


        PullUps obj2 = new PullUps("Crosfit");
        obj2.performExercise();
        System.out.println(obj2.burnCalories(10));


    }

}