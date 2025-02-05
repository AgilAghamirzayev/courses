package az.ders.l39ecommerce.controller;

import az.ders.l39ecommerce.ann.A;
import az.ders.l39ecommerce.model.PagedResponse;
import az.ders.l39ecommerce.model.ProductResponse;
import az.ders.l39ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@A
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;

//  @GetMapping
//  public Page<ProductResponse> getAllProducts(@RequestParam(defaultValue = "0") int page,
//                                              @RequestParam(defaultValue = "10") int size) {
//    return productService.getAllProducts(page, size);
//  }


//  @GetMapping
//  public PagedResponse<ProductResponse> getAllProducts(@RequestParam(defaultValue = "0") int page,
//                                                       @RequestParam(defaultValue = "10") int size) {
//    return productService.getAllProducts(page, size);
//  }


  @GetMapping
  public PagedResponse<ProductResponse> getAllProducts(@RequestParam(defaultValue = "0") int page,
                                                       @RequestParam(defaultValue = "10") int size,
                                                       @RequestParam(defaultValue = "id")
                                                       String sortBy,
                                                       @RequestParam(defaultValue = "ASC")
                                                       String sortDirection
  ) {
    return productService.getAllProducts(page, size, sortBy, sortDirection);
  }


}
