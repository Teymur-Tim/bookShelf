import java.util.List;

public class Main {
    static void main(String[] args) {
        BookDao bookTable = new BookDao();

//        bookTable.createBookTable();
//        bookTable.dropBookTable();
//        Books book1 = new Books("1984", "George ovreal", 5);
//        Books book2 = new Books("Les Misrables", "Viktor Hugo", 5);
//        Books book3 = new Books("Sapiens", "Yuval Noah harari", 3.7);
          Books book4 = new Books("Little Prince", "Antuan de Sent Ekzuperi", 5);
//
//        bookTable.addBooks(book1);
//        bookTable.addBooks(book2);
//        bookTable.addBavooks(book3);
          bookTable.addBooks(book4);
//        List<Books> allBooks = bookTable.getAllBooks();
//        allBooks.forEach(System.out::println);

    }
}
