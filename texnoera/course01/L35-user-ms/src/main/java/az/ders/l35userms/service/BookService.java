package az.ders.l35userms.service;

import az.ders.l35userms.entity.BookEntity;
import az.ders.l35userms.model.enums.BookCategory;
import az.ders.l35userms.model.request.BookRequest;
import az.ders.l35userms.model.response.BookResponse;
import az.ders.l35userms.repository.BookRepository;
import java.util.List;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class BookService {

  private final BookRepository bookRepository;

  public void createBook(BookEntity book) {
    log.info("createBook.START Creating book-id: {}", book.getId());
    bookRepository.getBooks().add(book);
    log.info("createBook.END Creating book: {}", book);
  }

  public List<BookEntity> getBooks() {
    log.info("getBooks.START Getting all books");
    List<BookEntity> books = bookRepository.getBooks();
    log.info("getBooks.END Getting all books. Number of books: {}", books.size());
    return books;
  }

  public BookEntity getBookById(Long id) {
    log.info("getBookById.START Getting book by id: {}", id);
    return bookRepository.getBooks().stream()
        .filter(bookEntity -> bookEntity.getId().equals(id))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("Book not found by id: " + id));
  }

  public List<BookEntity> getBookByCategory(BookCategory bookCategory) {
    if (Objects.isNull(bookCategory)) {
      return bookRepository.getBooks();
    }

    return bookRepository.getBooks().stream()
        .filter(bookEntity -> bookEntity.getCategory().equals(bookCategory))
        .toList();
  }

  public void deleteBook(Long bookId) {
    bookRepository.getBooks().stream()
        .filter(bookEntity -> bookEntity.getId().equals(bookId))
        .findFirst()
        .ifPresent(bookRepository.getBooks()::remove);
  }

  public BookResponse updateBook(Long id, BookRequest request) {
    BookEntity bookEntity = getBookById(id);

    if (Objects.nonNull(request.getName())) {
      bookEntity.setAuthor(request.getName());
    }

    if (Objects.nonNull(request.getCategory())) {
      bookEntity.setCategory(request.getCategory());
    }

    return BookResponse.of(bookEntity.getId(), request.getName(), request.getCategory());
  }
}
