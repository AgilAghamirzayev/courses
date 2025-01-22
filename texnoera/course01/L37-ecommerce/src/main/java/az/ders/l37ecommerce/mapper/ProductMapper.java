package az.ders.l37ecommerce.mapper;

import az.ders.l37ecommerce.entity.ProductEntity;
import az.ders.l37ecommerce.model.ProductRequest;
import az.ders.l37ecommerce.model.ProductResponse;
import java.util.List;

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


}
