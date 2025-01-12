package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.BudgeItem;
import com.example.repositories.BudgetItemRepository;
import com.example.requests_responses.requests.BudgetItemRequest;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired BudgetItemRepository biRepository;

    @GetMapping(path = "/data")
    public Map<String, String> getData() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Que quiere que diga");
        return response;
    }

    @PostMapping(path = "/add")
    public @ResponseBody String addNewBudgetItem (@RequestParam BudgetItemRequest biRequest) {
        BudgeItem budgeItem = BudgeItem.builder()
            .type(biRequest.getType())
            .subtype(biRequest.getSubtype())
            .amount(biRequest.getAmount())
            .category(biRequest.getSubtype())
            .date(biRequest.getDate())
            .build();

        biRepository.save(budgeItem);

        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<BudgeItem> getAllBudgetItems(){
        return biRepository.findAll();
    }
    
}

