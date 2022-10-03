package com.zaidybp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import javax.validation.constraints.NotNull;
import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitDto
{
    private Long id;
    @NotNull
    private String nom;
    @NotNull
    private Double qtStock;
//    @ManyToOne
//    private AppUser appUser;


}
