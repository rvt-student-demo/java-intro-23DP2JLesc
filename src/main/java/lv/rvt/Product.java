package lv.rvt;

public class Product {
    private String Name;
    private double Price;
    private int Quantity;

    public Product (String Name, double Price, int Quantity){
        this.Name = Name;
        this.Price = 1.1;
        this.Quantity = 13;
    }

    public void printProduct(){
        System.out.println(this.Name + ", Price" + this.Price + " , " + this.Quantity + "pcs");
    }
}
