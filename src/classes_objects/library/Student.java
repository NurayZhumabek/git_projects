package classes_objects.library;

public class Student extends Person {
    String name;
    int studentID;
    Book borrowedBook;  // Каждый студент может взять только одну книгу
    Book lastBorrowedBook;
    Book currentBorrowedBook;

    // Метод вывода информации о студенте


    @Override
    void display() {
        super.display();
    }
}