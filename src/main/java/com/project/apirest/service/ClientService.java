package com.project.apirest.service;

import com.project.apirest.entity.Client;
import com.project.apirest.repository.ClientRepository;
import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Page<Client> getAllClients(int pageNumber, int pageSize){
        Pageable pageable = Pageable.ofSize(pageNumber,pageSize);
        return repository.findAll(pageable);
    }
}
