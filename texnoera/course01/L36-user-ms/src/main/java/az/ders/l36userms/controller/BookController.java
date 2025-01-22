package az.ders.l36userms.controller;

import az.ders.l36userms.entity.BookEntity;
import az.ders.l36userms.model.enums.BookCategory;
import az.ders.l36userms.model.request.BookRequest;
import az.ders.l36userms.model.response.BookResponse;
import az.ders.l36userms.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BookController {

  private final BookService bookService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void createBook(@RequestBody BookEntity book) {
    bookService.createBook(book);
  }

//  @GetMapping
//  public List<BookEntity> getBooks() {
//    return bookService.getBooks();
//  }

  @GetMapping("{id}")
  public BookEntity getBookById(@PathVariable Long id) {
    return bookService.getBookById(id);
  }

  @GetMapping
  public List<BookEntity> getBookByCategory(
      @RequestParam(value = "category", required = false) BookCategory bookCategory) {
    return bookService.getBookByCategory(bookCategory);
  }

  @PutMapping("{id}")
  public BookResponse updateBook(@PathVariable Long id,
                                 @RequestBody BookRequest bookRequest) {
    return bookService.updateBook(id, bookRequest);
  }

  @DeleteMapping("{book-id}")
  public void deleteBook(@PathVariable("book-id") Long bookId) {
    bookService.deleteBook(bookId);
  }

}
