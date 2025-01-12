package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.BudgeItem;

@Repository
public interface BudgetItemRepository extends CrudRepository<BudgeItem, Integer>{    
} 
