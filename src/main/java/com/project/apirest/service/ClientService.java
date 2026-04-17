package com.project.apirest.service;

import com.project.apirest.data.entity.Client;
import com.project.apirest.data.repository.ClientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Page<Client> getAllClients(int pageNumber, int pageSize){
        Pageable pageable = PageRequest.of(pageNumber,pageSize);
        return repository.findAll(pageable);
    }

    public List<Client> getAll() {
        return repository.findAll();
    }
}
