package com.coinflipflop.controller;

import java.util.List;
import javax.annotation.Resource;

import com.coinflipflop.model.Article;
import com.coinflipflop.service.ArticleService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: marsel
 */

@Controller
@RequestMapping("/main")
public class MainController {
  protected static Logger logger = Logger.getLogger("controller");

  @Resource(name = "articleService")
  private ArticleService articleService;

  /**
   * Handles and retrieves all articles and show it in a JSP page
   *
   * @return the name of the JSP page
   */

  @RequestMapping(value = "articles", method = RequestMethod.GET)
  public String getAtricles(Model model) {
    logger.debug("Received request to show all articles");

    List<Article> articles = articleService.getAll();
    model.addAttribute("articles", articles);
    return "articlespage";
  }

  /**
   * Retrieves the add page
   *
   * @return the name of the JSP page
   * */

  @RequestMapping(value = "articles/add", method = RequestMethod.GET)
  public String getAdd(Model model){
    logger.debug("Received request to show add page");
    model.addAttribute("articleAttribute", new Article());
    return "addpage";
  }

  /**
   * Adds a new article by delegating the processing to ArticleService.
   * Display a confirmation JSP page
   *
   * @return the name of the JSP page
   * */

  @RequestMapping(value = "/articles/add", method = RequestMethod.POST)
  public String add(@ModelAttribute("articleAttribute") Article article){
    logger.debug("Received request to add new person");
    articleService.add(article);
    return "addedpage";
  }

  /**
   * Deletes an existing person by delegating the processing to ArticleService.
   * Displays a confirmation JSP page
   *
   * @return  the name of the JSP page
   */

  @RequestMapping(value = "/articles/delete", method = RequestMethod.GET)
  public String delete(@RequestParam(value = "id", required = true) Integer id,
                       Model model) {
    logger.debug("Received request to delete existing article");
    articleService.delete(id);
    model.addAttribute("id", id);
    return "deletepage";
  }

  /**
   * Retrieves the edit page
   *
   * @return the name of the JSP page
   */

  @RequestMapping(value = "/articles/edit", method = RequestMethod.GET)
  public String getEdit(@RequestParam(value = "id", required = true) Integer id,
                        Model model) {
    logger.debug("Received request to show edit page");
    model.addAttribute("articleAttribute", articleService.get(id));
    return "editpage";
  }

  /**
   * Edits an existing article by delegating the processing to ArticleService.
   * Displays a confirmation JSP page
   *
   * @return  the name of the JSP page
   */

  @RequestMapping(value = "/articles/edit", method = RequestMethod.POST)
  public String saveEdit(@ModelAttribute("articleAttribute") Article article,
                         @RequestParam(value = "id", required = true) Integer id,
                         Model model) {
    logger.debug("Received request to update article");
    article.setId(id);
    articleService.edit(article);
    model.addAttribute("id", id);
    return "editedpage";
  }
}
