package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String initialName) {
        this.quantity = 13;
        this.name = "Banana";
        this.price = 1.1;
    }

    public void printProduct() {
        System.out.println(this.name + ", "+ this.price +  ", "+ this.quantity);
    }
}
