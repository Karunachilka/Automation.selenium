import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

    public static void main(String[] args) {
        // Set the path to your GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");

        // Initialize the WebDriver for Firefox
        WebDriver driver = new EdgeDriver();

        // Navigate to the target URL
        driver.get("https://v1.training-support.net/selenium/tables");

        // Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Using xpaths on the first table
        WebElement firstTable = driver.findElement(By.xpath("(//table)[1]"));

        // Find the number of rows and columns in the table and print them
        int rowCount = firstTable.findElements(By.xpath(".//tbody/tr")).size();
        int colCount = firstTable.findElements(By.xpath(".//thead/tr/th")).size();
        System.out.println("Number of Rows: " + rowCount);
        System.out.println("Number of Columns: " + colCount);

        // Find and print all the cell values in the third row of the table
        WebElement thirdRow = firstTable.findElement(By.xpath(".//tbody/tr[3]"));
        System.out.println("Cell values in the third row:");
        for (WebElement cell : thirdRow.findElements(By.xpath(".//td"))) {
            System.out.print(cell.getText() + "\t");
        }
        System.out.println(); // New line after printing cell values

        // Find and print the cell value at the second row second column
        WebElement secondRowSecondCol = firstTable.findElement(By.xpath(".//tbody/tr[2]/td[2]"));
        System.out.println("Cell value at the second row, second column: " + secondRowSecondCol.getText());

        // Close the browser
        driver.quit();
    }
}
