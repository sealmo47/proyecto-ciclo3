package com.retoo3.proyectomoto.repository;



import com.retoo3.proyectomoto.entities.Motorbike;
import com.retoo3.proyectomoto.repository.crudRepository.MotorbikeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MotorbikeRepository {

    @Autowired
    private MotorbikeCrudRepository motorbikeCrudRepository;

    public List<Motorbike> getAll(){
        return (List<Motorbike>) motorbikeCrudRepository.findAll();
    }
    public Optional<Motorbike> getMotorbike(int id){
        return motorbikeCrudRepository.findById(id);
    }
    public Motorbike save(Motorbike c){
        return motorbikeCrudRepository.save(c);
    }
    public void delete(Motorbike c){
        motorbikeCrudRepository.delete(c);
    }

}
