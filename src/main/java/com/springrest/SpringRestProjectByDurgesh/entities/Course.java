package com.springrest.SpringRestProjectByDurgesh.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "course")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Course {

    //private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private String title;
    private String description;


}
