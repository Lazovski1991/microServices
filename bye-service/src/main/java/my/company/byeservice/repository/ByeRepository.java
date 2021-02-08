package my.company.byeservice.repository;

import my.company.byeservice.model.Bye;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ByeRepository extends JpaRepository<Bye, Long> {
}
