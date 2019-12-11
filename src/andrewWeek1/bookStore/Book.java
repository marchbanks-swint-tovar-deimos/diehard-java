package andrewWeek1.bookStore;

public class Book extends Product {

    private Object author;

    public Book (String title, int cost, Object author) {
        super(title, cost);
        this.author = author;
    }

}
