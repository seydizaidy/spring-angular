package com.zaidybp.entiities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true ,nullable = false, length = 100)
    private String nom;
    private Double qtStock;
    @ManyToOne
    private AppUser appUser;


}
