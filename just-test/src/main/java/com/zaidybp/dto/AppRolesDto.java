package com.zaidybp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.persistence.*;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class AppRolesDto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nom;




}
