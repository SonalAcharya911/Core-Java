package com.xworkz.groupism.repository;

import com.xworkz.groupism.dto.ProductDto;

import java.util.Collection;

public interface ProductRepository {
    Collection<ProductDto> fetch();
}
