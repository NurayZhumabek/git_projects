package classes_objects.Animal;

public class AnimalShelter {
    Animal[] animal;

    public static void makeAllsound(Animal[] animal) {
        for (int i = 0; i < animal.length; i++) {
            i = (int) (Math.random() * animal.length - 1);
            animal[i].makeSound();
            break;
        }


    }

}
