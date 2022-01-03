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
@Table(name = "order_item")
public class OrderItemEntity {
  @EmbeddedId
  private OrderItemEntityKey primaryKey;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private ProductEntity product;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private OrderEntity order;

  private float discount;
  private int quantity;
  private float price;
  private String sku;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;

  private String content;

  public OrderItemEntity(OrderItemEntityKey primaryKey) {
    this.primaryKey = primaryKey;
  }

  public OrderItemEntity(ProductEntity product, OrderEntity order) {
    final var orderItemEntityKey = new OrderItemEntityKey();
    orderItemEntityKey.setProduct(product);
    orderItemEntityKey.setOrder(order);
    this.primaryKey = orderItemEntityKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemEntity that = (OrderItemEntity) o;
    return Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryKey);
  }
}
