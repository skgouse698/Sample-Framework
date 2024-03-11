package com.demo.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseDragAndDropImage {
    
	@Test
	public void test1() {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
        
        WebElement item1=driver.findElement(By.xpath("//li[1]"));
        WebElement item2=driver.findElement(By.xpath("//li[2]"));
        
        WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
        
        Actions act=new Actions(driver);
        
        act.dragAndDrop(item1, trash).perform();
        act.dragAndDrop(item2, trash).perform();

	}

}
