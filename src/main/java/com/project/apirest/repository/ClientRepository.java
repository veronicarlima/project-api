package com.project.apirest.repository;

import com.project.apirest.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long >, PagingAndSortingRepository<Client, Long> {

}
