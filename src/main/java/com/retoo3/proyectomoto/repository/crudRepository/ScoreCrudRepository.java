/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retoo3.proyectomoto.repository.crudRepository;

import com.retoo3.proyectomoto.entities.Score;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sebastian Morales
 */
public interface ScoreCrudRepository extends CrudRepository<Score,Integer> {
}
