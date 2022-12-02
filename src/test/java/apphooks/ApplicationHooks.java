 package apphooks;

 import com.driver.WebdriverInitializer;
 import com.utils.ConfigReader;
 import io.cucumber.java.After;
 import io.cucumber.java.Before;
 import io.cucumber.java.Scenario;
 import org.openqa.selenium.OutputType;
 import org.openqa.selenium.TakesScreenshot;
 import org.openqa.selenium.WebDriver;

 import java.time.Duration;
 import java.util.Properties;

 public class ApplicationHooks {

     private WebdriverInitializer driverFactory;
     private WebDriver driver;
     private ConfigReader configReader;
     Properties prop;

     @Before(order = 0)
     public void getProperty() {
         configReader = new ConfigReader();
         prop = configReader.init_prop();
     }

     @Before(order = 1)
     public void launchBrowser() {
         String browserName = prop.getProperty("browser");
         driverFactory = new WebdriverInitializer();
         driver = driverFactory.init_driver(browserName);
         driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
         driver.get("http://stanley-hattrick.vassarlabs.com/");

     }


     @After(order = 0)
     public void quitBrowser() throws InterruptedException {
         driver.quit();
     }

     @After(order = 1)
     public void tearDown(Scenario scenario) {
         if (scenario.isFailed()) {
             // take screenshot:
             String screenshotName = scenario.getName().replaceAll(" ", "_");
             byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.attach(sourcePath, "image/png", screenshotName);

         }
     }

 }

