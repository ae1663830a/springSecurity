package lt.aejavap.security.authapp.repository;

import lt.aejavap.security.authapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUserByUserName(String userName);
}
