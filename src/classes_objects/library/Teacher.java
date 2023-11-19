package classes_objects.library;

public class Teacher extends Person {
    String name;
    Subject subject;
    Book lastBorrowedBook;
    Book currentBorrowedBook;


    @Override
    void display() {
        super.display();
    }
}