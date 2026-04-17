package com.project.apirest.api;
 import com.project.apirest.data.entity.Client;
 import com.project.apirest.service.ClientService;
 import org.springframework.data.domain.Page;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.*;


 import java.util.List;

@RestController
@RequestMapping("/client")
public class ApiRestClient {

    private ClientService service;

    public ApiRestClient(ClientService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity getAllClients(){
        List<Client> response = service.getAll();
        return ResponseEntity.ok(response);
    }

    @GetMapping("getClientPagination")
    public ResponseEntity<Page<Client>> getAllProductsPagination(@RequestParam(defaultValue = "0") int page,
                                                                 @RequestParam(defaultValue = "10" ) int size){
        Page<Client> response = service.getAllClients(page,size);
        return ResponseEntity.ok(response);
    }

}
