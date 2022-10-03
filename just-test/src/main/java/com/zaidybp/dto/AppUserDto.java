package com.zaidybp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor @NoArgsConstructor
public class AppUserDto
    {

        private Long id;
        @NotNull(message = "le nom doit etre mis")
        private String nom;
        @NotNull
        private String prenom;
        @NotNull
        private String password;
        @NotNull
        private String email;
        @NotNull
        private int etat;
    }
