package com.congcoi123.productorder.infrastructure.repository.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class TransactionEntityKey implements Serializable {
  @ManyToOne
  private UserEntity user;

  @ManyToOne
  private OrderEntity order;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionEntityKey that = (TransactionEntityKey) o;
    return Objects.equals(user, that.user) && Objects.equals(order, that.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, order);
  }
}
