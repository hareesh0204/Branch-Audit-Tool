package com.example.audit;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class  Checklist {
    private Boolean productdetailsdisplay;
    private Boolean firstaid;
    private Boolean fireextinguisher;
    private Boolean HRfilesdisplay;
    private Boolean cctvworkingcondition;
    private Boolean furnituresworkingcondition;
    private Boolean infosecpolicyadherence;
    private Boolean branchcleanliness;
    private Boolean pettycashclosure;
    private Boolean collectionsreciptsfiling;
    private Boolean branchclosure;
    private Boolean customergrievances;
    private Boolean covidprotocol;
    private Boolean visitorsregister;

   
}
