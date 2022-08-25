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
    private String nombreEmpleado;
    private String laEmpresa;
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

    public Employee() {
    }

    //constructor para el sprint 2
    public Employee(String nombreEmpleado, String laEmpresa, String email, String role) {
        this.nombreEmpleado = nombreEmpleado;
        this.laEmpresa = laEmpresa;
        this.email = email;
        this.role = role;
    }

    //getter and setter para sprint2

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getLaEmpresa() {
        return laEmpresa;
    }

    public void setLaEmpresa(String laEmpresa) {
        this.laEmpresa = laEmpresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
