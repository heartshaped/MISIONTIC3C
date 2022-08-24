package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name="email", unique = true)
    private String email;
    //@OneToOne(mappedBy = "employee")
    @OneToOne
    @JoinColumn(name = "profile")
    private Profile Objprofile;
    private String role;
    @ManyToOne
    @JoinColumn(name = "enterprise")
    Enterprise ObjEmployee;
    @OneToMany(mappedBy ="ObjTransation")
    List<Transaction> transactionList;
    private String Transactions;
    private LocalDate createdAt, updateAt;
}
