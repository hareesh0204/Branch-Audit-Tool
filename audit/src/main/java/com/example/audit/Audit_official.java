package com.example.audit;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "Audit_official")
public class Audit_official {
    @Id
    private String id;
    private String name;
    private String Employee_Id;
    private String Title;
    private String mobilenumber;
    private String photolocation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployee_Id() {
        return Employee_Id;
    }

    public void setEmployee_Id(String employee_Id) {
        Employee_Id = employee_Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getPhotolocation() {
        return photolocation;
    }

    public void setPhotolocation(String photolocation) {
        this.photolocation = photolocation;
    }
}
