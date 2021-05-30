import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage putSearchOnTextBox(){
        By serchBoxSelector = By.cssSelector("#twotabsearchtextbox");
        driver.findElement(serchBoxSelector).sendKeys("televiseur samsung");
        return this;
    }

    public PageSesultOfSearch buttonValidationSearch(){
        By buttonValidationSelector = By.cssSelector("#nav-search-submit-button");
        driver.findElement(buttonValidationSelector).click();
        return new PageSesultOfSearch(driver);

    }
}
