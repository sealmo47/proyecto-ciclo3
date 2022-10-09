package com.retoo3.proyectomoto.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.retoo3.proyectomoto.entities.Reservation;
import com.retoo3.proyectomoto.repository.crudRepository.ReservationCrudRepository;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservasCrudRepository;
    public List<Reservation> getAll(){
        return (List<Reservation>) reservasCrudRepository.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return reservasCrudRepository.findById(id);
    }
    public Reservation save(Reservation p){
        return reservasCrudRepository.save(p);
    }
    public void delete(Reservation p){
        reservasCrudRepository.delete(p);
    }

}
