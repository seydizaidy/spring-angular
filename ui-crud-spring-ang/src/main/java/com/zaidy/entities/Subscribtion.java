package com.zaidy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity @Data
@AllArgsConstructor
@NoArgsConstructor
public class Subscribtion
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
                    private Long courseId;
                    private String name;
                    private Date dateCourse;

    @ManyToOne
    private Student student;

}
