package com.zaidybp.entiities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class AppUser
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false, length = 200)
        private String nom;
        @Column(nullable = false, length = 200)
        private String prenom;
        @Column(nullable = false, length = 200)
        private String password;
        @Column(nullable = false, length = 200)
        private String email;


        private int etat;
        @ManyToMany
        private List<AppRoles> rolesList;
        @OneToMany(mappedBy = "appUser")
        private  List<Produit> produits;
    }
