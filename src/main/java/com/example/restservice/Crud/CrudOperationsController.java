package com.example.restservice.Crud;

import org.springframework.web.bind.annotation.*;

@RestController
public class CrudOperationsController {
    @GetMapping("/v1/companies")
    public CrudResponse getRequestHandler(){
        String response = "Response to get request";
        return new CrudResponse(response);
    }
    @PostMapping("/v1/companies")
    public CrudResponse postRequestHandler(){
        String response = "Response to post request";
        return new CrudResponse(response);
    }
    @PutMapping("/v1/companies/3")
    public CrudResponse putRequestHandler(){
        String response = "Response to put request";
        return new CrudResponse(response);
    }
    @DeleteMapping("/v1/companies/3")
    public CrudResponse deleteRequestHandler(){
        String response = "Response to delete request";
        return new CrudResponse(response);
    }

}
