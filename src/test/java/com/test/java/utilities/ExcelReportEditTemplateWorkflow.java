package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ExcelReportEditTemplateWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void excelReportEditTemplateWorkflow(WebDriver driver) throws Exception {
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

//generate new report
			WebElement generateNewReport = driver
					.findElement(By.xpath("//span[contains(text(),'Generate New Report')]"));
			js.executeScript("arguments[0].click()", generateNewReport);
			Thread.sleep(3000);

//section names
			WebElement sectionName = driver.findElement(By.xpath("//a[contains(text(),'Ticket')]"));
			js.executeScript("arguments[0].click()", sectionName);
			Thread.sleep(3000);

//edit template
			WebElement editTemplate = driver.findElement(By
					.xpath("(//h3[contains(text(),'temp27')]//preceding::mat-icon[contains(text(),'more_vert')])[7]"));
			js.executeScript("arguments[0].scrollIntoView()", editTemplate);
			js.executeScript("arguments[0].click()", editTemplate);
			Thread.sleep(3000);
			WebElement editButton = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
			js.executeScript("arguments[0].click()", editButton);
			Thread.sleep(3000);

//search the brand
			WebElement search = driver.findElement(By.xpath("//input[@data-placeholder='Search Brands']"));
			search.sendKeys("alerttesting");
			WebElement searchButon = driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			js.executeScript("arguments[0].click()", searchButon);
			Thread.sleep(3000);

			WebElement selectBrand = driver.findElement(By.xpath("//span[@class='brandselect__image--circle']"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

			WebElement brandSelected = driver.findElement(By.xpath("//span[contains(@class,'font-weight-600 ml-10')]"));
			if (brandSelected.isDisplayed()) {
				System.out.println("Selected brand is displayed");
			} else {
				System.out.println("Selected brand is not displayed");
			}

			WebElement nextButton = driver.findElement(By.xpath("(//span[contains(text(),'Next')])[1]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(5000);

//Add Columns
			WebElement addColumn1 = driver.findElement(
					By.xpath("//span[@class='mat-tooltip-trigger list__label text-overflow' and text()='EmailID']"));
			js.executeScript("arguments[0].click()", addColumn1);
			Thread.sleep(2000);
			WebElement addColumn2 = driver.findElement(By
					.xpath("//span[@class='mat-tooltip-trigger list__label text-overflow' and text()='PhoneNumber']"));
			js.executeScript("arguments[0].click()", addColumn2);
			Thread.sleep(2000);

//add custom name
			WebElement addCustom = driver.findElement(By.xpath("//div[contains(text(),' add custom column ')]"));
			js.executeScript("arguments[0].click()", addCustom);
			Thread.sleep(2000);
			WebElement columnName = driver
					.findElement(By.xpath("(//span[contains(text(),'Cancel')])[2]//preceding::input[@maxlength='30']"));
			columnName.sendKeys("Information3");
			WebElement addcolumn = driver.findElement(By.xpath("//span[contains(text(),'Add Column')]"));
			js.executeScript("arguments[0].click()", addcolumn);
			Thread.sleep(2000);

// add parameter
			WebElement arrowButton1 = driver.findElement(By.xpath(
					"//h3[contains(text(),'Create formula')]//following::div[contains(@class,'mat-select-value')]"));
			js.executeScript("arguments[0].click()", arrowButton1);
			Thread.sleep(2000);
			WebElement selectParameter1 = driver
					.findElement(By.xpath("//span[@class='mat-option-text' and text()='RATING ']"));
			js.executeScript("arguments[0].click()", selectParameter1);
			Thread.sleep(2000);
			WebElement symbolButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'loupe')]"));
			js.executeScript("arguments[0].click()", symbolButton1);
			Thread.sleep(2000);
			WebElement addNumeric1 = driver.findElement(By.xpath("//button[contains(text(),'Numeric Textbox')]"));
			js.executeScript("arguments[0].click()", addNumeric1);
			Thread.sleep(2000);
			WebElement addNumber1 = driver.findElement(By.xpath("//input[@type='number']"));
			addNumber1.sendKeys("10");
			WebElement saveButton1 = driver.findElement(By.xpath("(//span[contains(text(),'Save')])[2]"));
			js.executeScript("arguments[0].click()", saveButton1);
			Thread.sleep(2000);
			
//search
			WebElement search1=driver.findElement(By.xpath("//input[contains(@class,'mat-input-element mat-form-field-autofill-control material-icons-outlined')]"));
			search1.sendKeys("Information3");
			WebElement searchButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[3]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(2000);
			
//download report
			WebElement downloadReport=driver.findElement(By.xpath("//span[contains(text(),' Download in Excel ')]"));
			js.executeScript("arguments[0].click()", downloadReport);
			Thread.sleep(2000);
			
//save template
			WebElement saveTemplate = driver.findElement(By.xpath("//span[contains(text(),'Save Template')]"));
			js.executeScript("arguments[0].click()", saveTemplate);
			Thread.sleep(2000);
			WebElement saveAs=driver.findElement(By.xpath("//button[contains(text(),'Save as')]"));
			js.executeScript("arguments[0].click()", saveAs);
			Thread.sleep(2000);
			
//template name
			WebElement templateName = driver.findElement(By.xpath("//input[@type='string']"));
			templateName.sendKeys("temp527");
			WebElement saveButton2 = driver.findElement(By.xpath("(//span[contains(text(),' Save ')])[2]"));
			js.executeScript("arguments[0].click()", saveButton2);
			Thread.sleep(3000);
			
//search template name
			WebElement search2=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", search2);
			Thread.sleep(3000);
			WebElement search3=driver.findElement(By.xpath("//input[@placeholder='Search Templates by name']"));
			search3.sendKeys("temp527");
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			
//delete template
			WebElement actionButton=driver.findElement(By.xpath("(//h3[contains(text(),'temp527')]//preceding::mat-icon[contains(text(),'more_vert')])[7]"));
			js.executeScript("arguments[0].click()", actionButton);
			Thread.sleep(3000);
			WebElement deleteButton=driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
			js.executeScript("arguments[0].click()", deleteButton);
			Thread.sleep(3000);
			WebElement confirmDelete=driver.findElement(By.xpath("//span[contains(text(),' Yes ')]"));
			js.executeScript("arguments[0].click()", confirmDelete);
			Thread.sleep(3000);
			WebElement arrowBack=driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowBack);
			Thread.sleep(3000);
			
//logout
			WebElement expand = driver.findElement(By.xpath("(//mat-icon[contains(text(),'expand_less')])[1]"));
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

}
