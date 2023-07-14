package com.devsuperior.dscommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_role")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "authority")
public class Role {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String authority;
}
