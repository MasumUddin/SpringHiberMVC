package com.bari.springmvc.model;


//@Entity
public class Product  implements java.io.Serializable {


     private Integer id;
     private String productName;
     private String description;
     private String price;
     private String qty;

    public Product() {
    }

    public Product(String productName, String description, String price, String qty) {
       this.productName = productName;
       this.description = description;
       this.price = price;
       this.qty = qty;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    public String getQty() {
        return this.qty;
    }
    
    public void setQty(String qty) {
        this.qty = qty;
    }
    
}


