package lt.aejavap.security.authapp.repository;

import lt.aejavap.security.authapp.domain.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRoleRepository extends JpaRepository<AccountRole, String> {

}
