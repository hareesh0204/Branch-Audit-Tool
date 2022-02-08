package com.example.audit;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
public class Branch_official {
    private String name;
    private String Employee_Id;
    private String Title;
    private String Mobilenumber;
    private String photolocation;


}
