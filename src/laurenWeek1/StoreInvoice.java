package laurenWeek1;

public class StoreInvoice {
    private String itemNumber;
    private String itemDescription;
    private int itemQty;
    private double itemPrice;

    //constructor

    public StoreInvoice(String number, String description, int qty, double price) {
        this.itemNumber = number;
        this.itemDescription = description;
        this.itemQty = qty;
        this.itemPrice = price;
    }
    public String getItemNumber(){
        return itemNumber;
    }
    public String getItemDescription(){
        return itemDescription;
    }
    public int getItemQty(){
        return itemQty;
    }
    public double getItemPrice(){
        return  itemPrice;
    }
    public void setItemNumber (String number){
        if (number !=null){
            itemNumber = number;
        }
        else{
            itemNumber = "0";
        }
    }
    public void setItemDescription (String description){
        if (description !=null){
            itemNumber = description;
        }
        else{
            itemNumber = "0";
        }
    }
    public void setItemQty (int qty){
        if (qty > 0){
            itemQty = qty;
        }
        else {
            itemQty = 0;
        }
    }
    public void setItemPrice (double price){
        if (price > 0){
            itemPrice = price;
        }
        else {
            itemPrice = 0;
        }
    }
    public double getInvoiceAmount(){
        return (itemQty * itemPrice);
    }
}
