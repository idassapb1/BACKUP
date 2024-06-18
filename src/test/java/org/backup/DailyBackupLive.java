package org.backup;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DailyBackupLive {
	static WebDriver driver;

	public static void launch(String url) {
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().window().maximize();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void webEntry() {
		WebElement loginId;
		try {
			//loginId = driver.findElement(By.xpath("//input[@type='email']"));
			//loginId.click();
			//loginId.sendKeys("admin");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_WINDOWS);
			r.keyPress(KeyEvent.VK_R);
			r.keyRelease(KeyEvent.VK_WINDOWS);
			r.keyRelease(KeyEvent.VK_R);
			Runtime.getRuntime().exec("E:\\VIVEK-IT\\Auto IT\\FromLiveBackupFile.exe");
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_WINDOWS);
			r.keyPress(KeyEvent.VK_R);
			r.keyRelease(KeyEvent.VK_WINDOWS);
			r.keyRelease(KeyEvent.VK_R);
			Runtime.getRuntime().exec("E:\\VIVEK-IT\\Auto IT\\ToLiveBackupFile.exe");
			//r.delay(150);
			//r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			//r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}

	public static void main(String[] args) {
		//launch("https://onedrive.live.com/login/");
		webEntry();
	}

}
