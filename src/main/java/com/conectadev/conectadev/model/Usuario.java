package com.conectadev.conectadev.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name= "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 50, message = "O username deve possuir no mínimo 3 caracteres e no máximo 50.")
    @NotBlank
    private String username;

    @NotBlank
    @Size(min= 8, max= 15)
    private String password;

    @Size(min = 3, max = 100, message = "O nome deve possuir no mínimo 3 caracteres e no máximo 100.")
    private String nomeCompleto;
}
