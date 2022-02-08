package com.example.audit;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/branchaudit")
@AllArgsConstructor
public class BranchAuditController {
    private final crudoperations crudoperations;
    private final auditofficialService auditofficialService;

    @Autowired

    @GetMapping("/all")
    private  ResponseEntity<List<Branch_audit>> getAlbranchAudit(){
        List<Branch_audit> branch_audit = crudoperations.getAllbranchAudit();
        return  new ResponseEntity<>(branch_audit, HttpStatus.OK);
    }


    @GetMapping("/find/{id}")
    private ResponseEntity<Optional<Branch_audit>> getbranchAuditbyid(@PathVariable("id") String id){
        Optional<Branch_audit> branch_audits = crudoperations.getAuditbyid(id);
        return  new ResponseEntity<>(branch_audits, HttpStatus.OK);
    }
//    @GetMapping("/find/auditdetails/{id}")
//    private  List<Branch_audit> getAuditdetails(@PathVariable("id") String id) {
////        List<Branch_audit> branch_audit = crudoperations.findAudit_official();
//        return BranchAuditRepository.

//    @PutMapping()
//    @DeleteMapping()
    @PostMapping("/add")
    public ResponseEntity<Branch_audit> addAuditReport(@RequestBody Branch_audit branch_audit) {
        Branch_audit newbranch_audit = crudoperations.addAudit(branch_audit);
        return new ResponseEntity<>(newbranch_audit, HttpStatus.CREATED);
    }

}
