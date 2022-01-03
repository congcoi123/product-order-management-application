package com.congcoi123.productorder.infrastructure.repository.entity;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "user")
public class UserEntity {
  @Id
  private long id;
  private boolean admin;
  private boolean vendor;
  private String firstName;
  private String middleName;
  private String lastName;
  private String mobile;
  private String email;
  private String passwordHash;

  @CreationTimestamp
  private LocalDateTime registeredAt;

  @UpdateTimestamp
  private LocalDateTime lastLogin;

  private String intro;
  private String profile;

  @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<OrderItemEntity> orders;

  @OneToMany(mappedBy = "carts", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<CartItemEntity> carts;

  @OneToMany(mappedBy = "transactions", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<TransactionEntity> transactions;

  @OneToMany(mappedBy = "products", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<ProductEntity> products;
}
