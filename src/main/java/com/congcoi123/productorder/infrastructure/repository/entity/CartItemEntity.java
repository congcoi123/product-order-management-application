package com.congcoi123.productorder.infrastructure.repository.entity;

import java.time.LocalDateTime;
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
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart_item")
public class CartItemEntity {
  @EmbeddedId
  private CartItemEntityKey primaryKey;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private CartEntity cart;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private ProductEntity product;

  private float price;
  private float discount;
  private int quantity;
  private boolean active;
  private String sku;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;

  private String content;

  public CartItemEntity(CartItemEntityKey primaryKey) {
    this.primaryKey = primaryKey;
  }

  public CartItemEntity(CartEntity cart, ProductEntity product) {
    final var cartItemEntityKey = new CartItemEntityKey();
    cartItemEntityKey.setCart(cart);
    cartItemEntityKey.setProduct(product);
    this.primaryKey = cartItemEntityKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemEntity that = (CartItemEntity) o;
    return Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryKey);
  }
}
