package az.texnoera.userms.repository;

import az.texnoera.userms.entity.User;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  private static final List<User> users = List.of(
      new User(1L, "Ali"),
      new User(2L, "Rufat"),
      new User(3L, "Nasir"),
      new User(4L, "Murad"),
      new User(5L, "Latifa")
  );

  public List<User> findAll() {
    return users;
  }

}
