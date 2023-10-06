package classes_objects.library;

public class Person {
    String name;
    Book lastBorrowedBook;
    Book currentBorrowedBook;
    void display() {
        System.out.println("Name: "+name+
                "\nThe last book: " + lastBorrowedBook + "\nThe current book: " + currentBorrowedBook);


    }
}
