package az.ders.l39ecommerce.service;

import static az.ders.l39ecommerce.mapper.ProductMapper.mapToPagedResponse;

import az.ders.l39ecommerce.entity.ProductEntity;
import az.ders.l39ecommerce.mapper.ProductMapper;
import az.ders.l39ecommerce.model.PagedResponse;
import az.ders.l39ecommerce.model.ProductResponse;
import az.ders.l39ecommerce.repository.ProductRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

//  public Page<ProductResponse> getAllProducts(int page, int size) {
//    Page<ProductEntity> all = productRepository.findAll(PageRequest.of(page, size));
//    return all.map(ProductMapper::mapToResponse);
//  }

//  public PagedResponse<ProductResponse> getAllProducts(int page, int size) {
//    Page<ProductEntity> productPage = productRepository.findAll(PageRequest.of(page, size));
//
//    List<ProductResponse> content = productPage.getContent()
//        .stream()
//        .map(ProductMapper::mapToResponse)
//        .toList();
//
//    return new PagedResponse<>(
//        content,
//        productPage.getNumber(),
//        productPage.getSize(),
//        productPage.getTotalElements(),
//        productPage.getTotalPages(),
//        productPage.isLast()
//    );
//  }

//  public PagedResponse<ProductResponse> getAllProducts(int page, int size) {
//    Page<ProductEntity> productPage = productRepository.findAll(PageRequest.of(page, size));
//    return ProductMapper.mapToPagedResponse(productPage);
//  }

//  public PagedResponse<ProductResponse> getAllProducts(int page, int size) {
//    return mapToPagedResponse(productRepository.findAll(PageRequest.of(page, size)));
//  }

//  public PagedResponse<ProductResponse> getAllProducts(int page,
//                                                       int size,
//                                                       String sortBy,
//                                                       String sortDirection) {
//    Sort sort = Sort.Direction.ASC.name().equalsIgnoreCase(sortDirection)
//        ? Sort.by(sortBy).ascending()
//        : Sort.by(sortBy).descending();
//
//    return ProductMapper.mapToPagedResponse(productRepository.findAll(PageRequest.of(page, size, sort)));
//  }

//  public PagedResponse<ProductResponse> getAllProducts(int page,
//                                                       int size,
//                                                       String sortBy,
//                                                       String sortDirection) {
//    Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name())
//        ? Sort.by(sortBy).ascending()
//        : Sort.by(sortBy).descending();
//
//    return mapToPagedResponse(productRepository.findAll(PageRequest.of(page, size, sort)));
//  }

  public PagedResponse<ProductResponse> getAllProducts(int page,
                                                       int size,
                                                       String sortBy,
                                                       String sortDirection) {
    Sort sort = getSortedDirection(sortBy, sortDirection);
    return mapToPagedResponse(productRepository.findAll(PageRequest.of(page, size, sort)));
  }

  private static Sort getSortedDirection(String sortBy, String sortDirection) {
    return sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name())
        ? Sort.by(sortBy).ascending()
        : Sort.by(sortBy).descending();
  }

}