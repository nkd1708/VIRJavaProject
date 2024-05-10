package test;



import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;



public class NmdLogin {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		//driver.get("https://bsci--stage.sandbox.lightning.force.com/lightning/setup/SetupOneHome/home");

		//driver.findElement(By.xpath("//input[@class='filter-box input']")).sendKeys("profile");





	}



}

