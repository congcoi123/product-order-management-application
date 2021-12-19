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
public class ProductReview {
  private final long id;
  private final long productId;
  private long parentId;
  @NotBlank(message = ValidatorMessage.TITLE_MUST_BE_NOT_BLANK)
  private String title;
  private int rating;
  private boolean published;
  @NotNull
  private LocalDateTime createdAt;
  private LocalDateTime publishedAt;
  private String content;
}
