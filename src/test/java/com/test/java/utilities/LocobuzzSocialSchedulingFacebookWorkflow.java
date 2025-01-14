package com.test.java.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocobuzzSocialSchedulingFacebookWorkflow {

	public static List<String> componentsInformation = new ArrayList<String>();

	public static void socialSchedulingFacebookWorkflow(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement sideBar = driver.findElement(By.xpath("//div[contains(@class,'logo__icon')]"));
			Actions builder = new Actions(driver);
			Action mouseOverHome = builder.moveToElement(sideBar).build();
			mouseOverHome.perform();
			Thread.sleep(2000);

//social Scheduling 
			WebElement socialSchedulingLogo = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'schedule_send')]"));
			js.executeScript("arguments[0].scrollIntoView()", socialSchedulingLogo);
			WebElement socialSchedulingLabel = driver
					.findElement(By.xpath("//span[contains(text(),' Social Scheduling')]"));
			WebElement pushpin = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[12]"));
			if (socialSchedulingLogo.isDisplayed() && socialSchedulingLabel.isDisplayed() && pushpin.isDisplayed()) {
				System.out.println("Social Scheduling logo and label are displayed");
			} else {
				System.out.println("Social Scheduling logo and label are not displayed");
			}
			js.executeScript("arguments[0].click()", socialSchedulingLabel);
			Thread.sleep(3000);

//manage post tab
			WebElement pushpin1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),'push_pin')])[14]"));
			WebElement managePostTab = driver.findElement(By.xpath("(//span[contains(text(),'Manage Post')])[1]"));
			if (pushpin1.isDisplayed() && managePostTab.isDisplayed()) {
				System.out.println("Manage Post tab is displayed");
			} else {
				System.out.println("Manage Post tab is not displayed");
			}

//select brand
			WebElement arrow3 = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow3);
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			search.sendKeys("auto demo");
			WebElement selectBrand = driver.findElement(By.xpath("//span[contains(text(),' Auto Demo ')]"));
			js.executeScript("arguments[0].click()", selectBrand);
			Thread.sleep(3000);

//compose post button
			WebElement composePostButton = driver.findElement(By.xpath("//span[contains(text(),' Compose Post ')]"));
			WebElement composePostLogo = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'drive_file_rename_outline')]"));
			if (composePostButton.isDisplayed() && composePostLogo.isDisplayed()) {
				System.out.println("Compose post button is displayed");
			} else {
				System.out.println("Compose post button is not displayed");
			}
			js.executeScript("arguments[0].click()", composePostButton);
			Thread.sleep(3000);

//select profile
			WebElement selectProfile = driver.findElement(By.xpath("(//span[contains(text(),'Kalyan page')])"));
			js.executeScript("arguments[0].click()", selectProfile);
			Thread.sleep(3000);

//verify the social card details
			WebElement channelName = driver
					.findElement(By.xpath("//div[@class='mat-tab-label-content' and text()=' Facebook(1) ']"));
			WebElement socialCard = driver.findElement(By.xpath("//div[@class='social-cards__body bg__white']"));
			WebElement likelogo = driver.findElement(By.xpath("//img[@src='assets/images/common/yt-like.svg']"));
			WebElement likeLabel = driver.findElement(By.xpath("//div[contains(text(),' Like ')]"));
			WebElement commentLogo = driver.findElement(By.xpath("//img[@src='assets/images/common/comment.svg']"));
			WebElement commentLabel = driver.findElement(By.xpath("//div[contains(text(),' Comment ')]"));
			WebElement shareLogo = driver.findElement(By.xpath("//img[@src='assets/images/common/yt-share.svg']"));
			WebElement shareLabel = driver.findElement(By.xpath("//div[contains(text(),' Share ')]"));
			if (channelName.isDisplayed() && socialCard.isDisplayed() && likelogo.isDisplayed()
					&& likeLabel.isDisplayed() && commentLogo.isDisplayed() && commentLabel.isDisplayed()
					&& shareLogo.isDisplayed() && shareLabel.isDisplayed()) {
				System.out.println("channel name,social card,like,comment,share are displayed");
			} else {
				System.out.println("channel name,social card,like,comment,share are not displayed");
			}

			WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", nextButton);
			Thread.sleep(3000);

//description
			WebElement textarea = driver.findElement(By.xpath("//textarea[@formcontrolname='description']"));
			textarea.sendKeys("Apollo 4, also known as SA-501, was the first, uncrewed, flight in the United States Apollo program, and the first test of the Saturn V launch vehicle, the rocket that would be used to send astronauts to the Moon. The space vehicle was the first to be launched from Kennedy Space Center in Florida, lifting off from Launch Complex 39A, where facilities designed specially for the Saturn V had been constructed, on November 9, 1967 – depicted in this photograph. The original launch date was planned for late 1966, but was delayed due to a myriad of problems with various elements of the spacecraft, and difficulties during pre-flight testing. Also contributing to the delays was the need for additional inspections following the Apollo 1 fire that killed the first Apollo crew in January 1967. These issues delayed the flight through much of 1967. The mission splashed down in the Pacific Ocean slightly less than nine hours after launch, having achieved its objectives.");
			textarea.sendKeys("Apollo 4, also known as SA-501, was the first, uncrewed, flight in the United States Apollo program, and the first test of the Saturn V launch vehicle, the rocket that would be used to send astronauts to the Moon. The space vehicle was the first to be launched from Kennedy Space Center in Florida, lifting off from Launch Complex 39A, where facilities designed specially for the Saturn V had been constructed, on November 9, 1967 – depicted in this photograph. The original launch date was planned for late 1966, but was delayed due to a myriad of problems with various elements of the spacecraft, and difficulties during pre-flight testing. Also contributing to the delays was the need for additional inspections following the Apollo 1 fire that killed the first Apollo crew in January 1967. These issues delayed the flight through much of 1967. The mission splashed down in the Pacific Ocean slightly less than nine hours after launch, having achieved its objectives.");
			textarea.sendKeys("Apollo 4, also known as SA-501, was the first, uncrewed, flight in the United States Apollo program, and the first test of the Saturn V launch vehicle, the rocket that would be used to send astronauts to the Moon. The space vehicle was the first to be launched from Kennedy Space Center in Florida, lifting off from Launch Complex 39A, where facilities designed specially for the Saturn V had been constructed, on November 9, 1967 – depicted in this photograph. The original launch date was planned for late 1966, but was delayed due to a myriad of problems with various elements of the spacecraft, and difficulties during pre-flight testing. Also contributing to the delays was the need for additional inspections following the Apollo 1 fire that killed the first Apollo crew in January 1967. These issues delayed the flight through much of 1967. The mission splashed down in the Pacific Ocean slightly less than nine hours after launch, having achieved its objectives.");
			/*WebElement emojoButton = driver
					.findElement(By.xpath("//mat-icon[contains(text(),'sentiment_satisfied ')]"));
			js.executeScript("arguments[0].click()", emojoButton);
			Thread.sleep(3000);
			WebElement emojo = driver.findElement(By.xpath("//span[contains(@aria-label,' slightly_smiling_face')]"));
			js.executeScript("arguments[0].click()", emojo);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click()", emojoButton);
			Thread.sleep(3000);*/
			/*
			 * Actions actions = new Actions(driver); Action action =
			 * actions.sendKeys(Keys.ESCAPE).build(); action.perform();
			 */
			/*
			 * WebElement text =
			 * driver.findElement(By.xpath("//span[contains(text(),'1991')]"));
			 * js.executeScript("arguments[0].click()", text); Thread.sleep(2000);
			 */
			WebElement imageButton = driver.findElement(By.xpath("//img[@src='assets/images/common/image.svg']"));
			js.executeScript("arguments[0].click()", imageButton);
			Thread.sleep(3000);
			WebElement image1 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[6]"));
			js.executeScript("arguments[0].click()", image1);
			Thread.sleep(2000);
			WebElement image2 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[7]"));
			js.executeScript("arguments[0].click()", image2);
			Thread.sleep(2000);
			WebElement image3 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[8]"));
			js.executeScript("arguments[0].click()", image3);
			Thread.sleep(2000);
			WebElement image4 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[9]"));
			js.executeScript("arguments[0].click()", image4);
			Thread.sleep(2000);
			WebElement image5 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[10]"));
			js.executeScript("arguments[0].click()", image5);
			Thread.sleep(2000);
			WebElement image6 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[11]"));
			js.executeScript("arguments[0].click()", image6);
			Thread.sleep(2000);
			WebElement image7 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[12]"));
			js.executeScript("arguments[0].click()", image7);
			Thread.sleep(2000);
			WebElement image8 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[13]"));
			js.executeScript("arguments[0].click()", image8);
			Thread.sleep(2000);
			WebElement image9 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[14]"));
			js.executeScript("arguments[0].click()", image9);
			Thread.sleep(2000);
			WebElement images = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[15]"));
			js.executeScript("arguments[0].click()", images);
			Thread.sleep(2000);
			WebElement images1 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[16]"));
			js.executeScript("arguments[0].click()", images1);
			Thread.sleep(2000);

//attach button
			WebElement attachButton = driver.findElement(By.xpath("//span[contains(text(),' Attach ')]"));
			js.executeScript("arguments[0].click()", attachButton);
			Thread.sleep(2000);
			System.out.println("For Facebook not more than 10 images to uploaded");
			WebElement images2 = driver
					.findElement(By.xpath("(//span[contains(@class,'media-gallery__card--check')])[16]"));
			js.executeScript("arguments[0].click()", images2);
			Thread.sleep(2000);

			WebElement attachButton1 = driver.findElement(By.xpath("//span[contains(text(),' Attach ')]"));
			js.executeScript("arguments[0].click()", attachButton1);
			Thread.sleep(2000);

//add location
			WebElement locationButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' location_on')]"));
			js.executeScript("arguments[0].click()", locationButton);
			Thread.sleep(2000);
			WebElement locationName = driver.findElement(By.xpath("//input[@placeholder='Enter location name']"));
			locationName.sendKeys("Hyderabad");
			Thread.sleep(5000);
			WebElement selectLocation = driver.findElement(By.xpath("//p[contains(text(),'Hyderabad City, India')]"));
			js.executeScript("arguments[0].click()", selectLocation);
			Thread.sleep(2000);

//save draft
			WebElement draftButton = driver.findElement(By.xpath("//span[contains(text(),' Save Draft ')]"));
			js.executeScript("arguments[0].click()", draftButton);
			Thread.sleep(2000);

			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search1.sendKeys("Apollo 4, also known as SA-501, was the first, uncrewed, flight in the United States Apollo program,");
			WebElement searchButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(4000);

			WebElement draftTab = driver.findElement(By.xpath("//div[contains(text(),'Drafts ')]"));
			js.executeScript("arguments[0].click()", draftTab);
			Thread.sleep(2000);

			draftTabVerification(driver);

			WebElement next = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next);
			Thread.sleep(2000);

			WebElement next1 = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next1);
			Thread.sleep(2000);

			WebElement label = driver.findElement(By.xpath("//input[@placeholder='Enter post labels...']"));
			js.executeScript("arguments[0].click()", label);
			label.sendKeys("see images");
			label.sendKeys(Keys.ENTER);

			WebElement next2 = driver.findElement(By.xpath("//span[contains(text(),' Next ')]"));
			js.executeScript("arguments[0].click()", next2);
			Thread.sleep(2000);

			WebElement publish = driver.findElement(By.xpath("//span[contains(text(),' Publish ')]"));
			js.executeScript("arguments[0].click()", publish);
			Thread.sleep(5000);

			WebElement scheduleTab = driver.findElement(By.xpath("//div[contains(text(),'Scheduled ')]"));
			js.executeScript("arguments[0].click()", scheduleTab);
			Thread.sleep(5000);

			WebElement socialPostName = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Publishing']"));
			// WebElement scheduledTime = driver.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			if (socialPostName.isDisplayed()) {
				System.out.println("Social post name and time are displayed");
			} else {
				System.out.println("Social post name and time are not  displayed");
			}
			Thread.sleep(3000);

			WebElement allPostTab = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab);
			TimeUnit.MINUTES.sleep(2);
			// Thread.sleep(30000);

			publishedVerification(driver);

			deleteTabVerification(driver);
			
			WebElement allPostTab1 = driver.findElement(By.xpath("//div[contains(text(),'All Posts ')]"));
			js.executeScript("arguments[0].click()", allPostTab1);
			Thread.sleep(3000);


			WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search for post content']"));
			search2.clear();
			WebElement searchButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			
			WebElement arrow = driver.findElement(By.xpath("//div[contains(@class,'mat-select-arrow-wrapper')]"));
			js.executeScript("arguments[0].click()", arrow);
			Thread.sleep(3000);
			WebElement search3 = driver.findElement(By.xpath("//input[@placeholder='Search brand name']"));
			search3.sendKeys("auto demo");
			WebElement selectBrand1 = driver.findElement(By.xpath("//span[contains(text(),' Auto Demo ')]"));
			js.executeScript("arguments[0].click()", selectBrand1);
			Thread.sleep(3000);
			
			filterSection(driver);
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

	public static void draftTabVerification(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement profile = driver
					.findElement(By.xpath("//div[contains(@class,'socialposts__item--head-profilelist-item')]"));
			WebElement socialPostName = driver
					.findElement(By.xpath("//p[@class='font-weight-500 no-wrap' and text()='Draft']"));
			if (profile.isDisplayed() && socialPostName.isDisplayed()) {
				System.out.println("Profile and social post name are displayed");
			} else {
				System.out.println("Profile and social post name are not displayed");
			}

			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			WebElement editButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			WebElement chatButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			WebElement preview = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			if (postCreatedBy.isDisplayed() && deleteButton.isDisplayed() && editButton.isDisplayed()
					&& chatButton.isDisplayed() && preview.isDisplayed()) {
				System.out.println("Post createdby,delete,edit,chat,preview buttons are displayed");
			} else {
				System.out.println("Post createdby,delete,edit,chat,preview buttons are not displayed");
			}

			WebElement chat = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			js.executeScript("arguments[0].click()", chat);
			Thread.sleep(4000);
			WebElement activityData = driver
					.findElement(By.xpath("//div[contains(@class,'activitylog__body--right-scroll')]"));
			if (activityData.isDisplayed()) {
				System.out.println("Activity Data is displayed");
			} else {
				System.out.println("Activity Data is not  displayed");
			}
			WebElement closeButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(3000);

			WebElement edit = driver.findElement(By.xpath("(//mat-icon[contains(text(),'edit')])[2]"));
			js.executeScript("arguments[0].click()", edit);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void publishedVerification(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement publishedTab = driver.findElement(By.xpath("(//div[contains(text(),'Published ')])[1]"));
			js.executeScript("arguments[0].click()", publishedTab);
			Thread.sleep(3000);

			WebElement socialPostName1 = driver.findElement(By.xpath("//p[contains(text(),'Published')]"));
			WebElement publishedTime = driver
					.findElement(By.xpath("//p[contains(@class,'font-weight-500 ml-5 no-wrap')]"));
			System.out.println("publishedTime: " + publishedTime.getText());
			if (socialPostName1.isDisplayed() && publishedTime.isDisplayed()) {
				System.out.println("Published post name ,time are displayed");
			} else {
				System.out.println("Published post name,time are not  displayed");
			}
			Thread.sleep(3000);

			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement deleteButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			WebElement openPost = driver.findElement(By.xpath("(//mat-icon[contains(text(),' open_in_new')])"));
			WebElement chatButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			WebElement preview = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			WebElement trend = driver.findElement(By.xpath("(//mat-icon[contains(text(),'trending_up')])"));
			if (postCreatedBy.isDisplayed() && deleteButton.isDisplayed() && openPost.isDisplayed()
					&& chatButton.isDisplayed() && preview.isDisplayed() && trend.isDisplayed()) {
				System.out.println("Post createdby,delete,openpost,chat,preview,trends buttons are displayed");
			} else {
				System.out.println("Post createdby,delete,openpost,chat,preview,trends buttons are not displayed");
			}

//activity log
			WebElement activityLog = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			js.executeScript("arguments[0].click()", activityLog);
			Thread.sleep(3000);

			WebElement activityData = driver
					.findElement(By.xpath("//div[contains(@class,'activitylog__body--right-scroll')]"));
			if (activityData.isDisplayed()) {
				System.out.println("Activity Data is displayed");
			} else {
				System.out.println("Activity Data is not  displayed");
			}
			WebElement closeButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(2000);

//preview
			WebElement previewButton = driver.findElement(By.xpath("(//mat-icon[contains(text(),'remove_red_eye')])"));
			js.executeScript("arguments[0].click()", previewButton);
			Thread.sleep(3000);

			WebElement previewHeading = driver.findElement(By.xpath("//h3[@class='modal__title text-capitalize']"));
			WebElement leftsidePreview = driver.findElement(By.xpath("//div[@class='postPreview__left']"));
			WebElement socialCard = driver.findElement(By.xpath("//div[@class='social-cards__body bg__white']"));
			if (previewHeading.isDisplayed() && leftsidePreview.isDisplayed() && socialCard.isDisplayed()) {
				System.out.println("Preview heading,leftside,social card are displayed");
			} else {
				System.out.println("Preview heading,leftside,social card are not displayed");
			}

			WebElement closeButton1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'close')]"));
			js.executeScript("arguments[0].click()", closeButton1);
			Thread.sleep(3000);

//trend
			WebElement trendButton = driver.findElement(By.xpath("//mat-icon[contains(text(),'trending_up')]"));
			js.executeScript("arguments[0].click()", trendButton);
			Thread.sleep(3000);

			WebElement heading = driver.findElement(By.xpath("//span[contains(@class,'text__title text-capitalize')]"));
			WebElement publishedOn = driver.findElement(By.xpath("//span[@class='postPublishedBy']"));
			WebElement ApprovedBy = driver.findElement(By.xpath("//span[@class='postApprovedBy']"));
			WebElement postPreview = driver.findElement(By.xpath("//div[@class='postPreview__left']"));
			WebElement socialcard = driver.findElement(By.xpath("//div[@class='social-cards__body bg__white']"));
			if (heading.isDisplayed() && publishedOn.isDisplayed() && ApprovedBy.isDisplayed()
					&& postPreview.isDisplayed() && socialcard.isDisplayed()) {
				System.out.println("Heading,publishedOn,ApprovedBy,Postpreview,Socialcard are displayed");
			} else {
				System.out.println("Heading,publishedOn,ApprovedBy,Postpreview,Socialcard are not displayed");
			}

//relative fields
			WebElement field = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[1]"));
			WebElement field1 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[2]"));
			WebElement field2 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[3]"));
			WebElement field3 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[4]"));
			WebElement field4 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[5]"));
			WebElement field5 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[6]"));
			WebElement field6 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[7]"));
			WebElement field7 = driver
					.findElement(By.xpath("(//div[contains(@class,'card__pills ng-star-inserted')])[8]"));
			if (field.isDisplayed() && field1.isDisplayed() && field2.isDisplayed() && field3.isDisplayed()
					&& field4.isDisplayed() && field5.isDisplayed() && field6.isDisplayed() && field7.isDisplayed()) {
				System.out.println("All fields are displayed");
			} else {
				System.out.println("All fields are not displayed");
			}

			WebElement heading1 = driver.findElement(By.xpath("(//h2[@class='text__title text-capitalize'])[1]"));
			WebElement duration = driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-wrapper')])[4]"));
			// WebElement heading2 = driver.findElement(By.xpath("//h3[@class='text__title
			// text-center text_style']"));
			WebElement heading3 = driver.findElement(By.xpath("(//h2[@class='text__title text-capitalize'])[2]"));
			// WebElement data =
			// driver.findElement(By.xpath("(//div[@class='highcharts-container '])"));
			if (heading1.isDisplayed() && duration.isDisplayed() && heading3.isDisplayed()) {
				System.out.println("Headings,duration and data are displayed");
			} else {
				System.out.println("Headings,duration and data are not displayed");
			}

			WebElement arrowback = driver.findElement(By.xpath("//mat-icon[contains(text(),'arrow_back')]"));
			js.executeScript("arguments[0].click()", arrowback);
			Thread.sleep(3000);

//openPost
			WebElement openPost1 = driver.findElement(By.xpath("(//mat-icon[contains(text(),' open_in_new')])"));
			js.executeScript("arguments[0].click()", openPost1);
			Thread.sleep(3000);

			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(1));
			Thread.sleep(5000);
			driver.switchTo().window(newTb.get(0));

//delete
			WebElement delete1 = driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_outline')]"));
			js.executeScript("arguments[0].click()", delete1);
			Thread.sleep(3000);

			WebElement delete2 = driver
					.findElement(By.xpath("//span[contains(text(),' Delete from Social Channel ')]"));
			js.executeScript("arguments[0].click()", delete2);
			Thread.sleep(15000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void deleteTabVerification(WebDriver driver) throws Exception {
		try {

			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement deleteTab = driver.findElement(By.xpath("(//div[contains(text(),'Deleted ')])"));
			js.executeScript("arguments[0].click()", deleteTab);
			Thread.sleep(3000);

			WebElement status = driver.findElement(By.xpath("//p[contains(text(),'Deleted From Social')]"));
			WebElement time = driver.findElement(
					By.xpath("//div[contains(@class,'socialposts__item--body-socialicons-item ml-auto')]"));
			System.out.println("Delete Time: " + time.getText());
			if (status.isDisplayed() && time.isDisplayed()) {
				System.out.println("Status and time is displayed");
			} else {
				System.out.println("Status and time is not displayed");
			}

			WebElement postCreatedBy = driver.findElement(
					By.xpath("(//div[@class='socialposts__item--foot-actions-item border-right__light-grey'])[1]"));
			WebElement labels = driver.findElement(
					By.xpath("//div[contains(@class,'socialposts__item--foot-credit border-bottom__light-grey')]"));
			if (postCreatedBy.isDisplayed() && labels.isDisplayed()) {
				System.out.println("Post createdby,labels are displayed");
			} else {
				System.out.println("Post createdby,labels are not displayed");
			}

			WebElement activityLog = driver.findElement(By.xpath("(//mat-icon[contains(text(),'chat')])[2]"));
			js.executeScript("arguments[0].click()", activityLog);
			Thread.sleep(3000);

			WebElement activityData = driver
					.findElement(By.xpath("//div[contains(@class,'activitylog__body--right-scroll')]"));
			if (activityData.isDisplayed()) {
				System.out.println("Activity Data is displayed");
			} else {
				System.out.println("Activity Data is not  displayed");
			}
			WebElement closeButton = driver.findElement(By.xpath("//mat-icon[contains(text(),' close')]"));
			js.executeScript("arguments[0].click()", closeButton);
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void filterSection(WebDriver driver) throws Exception {
		try {
			
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement filterButton=driver.findElement(By.xpath("//mat-icon[contains(text(),'filter_alt ')]"));
			js.executeScript("arguments[0].click()", filterButton);
			Thread.sleep(3000);
			
//channel
			WebElement channels=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[2]"));
			js.executeScript("arguments[0].click()", channels);
			Thread.sleep(3000);
			WebElement selectChannel=driver.findElement(By.xpath("//span[contains(text(),'Facebook')]"));
			js.executeScript("arguments[0].click()", selectChannel);
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			Action action = actions.sendKeys(Keys.ESCAPE).build();
			action.perform();
			
//social profile
			WebElement socialProfile=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[3]"));
			js.executeScript("arguments[0].click()", socialProfile);
			Thread.sleep(3000);
			WebElement searchProfile=driver.findElement(By.xpath("//input[@placeholder='Search']"));
			searchProfile.sendKeys("kalyan page");
			WebElement searchButton=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton);
			Thread.sleep(3000);
			WebElement selectProfile=driver.findElement(By.xpath("//span[contains(text(),'Kalyan page')]"));
			js.executeScript("arguments[0].click()", selectProfile);
			Thread.sleep(3000);
			Actions actions1 = new Actions(driver);
			Action action1 = actions1.sendKeys(Keys.ESCAPE).build();
			action1.perform();
			
//team member
			WebElement teamMember=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[4]"));
			js.executeScript("arguments[0].click()", teamMember);
			Thread.sleep(3000);
			WebElement selectMember=driver.findElement(By.xpath("//span[@class='mat-checkbox-label' and text()=' Kalyanlive chinni ']"));
			js.executeScript("arguments[0].click()", selectMember);
			Thread.sleep(3000);
			Actions actions2 = new Actions(driver);
			Action action2 = actions2.sendKeys(Keys.ESCAPE).build();
			action2.perform();
			
//postlabel
			WebElement postLabel=driver.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow-wrapper')])[5]"));
			js.executeScript("arguments[0].click()", postLabel);
			Thread.sleep(3000);
			WebElement searchlabel=driver.findElement(By.xpath("//input[@placeholder='Search']"));
			searchlabel.sendKeys("see images");
			WebElement searchButton1=driver.findElement(By.xpath("(//mat-icon[contains(text(),'search')])[2]"));
			js.executeScript("arguments[0].click()", searchButton1);
			Thread.sleep(3000);
			WebElement selectLabel=driver.findElement(By.xpath("//span[@class='mat-checkbox-label' and text()=' see images ']"));
			js.executeScript("arguments[0].click()", selectLabel);
			Thread.sleep(3000);
			Actions actions3 = new Actions(driver);
			Action action3 = actions3.sendKeys(Keys.ESCAPE).build();
			action3.perform();
			
			WebElement applyButton=driver.findElement(By.xpath("//span[contains(text(),'Apply')]"));
			js.executeScript("arguments[0].click()", applyButton);
			Thread.sleep(3000);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}

}
