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
            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']")));

    return isElementPresent(By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']"));

  }

  public void swipeArticlesUp() {
    driver.hideKeyboard();
    swipeUp();
  }


  //methods for SaveFavArticleTest
  public void tapViewListButton() throws InterruptedException {
    tap(By.id("org.wikipedia:id/snackbar_action"));
    pause(2000);
  }

  public void chooseSavedFolder() throws InterruptedException {
    tap(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup"));
    pause(2000);
  }

  public void tapGotItButton() throws InterruptedException {
    tap(By.id("org.wikipedia:id/onboarding_button"));
    pause(2000);
  }

  public void clickFavorButton() throws InterruptedException {
    tap(By.id("org.wikipedia:id/article_menu_bookmark"));
   pause(2000);
  }

  public void chooseFirstAppium() {
   tap(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.view.ViewGroup[1]"));
  }

}
