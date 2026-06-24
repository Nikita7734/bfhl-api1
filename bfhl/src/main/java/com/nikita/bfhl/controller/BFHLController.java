package com.nikita.bfhl.controller;

import org.springframework.web.bind.annotation.*;

import com.nikita.bfhl.dto.BFHLRequest;
import com.nikita.bfhl.dto.BFHLResponse;
import com.nikita.bfhl.service.BFHLService;

@RestController
public class BFHLController {

    private final BFHLService service;

    public BFHLController(BFHLService service) {
        this.service = service;
    }

    @PostMapping("/bfhl")
    public BFHLResponse process(@RequestBody BFHLRequest request) {

        return service.process(request);
    }
}
