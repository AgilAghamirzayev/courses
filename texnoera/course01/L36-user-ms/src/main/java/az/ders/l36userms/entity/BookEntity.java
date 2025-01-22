package az.ders.l36userms.entity;

import az.ders.l36userms.model.enums.BookCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Entity // BOOK_ENTITY
@Table(name = "books")
public class BookEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "book_name", unique = true, length = 50)
  private String name;

  @Column(name = "book_name", unique = true, length = 50)
  private String author;

  @Enumerated(EnumType.STRING)
  private BookCategory category;

  @CreationTimestamp
  private LocalDateTime insertedDate;

  @UpdateTimestamp
  private LocalDateTime updatedDate;

}
