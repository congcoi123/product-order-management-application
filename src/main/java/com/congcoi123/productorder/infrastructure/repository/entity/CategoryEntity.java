package com.congcoi123.productorder.infrastructure.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "category")
public class CategoryEntity {
  @Id
  private long id;

  private CategoryEntity parent;
  private String title;
  private String metaTitle;
  private String slug;
  private String content;
}
