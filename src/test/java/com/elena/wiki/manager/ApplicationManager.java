package com.elena.wiki.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
//  Logger logger = LoggerFactory.getLogger(ApplicationManager.class);
  ArticleHelper article;
  AppiumDriver driver;

  public void init() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "QA22");
    capabilities.setCapability("platformVersion", "8.0");
    capabilities.setCapability("automationName", "Appium");
    capabilities.setCapability("appPackage", "org.wikipedia");
    capabilities.setCapability("appActivity", ".main.MainActivity");
    capabilities.setCapability("app",
            "C:\\Users\\VladQA\\Documents\\GitHub\\Wiki_mob_qa23\\src\\test\\resources\\apk\\org.wikipedia.apk");

    driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    article = new ArticleHelper(driver);

  }

  public ArticleHelper getArticle() {
    return article;
  }

  public void stop() throws InterruptedException {
    Thread.sleep(5000);
    driver.quit();


//    wd.getWindowHandles();
//    wd.getWindowHandle();

  }

  public void skipWelcomePage() {
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='org.wikipedia:id/fragment_onboarding_skip_button']")).click();

  }


//  public void takeScreenshot(){
//    File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//    File screenshot =  new File("src/test/logs/screenshots/screen-"+System.currentTimeMillis()+".png");
//
//    try {
//      Files.copy(tmp, screenshot);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    logger.info("\nCreated screenshot: "+ screenshot.getAbsolutePath());
//  }

}
