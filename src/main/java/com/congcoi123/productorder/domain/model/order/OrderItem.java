package com.congcoi123.productorder.domain.model.order;

import com.congcoi123.productorder.domain.validator.ValidatorMessage;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderItem {
  private final long id;
  private final long productId;
  private final long orderId;
  private final float discount;
  private final int quantity;
  private final float price;
  @NotBlank(message = ValidatorMessage.SLUG_MUST_BE_NOT_BLANK)
  private String sku;
  @NotNull
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String content;
}
