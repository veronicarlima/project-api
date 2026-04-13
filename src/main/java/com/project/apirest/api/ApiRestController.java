package com.project.apirest.api;

import com.project.apirest.service.RequisitionService;
import org.springframework.web.bind.annotation.*;

@RestController //quando tem interacao so front - o Controler so serve quando usa Thymeleaf
@RequestMapping("api/requests")  //so para organizacao
public class ApiRestController {

    private final RequisitionService service;  //pesquisar porque nao usar autoriade ...

    public ApiRestController(RequisitionService service) {
        this.service = service;
    }

    @GetMapping()
    public void getCommand(){}

    @PostMapping
    public void addNewRequest(){}

    @PutMapping
    public void updateRequest(){}

    @DeleteMapping
    public void excludeRequest(){}
}
