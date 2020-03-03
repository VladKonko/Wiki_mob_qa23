package com.elena.wiki.tests;

import com.elena.wiki.manager.HelperBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchArticleTest extends  TestBase {


  public SearchArticleTest() throws InterruptedException {
  }

  @Test
  public void testSearchArticle() throws InterruptedException {
    app.skipWelcomePage();
    Thread.sleep(2000);
    app.getArticle().initSearchArticle();
    app.getArticle().typeRequest("Appium");

    Assert.assertTrue(app.getArticle().isThereResult(20));

    app.getArticle().swipeArticlesUp();

   // app.getArticle().getList();


  }
}
