package com.example.audit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AuditApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(BranchAuditRepository branchAuditRepository,
                            MongoTemplate mongoTemplate){
        return args->{
            Audit_official audit_official= new Audit_official("has","01","employee","8943021432","ghj","ghj");
            Branch_official branch_official=new Branch_official("f","65","hgc","7654567654","6543");
            AuditComments auditComments=new AuditComments("","","","",
                    "","","","","","","","",
                    "","");
            Branch_audit branch_audit = new Branch_audit("dfgh","jhj");
            branchAuditRepository.insert(branch_audit);


            Query query =new Query();



        };

    }

}
