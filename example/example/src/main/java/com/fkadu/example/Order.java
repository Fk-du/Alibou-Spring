package com.fkadu.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty("CustomerNam")
    private String CustomerNam;

    @JsonProperty("ProductNam")
    private String ProductNam;

    @JsonProperty("productID")
    private int productID;

    public String getCustomerNam() {
        return CustomerNam;
    }

    public void setCustomerNam(String customerNam) {
        CustomerNam = customerNam;
    }

    public String getProductNam() {
        return ProductNam;
    }

    public void setProductNam(String productNam) {
        ProductNam = productNam;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "CustomerNam='" + CustomerNam + '\'' +
                ", ProductNam='" + ProductNam + '\'' +
                ", productID=" + productID +
                '}';
    }
}
