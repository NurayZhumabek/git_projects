package classes_objects.Animal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Cat meows");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Cat sleeps in a cozy place");
    }
}
