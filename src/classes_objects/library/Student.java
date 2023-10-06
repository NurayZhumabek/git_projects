package classes_objects.library;

public class Student {
    String name;
    int studentID;
    Book borrowedBook;  // Каждый студент может взять только одну книгу
    Book lastBorrowedBook;
    Book currentBorrowedBook;

    // Метод вывода информации о студенте
    void display() {
        System.out.println("Name: "+name+" student ID: " +studentID+
                "\nThe last book: " + lastBorrowedBook + "\nThe current book: " + currentBorrowedBook);


    }
}