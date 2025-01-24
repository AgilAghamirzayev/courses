package az.ders.l40relations.service;

import az.ders.l40relations.entities.onetoone.Profile;
import az.ders.l40relations.entities.onetoone.User;
import az.ders.l40relations.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserService implements ApplicationRunner {

  private final UserRepo userRepo;


  public void deleteUser() {
    User user = userRepo.findById(3L).orElse(new User());
    userRepo.delete(user);
  }

  public void createUser() {
    log.info("createUser.START Creating user-ali777");

    Profile profile = Profile.builder()
        .firstName("Ali")
        .lastName("Khan")
        .build();

    User ali777 = User.builder()
        .username("ali777")
        .profile(profile)
        .build();

    userRepo.save(ali777);

    log.info("createUser.END Creating user-ali777");
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    createUser();
  }

}
