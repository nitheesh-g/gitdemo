package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExcelReportEditReportWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void excelReportEditReportWorkflow(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

//Excel report
			WebElement excelReportLogo = driver.findElement(By.xpath("//mat-icon[contains(text(),'table_chart')]"));
			js.executeScript("arguments[0].scrollIntoView()", excelReportLogo);
			WebElement excelReport = driver.findElement(By.xpath("//span[contains(text(),' Export Data')]"));
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[11]"));
			if (excelReportLogo.isDisplayed() && excelReport.isDisplayed() && pushpin.isDisplayed()) {
				System.out.println("Excel report logo and label are displayed");
			} else {
				System.out.println("Excel report logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", excelReport);
			Thread.sleep(3000);

//excel report tab
			WebElement excelReportTabLogo = driver
					.findElement(By.xpath("//img[@src='assets/images/common/Excel_Report.svg']"));
			WebElement excelReportTab = driver.findElement(By.xpath("//span[contains(text(),'Excel Report')]"));
			if (excelReportTabLogo.isDisplayed() && excelReportTab.isDisplayed()) {
				System.out.println("Excel report tab is displayed");
			} else {
				System.out.println("Excel report tab is not displayed");
			}
			js.executeScript("arguments[0].click()", excelReportTab);
			Thread.sleep(3000);

//search
			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search2.sendKeys("ticket");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);

//actions
			WebElement actions = driver.findElement(By.xpath("//mat-icon[contains(text(),'more_vert ')]"));
			js.executeScript("arguments[0].click()", actions);
			Thread.sleep(3000);

//Edit report
			WebElement editReport = driver.findElement(By.xpath("//div[contains(text(),' Edit Report ')]"));
			js.executeScript("arguments[0].click()", editReport);
			Thread.sleep(3000);

			WebElement nextButton = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);

			editProcess(driver);
			
			WebElement nextButton1=driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);

			scheduleReportProcess(driver);
			
//search
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search1.sendKeys("templates13");
			WebElement searchButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);
			
//actions
			WebElement action = driver.findElement(By.xpath("//mat-icon[contains(text(),'more_vert ')]"));
			js.executeScript("arguments[0].click()", action);
			Thread.sleep(3000);
			WebElement deleteReport=driver.findElement(By.xpath("//div[contains(text(),' Delete Report ')]"));
			js.executeScript("arguments[0].click()", deleteReport);
			Thread.sleep(3000);
			WebElement confirmDelete=driver.findElement(By.xpath("//span[contains(text(),' Delete ')]"));
			js.executeScript("arguments[0].click()", confirmDelete);
			Thread.sleep(3000);
			
//search
			WebElement search3 = driver.findElement(By.xpath("//input[@placeholder='Search Report']"));
			search3.clear();
			WebElement searchButton2 = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton2);
			Thread.sleep(3000);
			
//logout
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
			// JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", expand);

			WebElement logout = driver.findElement(By.xpath("//button[contains(text(),'Logout')]"));
			js.executeScript("arguments[0].click()", logout);
			Thread.sleep(4000);

			WebElement confirmLogout = driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
			if (confirmLogout.isDisplayed()) {
				js.executeScript("arguments[0].click()", confirmLogout);
				System.out.println("Logout Successful");
			} else {
				System.out.println("Logout Not Successful");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void editProcess(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

//edit process
			WebElement editButton = driver.findElement(By.xpath("//a[contains(text(),' Edit ')]"));
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);

//add  custom column
			WebElement addCustomColumn = driver.findElement(By.xpath("//div[contains(text(),' add custom column ')]"));
			js.executeScript("arguments[0].click()", addCustomColumn);
			Thread.sleep(3000);
			WebElement columnName = driver
					.findElement(By.xpath("(//span[contains(text(),'Cancel')])[2]//preceding::input[@maxlength='30']"));
			columnName.sendKeys("Whatsup Number");
			WebElement addcolumn = driver.findElement(By.xpath("//span[contains(text(),'Add Column')]"));
			js.executeScript("arguments[0].click()", addcolumn);
			Thread.sleep(2000);

//add parameter
			WebElement arrowButton1 = driver.findElement(By.xpath(
					"//h3[contains(text(),'Create formula')]//following::div[contains(@class,'mat-select-value')]"));
			js.executeScript("arguments[0].click()", arrowButton1);
			Thread.sleep(2000);
			WebElement selectParameter1 = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()='Rating ']"));
			js.executeScript("arguments[0].click()", selectParameter1);
			Thread.sleep(2000);
			WebElement symbolButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'loupe')]"));
			js.executeScript("arguments[0].click()", symbolButton1);
			Thread.sleep(2000);
			WebElement addNumeric1 = driver.findElement(By.xpath("//button[contains(text(),'Numeric Textbox')]"));
			js.executeScript("arguments[0].click()", addNumeric1);
			Thread.sleep(2000);
			WebElement arrow=driver.findElement(By.xpath("(//h3[contains(text(),'Create formula')]//following::div[contains(@class,'mat-select-value')])[2]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(2000);
			WebElement selectSymbols=driver.findElement(By.xpath("//span[@class='mat-option-text'  and text()='- ']"));
			js.executeScript("arguments[0].click()", selectSymbols);
			Thread.sleep(2000);
			WebElement addNumber1 = driver.findElement(By.xpath("//input[@type='number']"));
			addNumber1.sendKeys("5");
			WebElement addButton=driver.findElement(By.xpath("//h3[contains(text(),'Create formula')]//following::mat-icon[contains(text(),'add')]"));
			js.executeScript("arguments[0].click()", addButton);
			Thread.sleep(2000);
			WebElement addNumeric2 = driver.findElement(By.xpath("//button[contains(text(),'Numeric Textbox')]"));
			js.executeScript("arguments[0].click()", addNumeric2);
			Thread.sleep(2000);
			WebElement arrow1=driver.findElement(By.xpath("(//h3[contains(text(),'Create formula')]//following::div[contains(@class,'mat-select-value')])[3]"));
			js.executeScript("arguments[0].click()", arrow1);
			Thread.sleep(2000);
			WebElement selectSymbol1=driver.findElement(By.xpath("//span[@class='mat-option-text'  and text()='x ']"));
			js.executeScript("arguments[0].click()", selectSymbol1);
			Thread.sleep(2000);
			WebElement addNumber2 = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
			addNumber2.sendKeys("6");
			WebElement saveButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Save')])"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(2000);
			
//search
			WebElement search1=driver.findElement(By.xpath("//input[contains(@class,'mat-input-element mat-form-field-autofill-control material-icons-outlined')]"));
			search1.sendKeys("Whatsup Number");
			WebElement searchButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(2000);
			
//add sub columns
	/*		WebElement column = driver.findElement(By.xpath("(//span[contains(text(),'Whatsup Number')])[1]"));
			Actions action = new Actions(driver);
			action.moveToElement(column).perform();
			WebElement addButton1 = driver.findElement(By.xpath(
					"((//span[contains(text(),'Whatsup Number')])[1]//following::mat-icon[contains(text(),'add')])[1]"));
			action.moveToElement(addButton1);
			action.click().build().perform();

			WebElement addColumn = driver
					.findElement(By.xpath("(//span[contains(text(),'Cancel')])[2]//preceding::input[@maxlength='30']"));
			addColumn.sendKeys("category1");
			WebElement addSubColumn = driver.findElement(By.xpath("//span[contains(text(),'Add  Subcolumn')]"));
			js.executeScript("arguments[0].click()", addSubColumn);
			Thread.sleep(2000);
			
//add parameter
			WebElement arrowButton = driver.findElement(By.xpath(
					"//h3[contains(text(),'Create formula')]//following::div[contains(@class,'mat-select-value')]"));
			js.executeScript("arguments[0].click()", arrowButton);
			Thread.sleep(2000);
			WebElement selectParameter = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()='Followers ']"));
			js.executeScript("arguments[0].click()", selectParameter);
			Thread.sleep(2000);
			WebElement symbolButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'loupe')]"));
			js.executeScript("arguments[0].click()", symbolButton);
			Thread.sleep(2000);
			WebElement addNumeric = driver.findElement(By.xpath("//button[contains(text(),'Numeric Textbox')]"));
			js.executeScript("arguments[0].click()", addNumeric);
			Thread.sleep(2000);
			WebElement addNumber = driver.findElement(By.xpath("//input[@type='number']"));
			addNumber.sendKeys("10");
			WebElement saveButton = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			js.executeScript("arguments[0].click()", saveButton);
			Thread.sleep(2000);*/
			
//download report
			WebElement downloadReport=driver.findElement(By.xpath("//span[contains(text(),' Download in Excel ')]"));
			js.executeScript("arguments[0].click()", downloadReport);
			Thread.sleep(2000);
			
//save changes
			WebElement saveButton2 = driver.findElement(By.xpath("//span[contains(text(),' Save & continue ')]"));
			js.executeScript("arguments[0].click()", saveButton2);
			Thread.sleep(3000);
			WebElement confirmSave = driver.findElement(By.xpath("//button[contains(text(),'Save & continue')]"));
			js.executeScript("arguments[0].click()", confirmSave);
			Thread.sleep(3000);
			
//template name
			WebElement templateName = driver.findElement(By.xpath("//input[@type='string']"));
			templateName.clear();
			Thread.sleep(1000);
			templateName.sendKeys("templates13");
			WebElement save = driver.findElement(By.xpath("(//span[contains(text(),' Save ')])[2]"));
			js.executeScript("arguments[0].click()", save);
			Thread.sleep(3000);

			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void scheduleReportProcess(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement frequencyarrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[1]"));
			js.executeScript("arguments[0].click()", frequencyarrow);
			Thread.sleep(3000);
			WebElement selectOption=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()=' Daily']"));
			js.executeScript("arguments[0].click()", selectOption);
			Thread.sleep(3000);
			WebElement duration=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", duration);
			Thread.sleep(3000);
			WebElement selectDuration=driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Yesterday']"));
			js.executeScript("arguments[0].click()", selectDuration);
			Thread.sleep(3000);
			WebElement timeDate=driver.findElement(By.xpath("//input[@formcontrolname='scheduleDateTimeControl']"));
			js.executeScript("arguments[0].click()", timeDate);
			Thread.sleep(3000);
			WebElement date=driver.findElement(By.xpath("((//div[@class='calendar-table'])[1]//span[contains(text(),'3')])[2]"));
			js.executeScript("arguments[0].click()", date);
			Thread.sleep(3000);
			WebElement hoursTab=driver.findElement(By.xpath(("(//select[contains(@class,'hourselect select-item')])[1]")));
			hoursTab.click();
			Thread.sleep(2000);
			WebElement selectHours=driver.findElement(By.xpath("(//select[contains(@class,'hourselect select-item')])[1]//option[1]"));
			selectHours.click();
			Thread.sleep(2000);
			WebElement minutesTab=driver.findElement(By.xpath("(//select[contains(@class,'select-item minuteselect')])[1]"));
			minutesTab.click();
			Thread.sleep(2000);
			WebElement selectMinutes=driver.findElement(By.xpath("(//select[contains(@class,'select-item minuteselect')])[1]//option[11]"));
			selectMinutes.click();
			Thread.sleep(2000);
			WebElement ampm=driver.findElement(By.xpath("(//select[contains(@class,'select-item ampmselect')])[1]"));
			ampm.click();
			Thread.sleep(2000);
			WebElement selectAmPm=driver.findElement(By.xpath("(//select[contains(@class,'select-item ampmselect')])[1]//option[1]"));
			selectAmPm.click();
			Thread.sleep(3000);
			WebElement applyButton=driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);
			WebElement timezoneArrow=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", timezoneArrow);
			Thread.sleep(3000);
			WebElement searchCountry=driver.findElement(By.xpath("//input[@placeholder='Search Country']"));
			searchCountry.sendKeys("calcutta");
			WebElement selectCountry=driver.findElement(By.xpath("//span[contains(text(),'(GMT+05:30:00) Asia/Calcutta')]"));
			js.executeScript("arguments[0].click()", selectCountry);
			Thread.sleep(3000);
			
			WebElement nextButton = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);
			
			WebElement nextButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton1);
			Thread.sleep(3000);
			
			WebElement scheduleButton=driver.findElement(By.xpath("//span[contains(text(),'Schedule Report')]"));
			js.executeScript("arguments[0].click()", scheduleButton);
			Thread.sleep(3000);
			


			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

}
