package az.ders.l43jpa.service;

import az.ders.l43jpa.entity.Address;
import az.ders.l43jpa.entity.UserDetails;
import az.ders.l43jpa.repo.UserDetailRepository;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserDetailsService {

  private final UserDetailRepository userDetailRepository;

//  @PostConstruct
  public void saveData() {

    List<UserDetails> users = new ArrayList<>(5);

    for (int i = 1; i <= 5; i++) {
      UserDetails user = UserDetails.builder()
          .name("Name " + i)
          .email("john.doe@example.com")
          .phoneNumber("1234567890" + i)
          .build();

      user.setAddresses(generateAddress(i, user));

      users.add(user);
    }

    userDetailRepository.saveAll(users);
  }

  private List<Address> generateAddress(int value, UserDetails user) {

    Address address1 = Address.builder()
        .street("123 Main St " + value)
        .city("New York " + value)
        .zipCode("10001" + value)
        .userDetails(user)
        .build();

    Address address2 = Address.builder()
        .street("456 Elm St " + value)
        .city("Los Angeles " + value)
        .zipCode("90001" + value)
        .userDetails(user)
        .build();

    Address address3 = Address.builder()
        .street("789 Oak St " + value)
        .city("Chicago " + value)
        .zipCode("60601 " + value)
        .userDetails(user)
        .build();
    return List.of(address1, address2, address3);
  }

  @SneakyThrows
  public List<UserDetails> getUsers() {
    List<UserDetails> name = userDetailRepository.findByNameContaining("Name");


    // call method
    // get data from service
    return name;
  }

}
