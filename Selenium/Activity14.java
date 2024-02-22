import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity14 {

    public static void main(String[] args) {
        // Set the path to your GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");

        // Initialize the WebDriver for Firefox
        WebDriver driver = new  EdgeDriver();

        // Navigate to the target URL
        driver.get("https://v1.training-support.net/selenium/tables");

        // Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // Using xpaths on the second table
        WebElement secondTable = driver.findElement(By.xpath("(//table)[2]"));

        // Find the number of rows and columns in the table and print them
        int rowCount = secondTable.findElements(By.xpath(".//tbody/tr")).size();
        int colCount = secondTable.findElements(By.xpath(".//thead/tr/th")).size();
        System.out.println("Number of Rows: " + rowCount);
        System.out.println("Number of Columns: " + colCount);

        // Find and print the cell value at the second row second column
        WebElement secondRowSecondCol = secondTable.findElement(By.xpath(".//tbody/tr[2]/td[2]"));
        System.out.println("Cell value at the second row, second column: " + secondRowSecondCol.getText());

        // Click the header of the first column to sort by name
        WebElement firstColumnHeader = secondTable.findElement(By.xpath(".//thead/tr/th[1]"));
        Actions actions = new Actions(driver);
        actions.click(firstColumnHeader).perform();

        // Find and print the cell value at the second row second column again
        secondRowSecondCol = secondTable.findElement(By.xpath(".//tbody/tr[2]/td[2]"));
        System.out.println("Cell value at the second row, second column after sorting: " + secondRowSecondCol.getText());

        // Print the cell values of the table footer
        WebElement tableFooter = secondTable.findElement(By.xpath(".//tfoot"));
        System.out.println("Cell values of the table footer:");
        for (WebElement cell : tableFooter.findElements(By.xpath(".//td"))) {
            System.out.print(cell.getText() + "\t");
        }
        System.out.println(); // New line after printing cell values

        // Close the browser
        driver.quit();
    }
}

