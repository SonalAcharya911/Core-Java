package service;

import dto.ProductDto;
import exceptions.*;

public class ProductServiceImpl implements ProductService{
    @Override
    public boolean save(ProductDto productDto) {
        String prodName= productDto.getProductName();
        String category= productDto.getCategory();
        Integer quantity=productDto.getQuantity();
        Integer prodID= productDto.getProductID();
        Double price=productDto.getPrice();;

        if(productDto.getProductName()!=null){
            throw new NullProductNameException("product name cannot be empty");
        }
        else{
            System.out.println("valid name");
        }

        if(prodName.length()<3){
            throw new ProductNameLengthException("product name should be longer than 3 characters");
        }
        else{
            System.out.println("valid name");

        }

        if(prodID<0){
            throw new ProductIDNotPositiveException("product ID should be a positive integer");
        }
        else{
            System.out.println("valid ID");

        }

        if(price<0 || price>10000){
            throw new PriceLimitException("price should be within the range 0-10000");
        }
        else{
            System.out.println("valid price");

        }

        if(quantity<0 || quantity>1000){
            throw new QuantityLimitException("quantity should be in the range 0-1000");
        }
        else{
            System.out.println("valid quantity");

        }

        if(!(category.equals("Electronics")|| category.equals("Clothing") || category.equals("Books")||category.equals("Home"))){
            throw new WrongCategoryException("category doesn't match");
        }
        else{
            System.out.println("valid category");

        }

        return true;

    }
}
