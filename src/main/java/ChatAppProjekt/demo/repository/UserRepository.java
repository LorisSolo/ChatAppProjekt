package ChatAppProjekt.demo.repository;

import ChatAppProjekt.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    User findByPhoneNumber(String phoneNumber);

}
