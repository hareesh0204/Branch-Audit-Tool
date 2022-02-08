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
public class crudoperations {
    private final BranchAuditRepository branchAuditRepository;

    @Autowired
    public crudoperations(BranchAuditRepository branchAuditRepository , @Qualifier("branchAuditRepository") MongoRepository mongoRepository) {

        this.branchAuditRepository = branchAuditRepository;

    }
    public  List<Branch_audit> getAllbranchAudit(){
        return branchAuditRepository.findAll();
    }
    public Branch_audit   addAudit(Branch_audit branch_audit){
        branch_audit.setId(UUID.randomUUID().toString());
        return branchAuditRepository.save(branch_audit);
    }
    public Optional<Branch_audit> getAuditbyid(String id){
        return branchAuditRepository.findById(id);
    }

    public Branch_audit editchecklist(Branch_audit branch_audit){
        //branch_audit.setChecklist();
        return branchAuditRepository.save(branch_audit);
    }

//    public Branch_audit noofopencomments(Branch_audit branch_audit){
//
//
//        int number_of_open_comments=0;
//
//
//    }
   public List<Branch_audit> findAudit_official(Audit_official audit_official){
        return branchAuditRepository.findAudit_official(toString());
   }


}
