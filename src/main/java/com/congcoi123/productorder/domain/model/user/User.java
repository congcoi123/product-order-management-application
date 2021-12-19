package com.congcoi123.productorder.domain.model.user;

import com.congcoi123.productorder.domain.validator.ValidatorMessage;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
  private final long id;
  private final boolean admin;
  private final boolean vendor;
  private String firstName;
  private String middleName;
  private String lastName;
  private String mobile;
  private String email;
  @NotBlank(message = ValidatorMessage.PASSWORD_HASH_MUST_BE_NOT_BLANK)
  private String passwordHash;
  @NotNull
  private LocalDateTime registeredAt;
  private LocalDateTime lastLogin;
  private String intro;
  private String profile;
}
