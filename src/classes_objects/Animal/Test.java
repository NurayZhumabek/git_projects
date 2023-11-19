package classes_objects.Animal;

public class Test {
    public static void main(String[] args) {

        Animal[] animal = {
                new Dog(),
                new Cat(),
                new Bird(),
                new Cat(),
                new Bird()

        };
        AnimalShelter.makeAllsound(animal);

    }
}
