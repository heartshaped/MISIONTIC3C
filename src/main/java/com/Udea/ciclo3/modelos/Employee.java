package com.Udea.ciclo3.modelos;

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



    public String getEmail() {
       return email;
    }

    public Employee() {
    }

    public Employee(String email, Profile objprofile, String role, Enterprise objEmployee, List<Transaction> transactionList, String transactions, LocalDate createdAt, LocalDate updateAt) {
        this.email = email;
        Objprofile = objprofile;
        this.role = role;
        ObjEmployee = objEmployee;
        this.transactionList = transactionList;
        Transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getObjprofile() {
        return Objprofile;
    }

    public void setObjprofile(Profile objprofile) {
        Objprofile = objprofile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Enterprise getObjEmployee() {
        return ObjEmployee;
    }

    public void setObjEmployee(Enterprise objEmployee) {
        ObjEmployee = objEmployee;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public String getTransactions() {
        return Transactions;
    }

    public void setTransactions(String transactions) {
        Transactions = transactions;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }
}



