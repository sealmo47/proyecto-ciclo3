package com.retoo3.proyectomoto.repository.crudRepository;


import com.retoo3.proyectomoto.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {
}
