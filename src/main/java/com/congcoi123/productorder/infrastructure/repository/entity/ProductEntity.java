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
@Table(name = "product")
public class ProductEntity {
  @Id
  private long id;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
  private UserEntity user;

  private int type;
  private float price;
  private float discount;
  private int quantity;
  private int shop;
  private String title;
  private String metaTitle;
  private String slug;
  private String summary;
  private String sku;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;

  @UpdateTimestamp
  private LocalDateTime publishedAt;

  @UpdateTimestamp
  private LocalDateTime startsAt;

  @UpdateTimestamp
  private LocalDateTime endsAt;

  private String content;

  @OneToMany(mappedBy = "categories", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<ProductCategoryEntity> categories;

  @OneToMany(mappedBy = "reviews", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<ProductReviewEntity> reviews;

  @OneToMany(mappedBy = "metas", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<ProductMetaEntity> metas;

  @OneToMany(mappedBy = "tags", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<ProductTagEntity> tags;

  @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<OrderItemEntity> orders;

  @OneToMany(mappedBy = "carts", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<CartItemEntity> carts;
}
