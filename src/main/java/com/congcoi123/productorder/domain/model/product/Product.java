package com.congcoi123.productorder.domain.model.product;

import com.congcoi123.productorder.domain.validator.ValidatorMessage;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {
  private final long id;
  private final long userId;
  private final int type;
  private final float price;
  private final float discount;
  private final int quantity;
  private final int shop;
  @NotBlank(message = ValidatorMessage.TITLE_MUST_BE_NOT_BLANK)
  private String title;
  private String metaTitle;
  @NotBlank(message = ValidatorMessage.SLUG_MUST_BE_NOT_BLANK)
  private String slug;
  private String summary;
  @NotBlank(message = ValidatorMessage.SKU_MUST_BE_NOT_BLANK)
  private String sku;
  @NotNull
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime publishedAt;
  private LocalDateTime startsAt;
  private LocalDateTime endsAt;
  private String content;
}
