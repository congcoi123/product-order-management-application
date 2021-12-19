package com.congcoi123.productorder.infrastructure.repository.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
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
public class ProductTagEntityKey implements Serializable {
  @ManyToOne
  @JoinColumn(name = "id", nullable = false)
  private ProductEntity product;
  @ManyToOne
  @JoinColumn(name = "id", nullable = false)
  private TagEntity tag;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTagEntityKey that = (ProductTagEntityKey) o;
    return Objects.equals(product, that.product) && Objects.equals(tag, that.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, tag);
  }
}
