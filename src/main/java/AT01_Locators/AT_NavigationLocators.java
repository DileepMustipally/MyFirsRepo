package AT01_Locators;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

impgort java.io.File;
import java.io.IOException;

public class AT_NavigationLocators {
    @Test
    public void navigationGG() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/login.php");
        File screenshotFile= (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Dileep Reddy\\Desktop\\dileep 10th to masters memos\\screenshot.png"));


        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Software Koti");
         driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("SoftwareTest");
         driver.findElement(By.xpath("//*[@name='login']")).click();




    }
}
