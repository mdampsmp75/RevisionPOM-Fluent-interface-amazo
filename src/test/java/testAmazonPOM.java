import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testAmazonPOM {

    WebDriver driver;

    @BeforeMethod
    public void openChrome(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.fr/");

        By cookisSelecto = By.cssSelector("#sp-cc-accept");
        driver.findElement(cookisSelecto).click();

    }

    @AfterMethod
    public void closeChrome(){
       // driver.quit();
    }

   @Test
    public void testAmazon(){
       String expectedResult = "Samsung";

        HomePage hm = new HomePage(driver);
        String a = hm
                  .putSearchOnTextBox()
                  .buttonValidationSearch()
                  .choseFirstArticleOnPage()
                  .titleVerification();
       Assert.assertTrue(a.contains(expectedResult),"Le resultat ne math pas");
    }
}
