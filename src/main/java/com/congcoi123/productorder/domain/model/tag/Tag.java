package com.congcoi123.productorder.domain.model.tag;

import com.congcoi123.productorder.domain.validator.ValidatorMessage;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Tag {
  private final long id;
  @NotBlank(message = ValidatorMessage.TITLE_MUST_BE_NOT_BLANK)
  private String title;
  private String metaTitle;
  @NotBlank(message = ValidatorMessage.SLUG_MUST_BE_NOT_BLANK)
  private String slug;
  private String content;
}
