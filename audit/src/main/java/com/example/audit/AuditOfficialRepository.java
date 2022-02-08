package com.example.audit;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuditOfficialRepository extends MongoRepository<Audit_official,String> {

}
