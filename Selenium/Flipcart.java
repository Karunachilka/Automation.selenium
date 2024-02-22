import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.List;

public class Flipcart {
    public static void main(String[] args) {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.setHeadless(true);

        WebDriverManager.edgedriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.flipkart.com/search?q=iphone%2015&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");


        List<WebElement> priceList = driver.findElements(By.className("_4rR01T"));

        WebElement thirdPrice = priceList.get(2);
        System.out.println("Label " + thirdPrice.getText());

        WebElement price = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]"));

//        WebElement Price3 = price.get(2);
        System.out.println("Third Price: " + price.getText());

        driver.quit();
    }
}
