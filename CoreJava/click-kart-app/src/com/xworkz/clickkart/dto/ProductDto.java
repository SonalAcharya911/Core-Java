package com.xworkz.clickkart.dto;

public class ProductDto {
    private String name;
    private String type;
    private double costPrice;
    private double sellingPrice;
    private double mrp;
    private String description;
    private String brand;
    private int quantity;
    private String color;
    private int weight;
    private String manfDate;
    private String warranty;
    private boolean returnPolicy;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getMrp() {
        return mrp;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getWarranty() {
        return warranty;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getManfDate() {
        return manfDate;
    }

    public boolean getReturnPolicy(){
        return returnPolicy;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManfDate(String manfDate) {
        this.manfDate = manfDate;
    }

    public void setReturnPolicy(boolean returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

}
