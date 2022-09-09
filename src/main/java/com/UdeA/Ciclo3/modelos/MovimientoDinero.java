package com.UdeA.Ciclo3.modelos;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="transaction")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="concept", unique = true)
    private String concept;
    @Column(name="amount", unique = true)
    private Float amount;
    @ManyToOne
    //@Cascade({CascadeType.ALL})
    @JoinColumn(name = "el_empleado_id")
    private Empleado elEmpleado;

    /*@ManyToOne
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
    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

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
