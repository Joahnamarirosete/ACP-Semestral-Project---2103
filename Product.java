package bakeshopsystem;


public class Product {
    private int productID;
    private String productName;
    private String productCategory;
    private String productFlavor;
    private double productPrice;

    public Product(int productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productFlavor = productFlavor;
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductFlavor() {
        return productFlavor;
    }

    public double getProductPrice() {
        return productPrice;
    }
}