package com.retoo3.proyectomoto.repository;



import com.retoo3.proyectomoto.entities.Client;
import com.retoo3.proyectomoto.repository.crudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }
    public Client save(Client c){
        return clientCrudRepository.save(c);
    }
    public void delete(Client c){
        clientCrudRepository.delete(c);
    }

}
