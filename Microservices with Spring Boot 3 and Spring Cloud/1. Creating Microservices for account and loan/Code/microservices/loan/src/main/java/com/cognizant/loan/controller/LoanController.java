package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoan(@PathVariable String number) {
        return Map.of(
                "number", number,
                "type", "car",
                "loan", 50000,
                "emi", 4000,
                "tenure", 18
        );
    }
}
