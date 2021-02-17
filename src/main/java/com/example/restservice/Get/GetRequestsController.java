package com.example.restservice.Get;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRequestsController {
    @GetMapping("/v1/companies/5")
    public GetResponseObject describeEmployeeEndPoints(){
        String message = "This is a response to a request made to http://localhost:8080/v1/companies/5" +
                " following end points are available to make get requests";
        return new GetResponseObject(message);
    }

    @GetMapping("/v1/companies/5/employees")
    public GetResponseObject getEmployees(@RequestParam(value="search", defaultValue = "default") String searchTerm){
        String messageForDefaultSearch = "You did not search any term";
        if(searchTerm == "default")
            return new GetResponseObject(messageForDefaultSearch);
        String message = String.format("Your search term is %s",searchTerm);
        return new GetResponseObject(message);
    }

    @GetMapping("/v1/companies/5/employees/10")
    public GetResponseObject getEmployessHavingAbove10YearsExperience(@RequestParam(value="search", defaultValue = "") String searchTerm){
        String message = "This page lists all employees having over 10 years of experience";
        return new GetResponseObject(message);
    }
}
