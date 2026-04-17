package com.project.apirest.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "CLIENT_ID")
    private UUID clientId;

    @Column(name = "CLIENT_NAME")
    private String nameClient;

    @Column(name = "CLIENT_ADDRESS")
    private String address;

    @Column(name = "CLIENT_DETAILS")
    private String observation;

}


