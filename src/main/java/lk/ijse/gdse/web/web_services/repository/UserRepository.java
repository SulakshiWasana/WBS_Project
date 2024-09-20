package lk.ijse.gdse.web.web_services.repository;

import lk.ijse.gdse.web.web_services.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
