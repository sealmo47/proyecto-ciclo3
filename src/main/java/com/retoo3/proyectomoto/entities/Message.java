/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retoo3.proyectomoto.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Morales
 */
@Entity
@Table(name = "message")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    private Integer idMessage;
    @Column(length=250,unique=false,nullable=false)
    private String messageText;
   
    
    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"message","reservation"})
    private Client client;
    
    @ManyToOne
    @JoinColumn(name = "motorbikeId")
    @JsonIgnoreProperties({"message","reservation"})
    private Motorbike motorbike;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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
