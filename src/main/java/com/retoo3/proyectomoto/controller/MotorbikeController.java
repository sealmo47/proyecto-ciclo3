package com.retoo3.proyectomoto.controller;



import com.retoo3.proyectomoto.entities.Motorbike;
import com.retoo3.proyectomoto.service.MotorbikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Motorbike")
public class MotorbikeController {

    @Autowired
    private MotorbikeService motorbikeService;

    @GetMapping("/all")
    public List<Motorbike> getAll(){
        return motorbikeService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Motorbike save(@RequestBody  Motorbike p){
        return motorbikeService.save(p);
    }
     @GetMapping("/(id)")
    public Optional<Motorbike> getMotorbike(@PathVariable("id") int idMoto){
        return motorbikeService.getMotorbike(idMoto);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Motorbike update(@RequestBody Motorbike motorbike){
        return motorbikeService.update(motorbike);
    }
        
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable int id){
        return motorbikeService.delete(id);
    }

}
