/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retoo3.proyectomoto.repository;

import com.retoo3.proyectomoto.entities.Score;
import com.retoo3.proyectomoto.repository.crudRepository.ScoreCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sebastian Morales
 */
@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCrudRepository scoreCrudRepository;

    public List<Score> getAll(){
        return (List<Score>) scoreCrudRepository.findAll();
    }
    public Optional<Score> getScore(int id){
        return scoreCrudRepository.findById(id);
    }
    public Score save(Score c){
        return scoreCrudRepository.save(c);
    }
    public void delete(Score c){
        scoreCrudRepository.delete(c);
    }
}

