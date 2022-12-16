package Pages;

import org.openqa.selenium.By;

import Base.Base;

public class Login extends Base{
	By email=By.xpath("//input[@type='email']");
	By next=By.xpath("//input[@type='submit']");
	By pass=By.name("passwd");
	By acc=By.id("user-name");
	By call=By.xpath("//*[@id='idDiv_SAOTCS_Proofs']/div[2]");
	By yes=By.xpath("//input[@value='Yes']");
	By search=By.id("searchbox");
	By icon=By.className("icomoon-search2");
	By timesheet=By.xpath("(//span[text()='Timesheet'])[3]");
	By week1=By.id("CTS_TS_LAND_PER_DESCR30$0");
	By week2=By.id("CTS_TS_LAND_PER_DESCR30$1");
	By week3=By.id("CTS_TS_LAND_PER_DESCR30$2");
	
	public void login() {
		
		logger = report.createTest("Login into Becognizant.");
		try {
		wait(20,email);
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(next).click();
		wait(20,pass);
		driver.findElement(pass).sendKeys(prop.getProperty("password"));
		driver.findElement(next).click();
		Thread.sleep(1000);
		driver.findElement(call).click();
		reportPass("Email and Password Verified sucessfully");
		wait(120,yes);
		driver.findElement(yes).click();
		//Verify Title
		if (driver.getTitle().contains("Be.Cognizant"))
			// Pass
			System.out.println("Page title contains Be.Cognizant");
		else
			// Fail
			System.out.println("Page title doesn't contains Be.Cognizant");
		String name=driver.findElement(acc).getText();
		System.out.println("The name for the Account is: "+name);
		Screenshot("Account");
		reportPass("Be.Cognizant Page is reached sucessfully");
		
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}
	
	
	
}
