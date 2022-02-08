package com.example.audit;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditofficialContoller {
    @PostMapping("/mobileNo")
    public String sendotp(@RequestBody Audit_official mobilenNo ){
        try {
            System.out.println(mobilenNo.getMobilenumber());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "OTP has been sent to your mobile number";
    }
}
