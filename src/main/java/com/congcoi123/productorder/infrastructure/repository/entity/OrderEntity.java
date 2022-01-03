package com.congcoi123.productorder.infrastructure.repository.entity;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "order")
public class OrderEntity {
  @Id
  private long id;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
  private UserEntity user;

  @OneToMany(mappedBy = "items", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<OrderItemEntity> items;

  @OneToMany(mappedBy = "transactions", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<TransactionEntity> transactions;

  private int status;
  private float subTotal;
  private float itemDiscount;
  private float tax;
  private float shipping;
  private float total;
  private float discount;
  private float grandTotal;
  private String sessionId;
  private String token;
  private String promo;
  private String firstName;
  private String middleName;
  private String lastName;
  private String mobile;
  private String email;
  private String line1;
  private String line2;
  private String city;
  private String province;
  private String country;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;

  private String content;
}
