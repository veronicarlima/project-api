package com.project.apirest.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RequisitionService {

    //create H2 to connect with database or other conection

   public List<Optional> getAllRequests(){
       return new ArrayList<>();
   }


}
