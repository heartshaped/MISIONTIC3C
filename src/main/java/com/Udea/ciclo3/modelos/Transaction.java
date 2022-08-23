package com.Udea.ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String concept;
    private Float amount;
    @ManyToOne
    @JoinColumn(name = "users")
    Employee ObjTransation;
    @ManyToOne
    @JoinColumn(name = "enterprise")
    Enterprise enterprise;
    private LocalDate createdAt, updateAt;

    //@ManyToOne
    //@JoinColumn(name = "user_id")
    //private Employee user;

}
