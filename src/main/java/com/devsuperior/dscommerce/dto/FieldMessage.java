package com.devsuperior.dscommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.validation.FieldError;

@AllArgsConstructor
@Getter
public class FieldMessage {

    private String fieldName;
    private String message;


}
