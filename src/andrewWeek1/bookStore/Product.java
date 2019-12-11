package andrewWeek1.bookStore;

public class Product {

    private String title;
    private int cost;

    public Product (String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return this.title;
    }

}
