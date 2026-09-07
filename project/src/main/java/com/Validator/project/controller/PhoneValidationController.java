package com.Validator.project.controller;

import com.Validator.project.models.PhoneRequest;
import com.Validator.project.models.PhoneResponse;
import com.Validator.project.service.PhoneValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/validate")
public class PhoneValidationController {

    @Autowired
    private PhoneValidationService service;

    @PostMapping("/phone")
    public ResponseEntity<PhoneResponse> validatePhone(@RequestBody PhoneRequest request) {
        return ResponseEntity.ok(service.validate(request.getPhoneNumber()));
    }
}


