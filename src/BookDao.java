import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private String url = "jdbc:postgresql://localhost:2128/learn_db";
    private String user = "postgres1";
    private String pass = "postgres1";
    private Connection con;

    public BookDao() {
        try {
            this.con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //------------------------------------------------------
    //------------------------------------------------------
    public void createBookTable() {
        try (Statement st = con.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS books (" +
                    "id SERIAL PRIMARY KEY, " +
                    "bookName VARCHAR(150), " +
                    "rate DOUBLE PRECISION, " +
                    "author VARCHAR(150)" +
                    ")";

            st.executeUpdate(sql);
            System.out.println("Table 'books' created successfully!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //------------------------------------------------------
    public void dropBookTable() {
        try (Statement st = con.createStatement()) {
            st.executeUpdate("DROP TABLE IF EXISTS users");
            System.out.println("Table dropped!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //------------------------------------------------------
    public void addBooks(Books book) {
        String query = "insert into books (bookname, rate, author) values (?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(query)) {

            statement.setString(1, book.getBookName());
            statement.setDouble(2, book.getRate());
            statement.setString(3, book.getAuthor());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //------------------------------------------------------

public List<Books> getAllBooks(){
List<Books> books= new ArrayList<>();
    try(  Statement statement = con.createStatement();) {
        ResultSet resultSet = statement.executeQuery("select * from books");
        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String bookName = resultSet.getString("bookName");
            long rate = resultSet.getLong("rate");
            String author = resultSet.getString("author");

            Books booksus = new Books(id, bookName, rate, author);
            books.add(booksus);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return books;

}


}
