package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ClientDTO {
    private Long id;
    private String name;

    public ClientDTO(User entity){
        id = entity.getId();
        name = entity.getName();
    }
}
