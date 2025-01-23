package az.ders.l39ecommerce.mapper;


import az.ders.l39ecommerce.entity.ProductEntity;
import az.ders.l39ecommerce.model.PagedResponse;
import az.ders.l39ecommerce.model.ProductRequest;
import az.ders.l39ecommerce.model.ProductResponse;
import java.util.List;
import org.springframework.data.domain.Page;

public interface ProductMapper {

  static ProductEntity mapToEntity(ProductRequest product) {
    return ProductEntity.builder()
        .name(product.getName())
        .price(product.getPrice())
        .active(product.getActive())
        .imageUrl(product.getImageUrl())
        .description(product.getDescription())
        .build();
  }

  static ProductResponse mapToResponse(ProductEntity product) {
    return ProductResponse.builder()
        .id(product.getId())
        .name(product.getName())
        .price(product.getPrice())
        .active(product.getActive())
        .imageUrl(product.getImageUrl())
        .description(product.getDescription())
        .build();
  }

  static List<ProductResponse> mapToResponseList(List<ProductEntity> products) {
    return products.stream().map(product ->
        ProductResponse.builder()
            .id(product.getId())
            .name(product.getName())
            .price(product.getPrice())
            .active(product.getActive())
            .imageUrl(product.getImageUrl())
            .description(product.getDescription())
            .build()
    ).toList();
  }


  static PagedResponse<ProductResponse> mapToPagedResponse(Page<ProductEntity> products) {
    List<ProductResponse> productResponses = products.map(product ->
        ProductResponse.builder()
            .id(product.getId())
            .name(product.getName())
            .price(product.getPrice())
            .active(product.getActive())
            .imageUrl(product.getImageUrl())
            .description(product.getDescription())
            .build()
    ).toList();

    return new PagedResponse<>(
        productResponses,
        products.getNumber(),
        products.getSize(),
        products.getTotalElements(),
        products.getTotalPages(),
        products.isLast()
    );
  }

}
