package classes_objects.library;

public class Book {

    String author;
    String title;
    int id;
    float rating;
    int countScore;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", rating=" + rating +
                ", countScore=" + countScore +
                '}';
    }

    // Метод вывода информации о книге
    void display() {
        System.out.println("ID: " + id + " | Book: '" + title + "' by Author: '" + author + "'");
    }
}