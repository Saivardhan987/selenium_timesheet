package Pages;

import java.io.File;
import java.util.Date;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import Base.Base;

public class storeData extends Base{
	By email=By.xpath("//input[@type='email']");
	By next=By.xpath("//input[@type='submit']");
	By pass=By.name("passwd");
	By acc=By.id("user-name");
	By yes=By.xpath("//input[@value='Yes']");
	By search=By.id("searchbox");
	By icon=By.className("icomoon-search2");
	By timesheet=By.xpath("(//span[text()='Timesheet'])[5]");
	By week1=By.id("CTS_TS_LAND_PER_DESCR30$0");
	By week2=By.id("CTS_TS_LAND_PER_DESCR30$1");
	By week3=By.id("CTS_TS_LAND_PER_DESCR30$2");
	
	public void getData() {
		logger = report.createTest("Obtain the Week details from timesheet.");
		try {
		file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Data.xlsx");
		workbook = new XSSFWorkbook();
		sh = workbook.createSheet("Weeks");
		driver.findElement(search).sendKeys(prop.getProperty("search4"));
		driver.findElement(icon).click();
		wait(20,timesheet);
		String currentHandle= driver.getWindowHandle();
		driver.findElement(timesheet).click();
		reportPass("Timesheet Page is reached sucessfully");
		Set<String> handle1=driver.getWindowHandles();
		for(String actual: handle1) {
			if(!actual.equalsIgnoreCase(currentHandle)) {
				driver.switchTo().window(actual);
			}
		}
		Screenshot("Timesheet");
		Date date = new Date();
		System.out.println("Today's Date is: "+date.toString());
		sh.createRow(1).createCell(1).setCellValue(date.toString());
		String c_week=driver.findElement(week1).getText();
		System.out.println("Current week is from "+ c_week);
		sh.createRow(3).createCell(1).setCellValue(c_week);
		wait(20,week2);
		String l_week=driver.findElement(week2).getText();
		System.out.println("Previous week was from "+ l_week);
		sh.createRow(5).createCell(1).setCellValue(l_week);
		wait(20,week3);
		//System.out.println("hello brother"+sh.getRow(3).getCell(1).getStringCellValue());
		String ll_week=driver.findElement(week3).getText();
		System.out.println("Previous to Previous week was from "+ ll_week);
		sh.createRow(7).createCell(1).setCellValue(ll_week);
		reportPass("The weeks are obtained sucessfully");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}

}
