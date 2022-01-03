package com.congcoi123.productorder.infrastructure.repository.entity;

import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "product_tag")
public class ProductTagEntity {
  @EmbeddedId
  private ProductTagEntityKey primaryKey;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private ProductEntity product;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private TagEntity tag;

  public ProductTagEntity(ProductTagEntityKey primaryKey) {
    this.primaryKey = primaryKey;
  }

  public ProductTagEntity(ProductEntity product, TagEntity tag) {
    final var productTagEntityKey = new ProductTagEntityKey();
    productTagEntityKey.setProduct(product);
    productTagEntityKey.setTag(tag);
    this.primaryKey = productTagEntityKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTagEntity that = (ProductTagEntity) o;
    return Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryKey);
  }
}
