package com.devsuperior.dscommerce.dto.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.validation.FieldError;

@AllArgsConstructor
@Getter
public class FieldMessage {

    private String fieldName;
    private String message;


}
