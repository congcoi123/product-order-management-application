package com.congcoi123.productorder.domain.validator;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ValidatorMessage {
  public final String SLUG_MUST_BE_NOT_BLANK = "slug must be not blank";
  public final String SKU_MUST_BE_NOT_BLANK = "SKU must be not blank";
  public final String KEY_MUST_BE_NOT_BLANK = "key must be not blank";
  public final String COMMENT_ID_MUST_BE_NOT_NULL = "id must be not null";
  public final String REQUEST_BODY_MUST_BE_NOT_NULL = "request body must be not null";
  public final String USERNAME_MUST_BE_NOT_BLANK = "username must be not blank";
  public final String EMAIL_MUST_BE_NOT_BLANK = "email must be not blank";
  public final String PASSWORD_MUST_BE_NOT_BLANK = "password must be not blank";
  public final String PASSWORD_HASH_MUST_BE_NOT_BLANK = "password hash must be not blank";
  public final String TITLE_MUST_BE_NOT_BLANK = "title must not be blank";
  public final String DESCRIPTION_MUST_BE_NOT_BLANK = "description must not be blank";
  public final String BODY_MUST_BE_NOT_BLANK = "body must not be blank";
}
