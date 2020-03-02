package com.elena.wiki.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticleHelper extends  HelperBase{

  public ArticleHelper(AppiumDriver driver) {
    super(driver);
  }

  public void initSearchArticle() {
    tap(By.id("search_container"));
  }

  public void typeRequest(String text) {
    type(By.id("search_src_text"), text);
  }

  public void getList() {
  }

  public boolean isThereResult(int timeout) {
    new WebDriverWait(driver, timeout).until(
            ExpectedConditions.presenceOfElementLocated(By.id("page_list_item_container")));

    return isElementPresent(By.id("page_list_item_container"));
  }

  public void swipeArticlesUp() {
    driver.hideKeyboard();
    swipeUp();
  }


}
