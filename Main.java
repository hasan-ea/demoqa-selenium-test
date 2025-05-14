import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();    // WebDriver kurulumu ve tarayıcı açılışı
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        WebElement element = driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']"));    // Elements bölümüne tıklama
        element.click();

        js.executeScript("window.scrollBy(0,60)");

        WebElement webtables = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']")) ;      // Web Tables'a tıklama
        webtables.click();

        WebElement addbutton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']")) ;     // Yeni kayıt ekleme
        addbutton.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.click();
        firstName.sendKeys("Hasan");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.click();
        lastName.sendKeys("Emre");

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.click();
        email.sendKeys("hasan@gmail.com");

        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.click();
        age.sendKeys("27");

        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.click();
        salary.sendKeys("500");

        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.click();
        department.sendKeys("QA tester");

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));     // Formu gönderme
        submit.click();

        driver.quit();            // Tarayıcıyı kapatma


    }
}
