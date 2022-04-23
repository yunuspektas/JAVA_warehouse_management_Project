public class Products {

    private String id ;
    private String productName ;
    private String manufacturer ;
    private int quantity ;
    private String unit ;
    private String shelfNo ;

    public Products() {
    }

    public Products(String id, String productName, String manufacturer, int quantity, String unit, String shelfNo) {
        this.id = id;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.unit = unit;
        this.shelfNo = shelfNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public void setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", shelfNo='" + shelfNo + '\'' +
                '}';
    }
}
