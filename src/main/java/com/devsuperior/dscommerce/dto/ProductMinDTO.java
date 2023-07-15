package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

import lombok.Getter;

@Getter
public class ProductMinDTO {
    private Long id;
    private String name;
    private Double price;
    private String imgUrl;

    public ProductMinDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }
}
