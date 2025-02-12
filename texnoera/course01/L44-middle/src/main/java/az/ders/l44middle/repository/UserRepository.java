package az.ders.l44middle.repository;

import az.ders.l44middle.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.MonthDay;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE FUNCTION('MONTH', u.birthDate) = :month " +
           "AND FUNCTION('DAY', u.birthDate) = :day")
    List<User> findUsersByBirthMonthAndDay(int month, int day);

}