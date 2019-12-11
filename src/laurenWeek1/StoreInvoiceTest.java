package laurenWeek1;

public class StoreInvoiceTest {

    public static void main(String[] args) {
        StoreInvoice invoice1= new StoreInvoice(" Z3412", "Shirt", 5,20.75 );
        StoreInvoice invoice2= new StoreInvoice(" G6715", "Pants", 2,50.00 );
        StoreInvoice invoice3= new StoreInvoice(" P3680", "Shoes", 5,21.99 );
        StoreInvoice invoice4= new StoreInvoice(" Z3412", "Socks", 1,10.50 );

        //should not add the 4.25 to the total because the qty is zero
        StoreInvoice invoice5= new StoreInvoice(" Y3401", "Scarf", 0,4.25 );


        System.out.println("          Garment Barn Invoice         ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Invoice   |Item # | Item | Qty. | Price");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Invoice 1: %s\t%s\t%d\t$%.2f\n", invoice1.getItemNumber(),invoice1.getItemDescription(), invoice1.getItemQty(), invoice1.getItemPrice());
        System.out.printf("Invoice 2: %s\t%s\t%d\t$%.2f\n", invoice2.getItemNumber(),invoice2.getItemDescription(), invoice2.getItemQty(), invoice2.getItemPrice());
        System.out.printf("Invoice 2: %s\t%s\t%d\t$%.2f\n", invoice3.getItemNumber(),invoice3.getItemDescription(), invoice3.getItemQty(), invoice3.getItemPrice());
        System.out.printf("Invoice 4: %s\t%s\t%d\t$%.2f\n", invoice4.getItemNumber(),invoice4.getItemDescription(), invoice4.getItemQty(), invoice4.getItemPrice());
        System.out.printf("Invoice 5: %s\t%s\t%d\t$%.2f\n", invoice5.getItemNumber(),invoice5.getItemDescription(), invoice5.getItemQty(), invoice5.getItemPrice());

        double totalQty = invoice1.getItemQty() + invoice2.getItemQty() + invoice3.getItemQty() + invoice4.getItemQty() + invoice5.getItemQty();

       //total should be 103.25
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total Quantity: " + totalQty);
        System.out.println("Total Invoice: $" + invoice1.getInvoiceAmount());
    }
}
