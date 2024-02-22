import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10 {

    public static void main(String[] args) {
        // Set the path to your GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");

        // Initialize the WebDriver for Firefox
        WebDriver driver = new EdgeDriver();

        // Navigate to the target URL
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        // Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Find the text field
        WebElement textField = driver.findElement(By.cssSelector("input[type='text']"));

        // Check if the text field is enabled and print it
        boolean isTextFieldEnabled = textField.isEnabled();
        System.out.println("Is Text Field Enabled Initially: " + isTextFieldEnabled);

        // Click the "Enable Input" button to enable the input field
        WebElement enableButton = driver.findElement(By.id("enable-textbox"));
        enableButton.click();

        // Check if the text field is enabled again and print it
        isTextFieldEnabled = textField.isEnabled();
        System.out.println("Is Text Field Enabled After Clicking 'Enable Input' Button: " + isTextFieldEnabled);

        // Close the browser
        driver.quit();
    }
}
