package classes_objects.library;

public class Teacher {
    String name;
    Subject subject;
    Book lastBorrowedBook;
    Book currentBorrowedBook;

    void display() {
        System.out.println("Name: " + name + " subject: " + subject +
                "\nThe last book: " + lastBorrowedBook + "\nThe current book: " + currentBorrowedBook);
    }
}