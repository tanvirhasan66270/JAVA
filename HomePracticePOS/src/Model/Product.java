/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private double quantity;
    private int catagoryId;
    private int supplierId;
    
    private String supplierName;
    private String catagoryName;

    public Product() {
    }

    public Product(int id, String name, double price, double quantity, int catagoryId, int supplierId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.catagoryId = catagoryId;
        this.supplierId = supplierId;
        
        

    }

    public Product(String name, double price, double quantity, int catagoryId, int supplierId) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.catagoryId = catagoryId;
        this.supplierId = supplierId;

    }

    public Product(int id, String name, double price, double quantity, String supplierName, String catagoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.supplierName = supplierName;
        this.catagoryName = catagoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(int catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", catagoryId=" + catagoryId + ", supplierId=" + supplierId + ", supplierName=" + supplierName + ", catagoryName=" + catagoryName + '}';
    }
    

    

}
