package az.ders.l45liquibaseschedulerasync.repository;

import az.ders.l45liquibaseschedulerasync.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE FUNCTION('MONTH', u.birthDate) = :month " +
           "AND FUNCTION('DAY', u.birthDate) = :day")
    List<User> findUsersByBirthMonthAndDay(int month, int day);

}