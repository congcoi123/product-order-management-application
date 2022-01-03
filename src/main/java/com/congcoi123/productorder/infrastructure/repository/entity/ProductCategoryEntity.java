package com.congcoi123.productorder.infrastructure.repository.entity;

import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_category")
public class ProductCategoryEntity {
  @EmbeddedId
  private ProductCategoryEntityKey primaryKey;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private ProductEntity product;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private CategoryEntity category;

  public ProductCategoryEntity(ProductEntity product, CategoryEntity category) {
    final var productCategoryEntityKey = new ProductCategoryEntityKey();
    productCategoryEntityKey.setProduct(product);
    productCategoryEntityKey.setCategory(category);
    this.primaryKey = productCategoryEntityKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCategoryEntity that = (ProductCategoryEntity) o;
    return Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryKey);
  }
}
