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
@Table(name = "cart")
public class CartEntity {
  @Id
  private long id;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
  private UserEntity user;

  private int status;
  private String sessionId;
  private String token;
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

  @OneToMany(mappedBy = "items", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<CartItemEntity> items;
}
