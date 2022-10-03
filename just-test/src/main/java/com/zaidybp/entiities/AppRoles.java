package com.zaidybp.entiities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class AppRoles
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true ,nullable = false, length = 100)
    private String nom;

    @ManyToMany(mappedBy = "rolesList")
    private List<AppUser> userList;


}
