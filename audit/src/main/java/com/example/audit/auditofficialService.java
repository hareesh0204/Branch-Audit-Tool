package com.example.audit;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class auditofficialService {
    private final AuditOfficialRepository auditOfficialRepository;

    @Autowired
    public auditofficialService(AuditOfficialRepository auditOfficialRepository , @Qualifier("auditOfficialRepository") MongoRepository mongoRepository) {

        this.auditOfficialRepository = auditOfficialRepository;

    }
//    public Audit_official addauditofficialdetails(Audit_official audit_official){
//        audit_official.setId;
//        return auditOfficialRepository.save(audit_official);
//        return auditOfficialRepository.save(audit_official);
//    }
}
