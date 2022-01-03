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
@Table(name = "transaction")
public class TransactionEntity {
  @EmbeddedId
  private TransactionEntityKey primaryKey;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private UserEntity user;

  @ManyToOne
  @JoinColumn(insertable = false, updatable = false)
  private OrderEntity order;

  private int type;
  private int mode;
  private int status;
  private String code;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;

  private String content;

  public TransactionEntity(TransactionEntityKey primaryKey) {
    this.primaryKey = primaryKey;
  }

  public TransactionEntity(UserEntity user, OrderEntity order) {
    final var transactionEntityKey = new TransactionEntityKey();
    transactionEntityKey.setUser(user);
    transactionEntityKey.setOrder(order);
    this.primaryKey = transactionEntityKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionEntity that = (TransactionEntity) o;
    return Objects.equals(primaryKey, that.primaryKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryKey);
  }
}
