package andrewWeek1.bookStore;

import java.util.ArrayList;

public class BookStore {

    public static void main (String[] args) {

        Author james = new Author("James Horne");
        Author mike = new Author("Mike Kearns");
        Author chris = new Author("Chris Dare");

        ArrayList<String> jamesBooks = new ArrayList<>();
        ArrayList<String> mikeBooks = new ArrayList<>();
        ArrayList<String> chrisBooks = new ArrayList<>();

        Product bestUncle = new Book("Best Uncle", 500, james);
        jamesBooks.add("Best Uncle");
        Product partner = new Book("Keeping My Partner Alive", 200, mike);
        mikeBooks.add("Keeping My Partner Alive");
        Product soundingBoard = new Book("How to be an Extreme Sounding Board", 400, chris);
        chrisBooks.add("How to be an Extreme Sounding Board");

        Person customer1 = new Customer("customer1");
        Person customer2 = new Customer("customer2");
        Person customer3 = new Customer("customer3");
        Person customer4 = new Customer("customer4");
        Person customer5 = new Customer("customer5");
        Person customer6 = new Customer("customer6");
        Person customer7 = new Customer("customer7");
        Person customer8 = new Customer("customer8");

        Person[] customers = {customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8};

        System.out.printf("%s bought %s and %s%n", customers[2].getName(), partner.getTitle(), bestUncle.getTitle());

        System.out.printf("%s bought %s%n", customers[5].getName(), soundingBoard.getTitle());

        System.out.printf("%s bought %s%n", customers[7].getName(), partner.getTitle(), soundingBoard.getTitle());

    }

}
