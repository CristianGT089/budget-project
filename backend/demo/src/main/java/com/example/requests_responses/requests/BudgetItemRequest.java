package com.example.requests_responses.requests;

import java.sql.Date;

import lombok.Getter;

@Getter
public class BudgetItemRequest {
    
    private String type;

    private String subtype;

    private String category;

    private float amount;

    private Date date;
}
