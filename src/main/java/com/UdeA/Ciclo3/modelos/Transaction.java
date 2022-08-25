package com.UdeA.Ciclo3.modelos;

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
    private String elEmpleado;
    @ManyToOne
    @JoinColumn(name = "users")
    Employee ObjTransation;
    @ManyToOne
    @JoinColumn(name = "enterprise")
    Enterprise enterprise;
    private LocalDate createdAt, updateAt;

    public Transaction() {
    }

    public Transaction(String concept, Float amount, String elEmpleado) {
        this.concept = concept;
        this.amount = amount;
        this.elEmpleado = elEmpleado;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getElEmpleado() {
        return elEmpleado;
    }

    public void setElEmpleado(String elEmpleado) {
        this.elEmpleado = elEmpleado;
    }

    //@ManyToOne
    //@JoinColumn(name = "user_id")
    //private Employee user;
}
