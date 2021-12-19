package com.congcoi123.productorder.domain.model.product;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductCategory {
  private final long productId;
  private final long categoryId;
}
