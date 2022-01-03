package com.congcoi123.productorder.domain.model.cart;

import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Cart {
  private final long id;
  private long userId;
  private int status;
  @NotBlank
  private String sessionId;
  @NotBlank
  private String token;
  private String firstName;
  private String middleName;
  private String lastName;
  private String mobile;
  private String email;
  private String line1;
  private String line2;
  private String city;
  private String province;
  private String country;
  @NotNull
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String content;
}
