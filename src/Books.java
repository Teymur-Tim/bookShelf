public class Books {
    private  String author;
    private  String bookName;
    private long id;
    private double  rate;

    public Books() {}
    public Books(String bookName,  String author, double rate) {
        this.bookName = bookName;
        this.rate = rate;
        this.author = author;
    }

    public Books( long id, String bookName, double  rate,String author ){
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.rate = rate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double  getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }
    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", rate=" + rate +
                ", author='" + author + '\'' +
                '}';
    }
}
