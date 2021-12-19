package com.congcoi123.productorder.domain.model.product;

import com.congcoi123.productorder.domain.validator.ValidatorMessage;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductMeta {
  private final long id;
  private final long productId;
  @NotBlank(message = ValidatorMessage.KEY_MUST_BE_NOT_BLANK)
  private String key;
  private String content;
}
