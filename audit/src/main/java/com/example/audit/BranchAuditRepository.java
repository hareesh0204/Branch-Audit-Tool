package com.example.audit;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BranchAuditRepository extends MongoRepository<Branch_audit,String> , CrudRepository<Branch_audit,String> {
//    @Query(branch.);
//    @Query(Branch_audit.count( { ord_dt: { $gt: new Date('01/01/2012') } } ));
  /*  @Query(value = "{status: ?0}", count = true)
    long count2(boolean status);*/
    /*@Query("{db.collection.aggregate([ { "$match": { "Checklist": "true" } }, { "$group": { "_id": "", "count": { "$sum": 1 } }}
            ])}");*/
    /*BranchAuditRepository countBranch_auditByChecklistContaining String ="true";

    BranchAuditRepository countBranch_auditByChecklistIsFalse;*/

    @Query("{'Audit_official.id:?0'}")
    List<Branch_audit> findAudit_official(String id);

}
