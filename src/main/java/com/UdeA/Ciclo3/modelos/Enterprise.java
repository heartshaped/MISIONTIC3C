package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Enterprise")
public class Enterprise {
    @Id
    private long id;
    @Column(name="name", unique = true)
    private String name;
    @Column(name="document",unique = true)
    private String document;
    private String phone;
    private String address;
    private String users;
    private String Transactions;
    //cuando se hace el mapping se tiene que llamar la misma entidad de manytoone en el otro modelo
    //en este caso dentro de employeed se toma el nombre de enterprises

    @OneToMany(mappedBy ="ObjEmployee", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Employee> employeeList;
    @OneToMany(mappedBy ="enterprise")
    List<Transaction> transactionList;
    private LocalDate createdAt, updateAt;

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    public Enterprise() {
    }

    public Enterprise(String name, String document, String phone, String address, String users, String transactions, List<Employee> employeeList, List<Transaction> transactionList, LocalDate createdAt, LocalDate updateAt) {
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = users;
        Transactions = transactions;
        this.employeeList = employeeList;
        this.transactionList = transactionList;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getTransactions() {
        return Transactions;
    }

    public void setTransactions(String transactions) {
        Transactions = transactions;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
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
