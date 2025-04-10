package Challenge3.Task2;

public class ItemToPurchase {

    // Private fields
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    // Constructor
//    public ItemToPurchase(String name, int price, int quantity) {
//        if (name.isEmpty()) {
//            this.itemName = "none"; // default value
//        } else {
//            this.itemName = name;
//        }
//
//        if (price == 0) {
//            this.itemPrice = -1;
//        } else {
//            this.itemPrice = price;
//        }
//
//        if (quantity == 0) {
//            this.itemQuantity = -1;
//        } else {
//            this.itemQuantity = quantity;
//        }
//    }

//    default constructor
    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = -1;
        this.itemQuantity = -1;
    }

    public void printItemPurchase() {
//        Chocolate Chips 1 @ $3 = $3
        int total = this.itemPrice * this.itemQuantity;
        System.out.printf("%s %d @ $%d = $%d\n", this.itemName, this.itemQuantity, this.itemPrice, total);
    }

    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
