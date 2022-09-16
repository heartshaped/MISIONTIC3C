package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="employee")
public class Empleado {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String nombreEmpleado;


    private String email;
    /*@OneToOne(mappedBy = "employee")
    @OneToOne
    @JoinColumn(name = "profile")
    private Profile Objprofile;*/
    private String role;
    //private String laEmpresa;
    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Empresa laEmpresa;

    /*public Empresa getObjEmployee() {
        return laEmpresa;
    }

    public void setObjEmployee(Empresa laEmpresa) {
        this.laEmpresa = laEmpresa;
    }

    @OneToMany(mappedBy ="ObjTransation")
    List<MovimientoDinero> transactionList;
    private String Transactions;
    private LocalDate createdAt, updateAt;
*/
    public Empleado() {
    }

    //constructor para el sprint 2
    public Empleado(String nombreEmpleado, Empresa laEmpresa, String email, String role) {
        this.nombreEmpleado = nombreEmpleado;
        this.laEmpresa = laEmpresa;
        this.email = email;
        this.role = role;
    }

    //getter and setter para sprint2
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Empresa getLaEmpresa() {
        return laEmpresa;
    }

    public void setLaEmpresa(Empresa laEmpresa) {
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
