package com.project.apirest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Entity
@NoArgsConstructor
@Table(name="CLIENT")
public class Client {

    @Id
    private Long id;

    @Column(name = "CLIENT_NAME")
    private String nameClient;

    @Column(name = "CLIENT_ADDRESS")
    private String address;

    @Column(name = "CLIENT_DETAILS")
    private String observation;



}


