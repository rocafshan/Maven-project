package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	WebElement radiobtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
    radiobtn.click();
    boolean selected =  radiobtn.isSelected();
    System.out.println(selected);
    if(selected) {
    	System.out.println("Radio button is selected");
    }else
    {
    	System.out.println("Radio button is not selected");
    }
	}

}
