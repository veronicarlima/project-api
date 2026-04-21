package com.project.apirest.service;

import com.project.apirest.data.entity.Client;
import com.project.apirest.data.repository.ClientRepository;
import com.project.apirest.error.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getAll() {
        return repository.findAll();
    }

    public Page<Client> getClientPage(int pageNumber, int pageSize){
        Pageable pageable = PageRequest.of(pageNumber,pageSize);
        return repository.findAll(pageable);
    }

    public Page<Client> getClientSpecifyPage(int pageNumber, int pageSize){
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return  repository.getClientSpecify(pageable);
    }

    public Client getClientId(Long id) {
           return repository.findById(id)
                   .orElseThrow( ()-> new ResourceNotFoundException(
                           "Client not found with id" + id));
    }

    public Client saveNewClient(Client client){
        return repository.save(client);
    }


}
