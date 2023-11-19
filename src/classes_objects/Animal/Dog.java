package classes_objects.Animal;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Dog barks");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Dog sleeps in a doghouse");
    }
}
