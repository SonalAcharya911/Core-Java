package com.xworkz.groupism.runner;

import com.xworkz.groupism.dto.ProductDto;
import com.xworkz.groupism.repository.ProductRepository;
import com.xworkz.groupism.repository.ProductRepositoryImpl;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ProductRunner {
    public static void main(String[] args) {
        ProductRepository productRepository=new ProductRepositoryImpl();
        Collection<ProductDto> products=productRepository.fetch();

        System.out.println("Printing product information");
        products.stream().forEach(System.out::println);
        System.out.println("=====================================");

        System.out.println("printing all product names: ");
        products.stream().forEach(productDto -> System.out.println(productDto.getName()));
        System.out.println("=====================================");

        System.out.println("products with warranty less than 3 months");
        products.stream().filter(productDto -> productDto.getWarranty()<3).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=====================================");

        System.out.println("sorted all products by id in ascending order");
        products.stream().sorted().forEach(System.out::println);
        System.out.println("=====================================");

        System.out.println("collected products more than 5 and sorted by id");
        products.stream().filter(productDto -> productDto.getQuantity()>5).collect(Collectors.toList()).stream().sorted().forEach(System.out::println);
        System.out.println("=====================================");

        System.out.println("manufacturers of products");
        products.stream().forEach(productDto -> System.out.println(productDto.getManufacturer()));
        System.out.println("=====================================");

        System.out.println("product with least discount: "+products.stream().min(Comparator.comparing(productDto -> productDto.getDiscount())).toString());
        System.out.println("=====================================");

        System.out.println("product with latest manufacture date: "+products.stream().max(Comparator.comparing(productDto -> productDto.getManufacturedDate())).toString());
        System.out.println("=====================================");

        System.out.println("product with max costPerItem: "+products.stream().max(Comparator.comparing(productDto -> productDto.getCostPerItem())).toString());
    }
}
