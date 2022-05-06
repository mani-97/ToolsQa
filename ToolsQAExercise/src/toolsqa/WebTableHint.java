package toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani\\Music\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		//example 1:
		WebElement table=driver.findElement(By.xpath
				("/html/body/div[1]/div[2]/div/div[2]/article/div/table/tbody/tr[2]/td[1]"));
		String text=table.getText();

		//example 2:
		String sRow = "2";
		String sCol = "1";
		driver.findElement(By.xpath
				("/html/body/div[1]/div[2]/div/div[2]/article/div/table/tbody/tr["+sRow+"]/td["+sCol+"]")).getText();

		//example3:
		String sColValue = "Licensing";
		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=3;i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath(".//*[@id='post-2924']/div/table/tbody/tr[1]/th["+i+"]")).getText();
			if(sValue.equalsIgnoreCase(sColValue)){
				// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
				for (int j=1;j<=2;j++){
					String sRowValue= driver.findElement(By.xpath(".//*[@id='post-2924']/div/table/tbody/tr["+j+"]/td["+i+"]")).getText();
					System.out.println(sRowValue);
				}
				break;
			}
		}





	}

}
