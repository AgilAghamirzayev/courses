package az.ders.l35userms.repository;

import az.ders.l35userms.entity.BookEntity;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Repository;

@Getter
@Repository
public class BookRepository {

  private final List<BookEntity> books = new ArrayList<>();



}
