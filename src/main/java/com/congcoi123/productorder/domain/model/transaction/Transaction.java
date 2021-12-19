package com.congcoi123.productorder.domain.model.transaction;

import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Transaction {
  private final long id;
  private final long userId;
  private final long orderId;
  private final int type;
  private final int mode;
  private final int status;
  @NotBlank
  private String code;
  @NotNull
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String content;
}
