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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Sebastian Morales
 */
@Entity
@Table(name = "score")
public class Score implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    private Integer idEvaluation;
    @Column(length=250,unique=false,nullable=false)
    private String textEvaluation;
    @Column(length=1,unique=false,nullable=false)
    private Integer scoreGrade;
    
    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;

    public Integer getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(Integer idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public String getTextEvaluation() {
        return textEvaluation;
    }

    public void setTextEvaluation(String textEvaluation) {
        this.textEvaluation = textEvaluation;
    }

    public Integer getScoreGrade() {
        return scoreGrade;
    }

    public void setScoreGrade(Integer scoreGrade) {
        this.scoreGrade = scoreGrade;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    
    
}

