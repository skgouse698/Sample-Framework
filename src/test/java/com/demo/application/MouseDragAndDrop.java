package com.demo.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseDragAndDrop {
     
	@Test
	public void test() {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        
        WebElement rome=driver.findElement(By.id("box6"));
        WebElement italy=driver.findElement(By.id("box106"));
        
        Actions act=new Actions(driver);
        act.dragAndDrop(rome, italy).perform();

	}

}
