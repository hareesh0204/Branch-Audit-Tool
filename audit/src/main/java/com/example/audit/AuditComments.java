package com.example.audit;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
public class AuditComments {
    private String productdetailsdisplay;
    private String firstaid;
    private String fireextinguisher;
    private String HRfilesdisplay;
    private String cctvworkingcondition;
    private String furnituresworkingcondition;
    private String infosecpolicyadherence;
    private String branchcleanliness;
    private String pettycashclosure;
    private String collectionsreciptsfiling;
    private String branchclosure;
    private String customergrievances;
    private String covidprotocol;
    private String visitorsregister;


}
