package my.company.helloservice.repository;

import my.company.helloservice.model.Hello;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HelloRepository extends JpaRepository<Hello, Long> {
}
