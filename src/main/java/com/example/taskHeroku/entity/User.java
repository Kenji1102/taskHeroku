package com.example.taskHeroku.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String detail;
    private String date;
}
