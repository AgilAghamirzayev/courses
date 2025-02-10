package az.ders.l43jpa.repo;

import az.ders.l43jpa.entity.UserDetails;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetails, Long> {

//    @Query("SELECT u FROM UserDetails u JOIN FETCH u.addresses where u.name like %:name%")
//  @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, value = "user_details_entity_graph")
  @EntityGraph(attributePaths = {"addresses"})
  List<UserDetails> findByNameContaining(String name);

}