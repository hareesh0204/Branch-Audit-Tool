package com.example.audit;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface ChecklistRepository extends MongoRepository<Checklist,String>, CrudRepository<Checklist,String> {

}
