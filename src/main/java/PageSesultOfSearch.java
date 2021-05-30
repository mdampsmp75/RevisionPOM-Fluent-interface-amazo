import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageSesultOfSearch {

    WebDriver driver;

    public PageSesultOfSearch(WebDriver driver){
        this.driver = driver;
    }

    public FirstArticlePage choseFirstArticleOnPage(){
        By firstArticlSelector = By.cssSelector(".s-image");
        List<WebElement> list = driver.findElements(firstArticlSelector);
        list.get(0).click();

        return new FirstArticlePage(driver);
    }

}
