package classes_objects.library;

public class Library {
    Book availableBook;
    void lendBook(Student student) {
     if(student.currentBorrowedBook ==null && availableBook!=null){
         student.currentBorrowedBook=availableBook;
         availableBook=null;}
//     else{
//         System.out.println("You can not get any book");
//     }
    }
    void acceptBook(Student student) {
    if (student.currentBorrowedBook!= null && availableBook==null){
        student.lastBorrowedBook=student.currentBorrowedBook;
        availableBook=student.lastBorrowedBook;
        student.currentBorrowedBook=null;
    }
    }
    void lendBook(Teacher teacher) {
        if(teacher.currentBorrowedBook ==null && availableBook!=null){
            teacher.currentBorrowedBook=availableBook;
            availableBook=null;}
//     else{
//         System.out.println("You can not get any book");
//     }
    }
    void acceptBook(Teacher teacher) {
        if (teacher.currentBorrowedBook!= null && availableBook==null){
            teacher.lastBorrowedBook=teacher.currentBorrowedBook;
            availableBook=teacher.lastBorrowedBook;
            teacher.currentBorrowedBook=null;
        }
    }    void lendBook(Person person) {
        if(person.currentBorrowedBook ==null && availableBook!=null){
            person.currentBorrowedBook=availableBook;
            availableBook=null;}
//     else{
//         System.out.println("You can not get any book");
//     }
    }
    void acceptBook(Person person) {
        if (person.currentBorrowedBook!= null && availableBook==null){
            person.lastBorrowedBook=person.currentBorrowedBook;
            availableBook=person.lastBorrowedBook;
            person.currentBorrowedBook=null;
        }
    }

}