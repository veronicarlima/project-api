package com.project.apirest.data.repository;

import com.project.apirest.data.entity.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long >,
        PagingAndSortingRepository<Client, Long> {

    @Query(value= "Select * from client where client_details = 'HOUSEKEEPING';",
           countName = "Select COUNT(*) from client where client_details = 'HOUSEKEEPING'",
           nativeQuery = true )
    Page<Client> getClientSpecify(Pageable pageable);

    @Query(value = "select * from client", nativeQuery = true)
    List<Client> getClientByCustomQuery(@Param("limit") int limit, @Param("offSet") int offSet);

}
