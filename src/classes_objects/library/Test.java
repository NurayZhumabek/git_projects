package classes_objects.library;

public class Test {
    public static void main(String[] args) {

        Book book = new Book();
        book.author = "Leo Tolstoy";
        book.title = "War and Peace";
        book.id = 1;
        book.rating=8.9f;
        book.countScore=231;

        Subject subject=new Subject();
        subject.lesson="History";

        Student student1 = new Student();
        student1.name = "John";
        student1.studentID = 12345;

        Teacher teacher=new Teacher();
        teacher.name="Jane";
        teacher.subject=subject;

        Person person=new Person();
        person.name="David";


        Library library = new Library();
        library.availableBook = book;

        student1.display();
        library.lendBook(student1);
        student1.display();

        library.acceptBook(student1);
        student1.display();
        System.out.println();


        teacher.display();
        library.lendBook(teacher);
        teacher.display();

        library.acceptBook(teacher);
        teacher.display();
        System.out.println();

        person.display();
        library.lendBook(person);
        person.display();

        library.acceptBook(person);
        person.display();
    }
}