package com.zaidy.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCart;
    private String name;
    private String email;
    private  String photo;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany (mappedBy = "student", cascade = CascadeType.ALL)
    List<Subscribtion> subscribtions;

}
