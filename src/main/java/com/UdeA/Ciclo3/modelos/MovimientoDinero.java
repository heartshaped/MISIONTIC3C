package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="transaction")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String concept;
    private Float amount;
    @ManyToOne
    @JoinColumn(name = "users")
    private Empleado elEmpleado;

    public Empleado getObjTransation() {
        return elEmpleado;
    }

    /*public void setObjTransation(Empleado ObjTransation) {
        this.elEmpleado = ObjTransation;
    }
    @ManyToOne
    @JoinColumn(name = "enterprise")
    Empresa enterprise;
    private LocalDate createdAt, updateAt;*/

    public MovimientoDinero() {
    }

    public MovimientoDinero(String concept, Float amount, Empleado elEmpleado) {
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

    public Empleado getElEmpleado() {
        return elEmpleado;
    }

    public void setElEmpleado(Empleado elEmpleado) {
        this.elEmpleado = elEmpleado;
    }

    //@ManyToOne
    //@JoinColumn(name = "user_id")
    //private Employee user;
}
