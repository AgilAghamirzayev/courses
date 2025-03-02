package az.ders.l51springsecurity.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .csrf(Customizer.withDefaults())
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/public/**").permitAll()
            .requestMatchers("/user/**").hasRole("USER")
            .requestMatchers("/admin/**").hasRole("ADMIN")  // admin rolesi olanlar daxil olacaq
            .anyRequest().authenticated()  // login olan herkes daxil olacaq/ role ferqi yoxdur
        )
        .httpBasic(Customizer.withDefaults())
        .formLogin(Customizer.withDefaults());

    return http.build();
  }

//  @Bean
//  public UserDetailsService userDetailsService() {
//
//    UserDetails user = User.withUsername("ali")
//        .password(passwordEncoder().encode("secret"))
//        .roles("USER")
//        .build();
//
//    UserDetails admin = User.withUsername("vali")
//        .password(passwordEncoder().encode("admin"))
//        .roles("ADMIN")
//        .build();
//
//    return new InMemoryUserDetailsManager(user, admin);
//  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

}
