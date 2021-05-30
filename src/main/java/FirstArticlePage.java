import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FirstArticlePage {

    WebDriver driver;

    public FirstArticlePage(WebDriver driver){
        this.driver = driver;
    }

    public String titleVerification(){

        By titleArticlSelector = By.cssSelector("#productTitle");
        String resultFound = driver.findElement(titleArticlSelector).getText();
        return resultFound;
    }

}
