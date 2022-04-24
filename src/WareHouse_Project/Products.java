package WareHouse_Project;

import java.util.HashMap;
import java.util.Map;

public class Products {

    public static Map<Integer, Products> itemMap = new HashMap<>();

    private String productName ;
    private String manufacturer ;
    private int quantity ;
    private String unit ;
    private String shelfNo ;


    public Products() {
        Products domates = new Products("domates", "altınkasa", 5, "kasa", "3" );
        Products un = new Products("un", "yeni", 15, "cuval", "2" );
        Products seker = new Products("seker", "günbak", 5, "cuval", "1" );
        Products tuz = new Products("tuz", "salinam", 25, "cuval", "4" );
        Products cilek = new Products("cilek", "yonca", 5, "kg", "5" );
        itemMap.put(1000, domates);
        itemMap.put(1001, un);
        itemMap.put(1002, seker);
        itemMap.put(1003, tuz);
        itemMap.put(1004, cilek);
    }

    public Products(String productName, String manufacturer, int quantity, String unit, String shelfNo) {

        this.productName = productName;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.unit = unit;
        this.shelfNo = shelfNo;

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
                "productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", shelfNo='" + shelfNo + '\'' +
                '}';
    }
}
