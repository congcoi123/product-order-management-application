package com.congcoi123.productorder.domain.model.tag;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductTag {
  private final long productId;
  private final long tagId;
}
