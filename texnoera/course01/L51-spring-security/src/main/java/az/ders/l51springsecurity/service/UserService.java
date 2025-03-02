package az.ders.l51springsecurity.service;

import az.ders.l51springsecurity.entity.Authority;
import az.ders.l51springsecurity.entity.User;
import az.ders.l51springsecurity.model.UserRequest;
import az.ders.l51springsecurity.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

  private final PasswordEncoder passwordEncoder;
  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) {
    return userRepository.findByUsername(username)
        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
  }

  @PostConstruct
  public void initData( ) {
    Authority admin = Authority.builder()
        .authority("ROLE_ADMIN")
        .build();

    User user = User.builder()
        .username("ali")
        .password(passwordEncoder.encode("secret"))
        .authorities(Set.of(admin))
        .build();

    admin.setUser(user);

    Optional<User> byUsername = userRepository.findByUsername(user.getUsername());

    if (byUsername.isEmpty()) {
      userRepository.save(user);
    }
  }

  public void login(UserRequest userRequest) {
    User user = userRepository.findByUsername(userRequest.username())
       .orElseThrow(() -> new RuntimeException("User not found"));

    if (!passwordEncoder.matches(userRequest.password(), user.getPassword())) {
      throw new RuntimeException("Invalid password");
    }

    loadUserByUsername(userRequest.username());
  }

//  public void userRegister(UserRequest userRequest) {
//    // 1 is user exists in database or not
////    if (userRepository.existsByUsername(userRequest.getUsername())) {
////      throw new RuntimeException("User already exists");
////    }
//
//    User user = User.builder()
//       .username(userRequest.getUsername())
//       .password(passwordEncoder.encode(userRequest.getPassword()))
//        .authorities(Set.of(Authority.builder().authority("ROLE_USER").build()))
//       .build();
//
//    userRepository.save(user);
//  }

}
