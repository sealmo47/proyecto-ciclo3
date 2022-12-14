package com.retoo3.proyectomoto.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    private Integer idReservation;
    @Column(unique=false,nullable=false)
    private Date startDate;
    @Column(unique=false,nullable=false)
    private Date devolutionDate;
    private String status="created";
 
    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties("reservation")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name = "motorbikeId")
    @JsonIgnoreProperties({"message","reservation"})
    private Motorbike motorbike;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Motorbike getMotorbike() {
        return motorbike;
    }

    public void setMotorbike(Motorbike motorbike) {
        this.motorbike = motorbike;
    }
    
 

    



}
