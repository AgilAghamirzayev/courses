package az.ders.l37ecommerce.controller;

import az.ders.l37ecommerce.entity.ProductEntity;
import az.ders.l37ecommerce.model.ProductRequest;
import az.ders.l37ecommerce.model.ProductResponse;
import az.ders.l37ecommerce.service.ProductService;
import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
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
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

  private final ProductService productService;

  @GetMapping
  public List<ProductResponse> getAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping("/{id}")
  public ProductResponse getProductById(@PathVariable Long id) {
    return productService.getProductById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public ProductResponse createProduct(@RequestBody ProductRequest product) {
    return productService.saveProduct(product);
  }

  @PutMapping("/{id}")
  public ProductResponse updateProduct(@PathVariable Long id,
                                       @RequestBody ProductRequest product) {
    return productService.updateProduct(id, product);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteProduct(@PathVariable Long id) {
    productService.deleteProduct(id);
  }

  @GetMapping("/price")
  public Page<ProductEntity> getProductByPrice(@RequestParam BigDecimal price,
                                               @RequestParam(defaultValue = "10") Integer size,
                                               @RequestParam(defaultValue = "0") Integer page) {
    return productService.getProductByPrice(price, size, page);
  }

  @PostMapping("/bulk")
  public void createRandomProducts() {
    Random random = new Random();

    IntStream.range(0, 1000000).forEach(i -> {
      ProductRequest product = ProductRequest.builder()
          .name("Product " + (i + 1))
          .description("Description for Product " + (i + 1))
          .price(BigDecimal.valueOf(10000 + (100 - 10) * random.nextDouble()))
          .active(random.nextBoolean())
          .imageUrl("https://dummyimage.com/600x400/000/fff&text=Product" + (i + 1))
          .build();

      productService.saveProduct(product);
    });

  }

}
