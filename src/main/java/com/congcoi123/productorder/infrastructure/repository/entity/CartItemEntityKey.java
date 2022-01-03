package com.congcoi123.productorder.infrastructure.repository.entity;

import com.congcoi123.productorder.domain.validator.ValidatorMessage;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CartItemEntityKey implements Serializable {
  @ManyToOne
  private CartEntity cart;

  @ManyToOne
  private ProductEntity product;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemEntityKey that = (CartItemEntityKey) o;
    return Objects.equals(cart, that.cart) &&
        Objects.equals(product, that.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart, product);
  }
}
