package az.ders.l40relations.repo;

import az.ders.l40relations.entities.onetoone.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
