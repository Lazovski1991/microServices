package my.company.eurekaex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaexApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaexApplication.class, args);
    }

}
