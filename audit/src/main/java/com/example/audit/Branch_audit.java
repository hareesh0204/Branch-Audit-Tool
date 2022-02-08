package com.example.audit;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Stack;

@Data

@Document(collection = "branch_audit")
public class Branch_audit {
    @Id
    private String id;
    private String Branchname;
    private String Managername;
    private String isaudited;
    private Branch_official branch_official;
    private Audit_official audit_official;
    private AuditComments auditComments;



    List<S> stack = new Stack<checklist >() {{
        String checklist_id="";
        add(checklist_id);
        String type="";
        add(type);
        Boolean status=false;
        add(status);
    } };

    private LocalDateTime commencment;
    private LocalDateTime completion;

    public Branch_audit(String branchname, String managername, String isaudited, Branch_official branch_official, Audit_official audit_official, AuditComments auditComments, LocalDateTime commencment, LocalDateTime completion) {
        Branchname = branchname;
        Managername = managername;
        this.isaudited = isaudited;
        this.branch_official = branch_official;
        this.audit_official = audit_official;
        this.auditComments = auditComments;
        this.commencment = commencment;
        this.completion = completion;
    }
}
