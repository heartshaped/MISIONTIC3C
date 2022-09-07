package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="transaction")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String concept;
    private Float amount;


    private String elEmpleado;
    @ManyToOne
    @JoinColumn(name = "users")
    private Empleado ObjTransation;

    public Empleado getObjTransation() {
        return ObjTransation;
    }

    public void setObjTransation(Empleado ObjTransation) {
        this.ObjTransation = ObjTransation;
    }
    /*@ManyToOne
    @JoinColumn(name = "enterprise")
    Empresa enterprise;
    private LocalDate createdAt, updateAt;*/

    public MovimientoDinero() {
    }

    public MovimientoDinero(String concept, Float amount, String elEmpleado) {
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
