package com.congcoi123.productorder.domain.model.cart;

import com.congcoi123.productorder.domain.validator.ValidatorMessage;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class CartItem {
  private final long id;
  private final long productId;
  private final long cartId;
  private final float price;
  private final float discount;
  private final int quantity;
  private final boolean active;
  @NotBlank(message = ValidatorMessage.SKU_MUST_BE_NOT_BLANK)
  private String sku;
  @NotNull
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String content;
}
