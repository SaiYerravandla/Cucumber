package swagLab_POMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_lab_ADD_To_CART_POM {


		WebDriver driver;

		By username=By.xpath("//*[@id=\"user-name\"]");
		By password=By.xpath("//*[@id=\"password\"]");
		By login_button=By.xpath("//*[@id=\"login-button\"]");

		By Check_Homepage=By.xpath("//*[@id=\"inventory_filter_container\"]/div");

		By Add_Bag_Product=By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");

		By Clicking_Cart_Button=By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']");

		By Click_CheckOut_Button=By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]");

		By Enter_FirstName= By.xpath("//*[@id=\"first-name\"]");

		By Enter_LastName=By.xpath("//*[@id=\"last-name\"]");

		By Enter_PinCode=By.xpath("//*[@id=\"postal-code\"]");
		By Click_Continue_Button=By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input");

		By Verify_Payment_Information=By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]");

		By click_Finish=By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]");

		By Check_Order_Confirmed=By.xpath("//*[@id=\"checkout_complete_container\"]/h2");

		By CLick_menu=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");

		By Click_Logout_Button=By.xpath("//*[@id=\"logout_sidebar_link\"]");

		By Verifying_Logout=By.xpath("/html/body/div[1]");
		
		
		

		public Swag_lab_ADD_To_CART_POM(WebDriver driver) {

			this.driver=driver;

		}


		public void Launch_Browser() throws InterruptedException {

			driver=new ChromeDriver();

			driver.get("https://saucedemo.com/v1/");

			driver.manage().window().maximize();
			
			Thread.sleep(1000);




		} 

		public void Enter_Valid_Login_Credentials(String user,String pass) throws InterruptedException {

			driver.findElement(username).sendKeys(user);
			Thread.sleep(1000);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(login_button).click();
			Thread.sleep(1000);


		}

		public void Checking_Homepage() throws InterruptedException {

			if(driver.findElement(Check_Homepage).isDisplayed()) {

				System.out.println("Homepage is succsufully Navigated");
			}
			
			else {
				System.err.println("Homepage Navigation is failed");
			}


	        Thread.sleep(1000);

		}

		public void Add_to_Cart() throws InterruptedException {

			Thread.sleep(1000);
			driver.findElement(Add_Bag_Product).click();
			
			
			//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
			//wait.until(ExpectedConditions.elementToBeClickable(Clicking_Cart_Button)).click();
			try {
				driver.findElement(Clicking_Cart_Button).click();
				
			} catch (Exception e) {
			 System.out.println("Here the wrong line");
			}
			
			Thread.sleep(1000);
			
			driver.findElement(Click_CheckOut_Button).click();
		

			driver.findElement(Enter_FirstName).sendKeys("Gurusaikumar");

			driver.findElement(Enter_LastName).sendKeys("Yerravandla");
			Thread.sleep(1000);
			driver.findElement(Enter_PinCode).sendKeys("515411");
			Thread.sleep(1000);

			driver.findElement(Click_Continue_Button).click();

			Thread.sleep(1000);

			if(driver.findElement(Verify_Payment_Information).isDisplayed()) {

				Thread.sleep(1000);

				driver.findElement(click_Finish).click();
			}
			else {
				System.out.println("Not Verifyig the Payment page");
			}


			if(driver.findElement(Check_Order_Confirmed).isDisplayed()) {

				Thread.sleep(1000);
				System.out.println("The order is confirmed and over all cart process is complete");

			}

			else {

				System.out.println("The order not confirmed and over all cart process Incomplete");

			}

			Thread.sleep(1000);
		}

		public void Logout() {

			driver.findElement(CLick_menu).click();
			driver.findElement(Click_Logout_Button).click();
			if(driver.findElement(Verifying_Logout).isDisplayed()) {

				System.out.println("The Logout process is Succsufully Completed");
				
				driver.quit();
			}

			else {
				System.out.println("The Logout process is Not Succusufully  Completed");
			

			}



		}
	}


