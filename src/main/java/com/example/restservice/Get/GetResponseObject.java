package com.example.restservice.Get;

public class GetResponseObject {
    private final String message;
    private final String[] urlsAvailableForMakingGetRequests;


    public GetResponseObject(String message) {
        this.message = message;
        String[] urls = {
                "http://localhost:8080/v1/companies/5/employees",
                "http://localhost:8080/v1/companies/5/employees/10",
                "http://localhost:8080/v1/companies/5/employees"
        };
        urlsAvailableForMakingGetRequests = urls;
    }

    public String getMessage() {
        return message;
    }

    public String[] getUrlsAvailableForMakingGetRequests() {
        return urlsAvailableForMakingGetRequests;
    }
}
