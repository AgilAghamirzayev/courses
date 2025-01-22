package az.ders.l37ecommerce.repository;

import az.ders.l37ecommerce.entity.ProductEntity;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

  Page<ProductEntity> findAllByPriceGreaterThanEqual(BigDecimal price, Pageable pageable);

//  @Query(value = "select * from products p where p.active=true and p.price > ?1",
//      nativeQuery = true)
//  List<ProductEntity> getActiveProductByPrice(BigDecimal price);


  // JPQL
  @Query(value = "select p from ProductEntity  p where p.active=:a and p.price=:price")
  List<ProductEntity> getActiveProductByPrice(@Param("a") Boolean feuiewfegwfegfgeyfeguyyfgeuew,
                                              BigDecimal price);

//  List<ProductEntity> findAllByActiveAndPriceGreaterThanEqual(Boolean isActive,BigDecimal price);

}