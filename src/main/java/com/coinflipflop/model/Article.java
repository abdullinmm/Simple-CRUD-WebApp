package com.coinflipflop.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author: marsel
 */

@Entity
@Table(name = "documentation")
public class Article implements Serializable {
  
  private static final long  serialVersionUID = 5527566248002296042L;
  
  @Id
  @Column(name = "id")
  @GeneratedValue Integer id;
  
  @Column(name = "title")
  private String title;
  
  @Column(name = "article")
  private String article;
  
  @Column(name = "code")
  private String code;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArticle() {
    return article;
  }

  public void setArticle(String article) {
    this.article = article;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
