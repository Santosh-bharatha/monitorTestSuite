import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeDriver {

	public static void main(String[] args) {
		
		System.out.println("Test the browser");
		
		System.setProperty("webdriver.chrome.driver", "C:\\SANTOSH\\PROJECTS\\workspace\\monitor-test-suite\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("open google successfully");
		driver.navigate().to("https://espn.com");
	
	

	}

}
