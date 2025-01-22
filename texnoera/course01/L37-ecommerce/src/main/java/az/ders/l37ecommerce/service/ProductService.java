package az.ders.l37ecommerce.service;

import az.ders.l37ecommerce.entity.ProductEntity;
import az.ders.l37ecommerce.mapper.ProductMapper;
import az.ders.l37ecommerce.model.ProductRequest;
import az.ders.l37ecommerce.model.ProductResponse;
import az.ders.l37ecommerce.repository.ProductRepository;
import java.math.BigDecimal;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  public List<ProductResponse> getAllProducts() {
    return ProductMapper.mapToResponseList(productRepository.findAll());
  }

  public ProductResponse getProductById(Long id) {
    return productRepository.findById(id)
        .map(ProductMapper::mapToResponse)
        .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
  }

  public ProductResponse saveProduct(ProductRequest product) {
    ProductEntity productEntity = ProductMapper.mapToEntity(product);
    ProductEntity savedProduct = productRepository.save(productEntity);
    return ProductMapper.mapToResponse(savedProduct);
  }

  public ProductResponse updateProduct(Long id, ProductRequest product) {
    ProductEntity productEntity = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

    productEntity.setName(product.getName());
    productEntity.setDescription(product.getDescription());
    productEntity.setPrice(product.getPrice());
    productEntity.setImageUrl(product.getImageUrl());
    productEntity.setActive(product.getActive());

    ProductEntity updatedProduct = productRepository.save(productEntity);

    return ProductMapper.mapToResponse(updatedProduct);

  }

  public void deleteProduct(Long id) {
    if (productRepository.existsById(id)) {
      productRepository.deleteById(id);
    } else {
      throw new RuntimeException("Product not found with id: " + id);
    }
  }

  public Page<ProductEntity> getProductByPrice(BigDecimal price,
                                               Integer size,
                                               Integer pageNumber) {
    Pageable p = PageRequest.of(pageNumber, size);
    return productRepository.findAllByPriceGreaterThanEqual(price, p);
  }

}