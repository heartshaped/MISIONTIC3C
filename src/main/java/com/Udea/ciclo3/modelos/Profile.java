package com.Udea.ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="Profile")
public class Profile {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    private String image, phone;
    private String users;
    private LocalDate createdAt, updateAt;


}
