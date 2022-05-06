package toolsqa;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InputAsTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani\\Music\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demoqa.com/text-box/");
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		// Find elements using tag name
		/*
		 * List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
		 * if(allInputElements.size() != 0) { System.out.println(allInputElements.size()
		 * + " Elements found by TagName as input \n"); for(WebElement inputElement :
		 * allInputElements) {
		 * System.out.println(inputElement.getAttribute("placeholder")); } }
		 */
		/*
		 * WebElement element1 = driver.findElement(By.id("userName"));
		 * element1.sendKeys("mani"); WebElement element =
		 * driver.findElement(By.id("submit")); element.submit();
		 */
		
		

		/*
		 * Select select=new Select(old); //select.selectByIndex(3); // Get all the
		 * options of the dropdown List<WebElement> options = select.getOptions();
		 */
		/*
		 * WebElement multi=driver.findElement(By.xpath("//select[@id='cars']")); Select
		 * s=new Select(multi); s.selectByValue("volvo"); s.selectByValue("saab");
		 * s.selectByValue("opel");
		 */
		//Step#7- Selecting an option by its value
		WebElement old=driver.findElement(By.id("oldSelectMenu"));
		Select select=new Select(old);
        System.out.println("Select the Option by value 6");
        select.selectByValue("6");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
        
        //Get list of web elements
        List<WebElement> lst = select.getOptions();
        //Looping through the options and printing dropdown options
        System.out.println("The dropdown options are:");
        for(WebElement options: lst)
            System.out.println(options.getText());
        
      //Get the list of selected options
        System.out.println("The selected values in the dropdown options are -");
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for(WebElement selectedOption: selectedOptions)
            System.out.println(selectedOption.getText());
		
		
	}

}
