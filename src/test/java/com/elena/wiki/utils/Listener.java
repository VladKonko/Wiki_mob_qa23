package com.elena.wiki.utils;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.testng.ITestListener;
        import org.testng.ITestResult;

        import static com.elena.wiki.tests.TestBase.app;


public class Listener implements ITestListener {
  Logger logger = LoggerFactory.getLogger(Listener.class);

  @Override
  public void onTestSuccess(ITestResult result) {
    logger.info(result.getName() + " PASSED");
  }

  @Override
  public void onTestFailure(ITestResult result) {
    logger.error(result.getName() + "\n !!! FAILED !!!\n"
            + result.getThrowable().toString());


  }

  @Override
  public void onTestFailedWithTimeout(ITestResult result) {
    logger.error(result.getName() + "\nFAILED by Timeout");

  }
}
