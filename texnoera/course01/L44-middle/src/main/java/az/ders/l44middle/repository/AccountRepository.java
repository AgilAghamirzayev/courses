package az.ders.l44middle.repository;

import az.ders.l44middle.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}