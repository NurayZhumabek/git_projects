package classes_objects.library;

public class Library {

    Book books[];
    Book availableBook;
    int capacity;
    public Library(int capacity) {
    this.capacity=capacity;
    books=new Book[capacity];
  }

    public Library(Book[] books) {
        this.books = books;
    }

    void addBook(Book book){
        for (int i = 0; i <books.length ; i++) {
            if (books[i]==null){
                books[i]=book;
                return;
            }
        }
    }
    void addBooks(Book[] newBooks){
        String message="";
        int counter=0;
        int id=0;
        for (int i = 0; i < books.length; i++) {
            if (books[i]==null){
                counter++;
            }
        }
       if (counter>=newBooks.length){
           for (int i = books.length-counter; i  <books.length; i++) {
               books[i]=newBooks[id];
               id++;
           }
           System.out.println("New list of books:");
           for (Book i:books){
               System.out.println(i);
           }
       }
       else {
           System.out.println("No free places in the library");
       }

    }


    boolean isFull(){
        boolean isFull=true;
        for (int i = 0; i <books.length; i++) {
            if (books[i]==null){
                isFull=false;
                break;
            }
        }
    return isFull;

    }
    // Метод, возвращающий массив индексов пустых мест в библиотеке.
    int[] getFreeSpaces(){
        int counter=0;
        int id=0;
        for (int i = 0; i <books.length; i++) {
            if(books[i]==null){
                counter++;
            }
            
        }
        int[] indexFreeSpaces=new int[counter];
        for (int i = 0; i <books.length ; i++) {
            if(books[i]==null){
                indexFreeSpaces[id]=i;
                id++;
            }

        }
        return  indexFreeSpaces;
        
    }
    //  метод должен возвращать объект книги из массива по переданному название
    public Book findBookByTitle( String title) {
        int id = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equals(title)) {
                id = i;
            }
        }
        return books[id];
    }







    void lendBook(Person person) {
           if (person.currentBorrowedBook == null && availableBook != null) {
               person.currentBorrowedBook = availableBook;
               availableBook = null;
           }
       }


    void acceptBook(Person person) {
        if (person.currentBorrowedBook!= null && availableBook==null){
            person.lastBorrowedBook=person.currentBorrowedBook;
            availableBook=person.lastBorrowedBook;
            person.currentBorrowedBook=null;
        }
    }

}