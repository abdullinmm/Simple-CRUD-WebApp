package com.coinflipflop.service;

import java.util.List;
import javax.annotation.Resource;

import com.coinflipflop.model.Article;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: marsel
 */

@Service("articleService")
@Transactional
public class ArticleService {
  
  protected static Logger logger = Logger.getLogger("service");
  
  @Resource(name = "sessionFactory")
  private SessionFactory sessionFactory;

  /**
   * Retrieves all article
   *
   * @return a list of article
   * */

  public List<Article> getAll(){
    logger.debug("Retrieves all articles");
    Session session = sessionFactory.getCurrentSession();
    Query query = session.createQuery("from Article");
    return query.list();
  }

  /**
   * Retrieves a singel article
   * */

  public Article get (Integer id) {
    Session session = sessionFactory.getCurrentSession();
    Article article = (Article)session.get(Article.class, id);
    return article;
  }

  /**
   * Adds a new article
   * */

  public void add (Article article){
    logger.debug("Adding new article");
    Session session = sessionFactory.getCurrentSession();
    session.save(article);
  }

  /**
      * Deletes an existing article
 * @param id the id of the existing article
 * */

  public void delete (Integer id) {
    logger.debug("Deleting existing article");
    Session session = sessionFactory.getCurrentSession();
    Article article = (Article)session.get(Article.class, id);
    session.delete(article);
  }

  /**
   * Edits an existing article
   * */

  public void edit(Article article) {
    logger.debug("Editing existing article");
    Session session = sessionFactory.getCurrentSession();
    Article existingArticle = (Article)session.get(Article.class, article.getId());
    existingArticle.setTitle(article.getTitle());
    existingArticle.setArticle(article.getArticle());
    existingArticle.setCode(article.getCode());
    session.save(existingArticle);
  }

}
