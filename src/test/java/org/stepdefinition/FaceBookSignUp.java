package org.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class FaceBookSignUp extends Baseclass {
	FbPojo fb ;
	@Given("Launch Firefox Browser and maximize the window")
	public void launch_Firefox_Browser_and_maximize_the_window() {
	   launchBrowser();
	   maximizeBrowser();
	}

	@When("Pass the Url of the facebook login page")
	public void pass_the_Url_of_the_facebook_login_page() {
	   launchUrl("https://en-gb.facebook.com/login/");
	}

	@When("Mousehover to click Signup for Facebook and click on it")
	public void mousehover_to_click_Signup_for_Facebook_and_click_on_it() {
	   Actions a = new Actions(driver);
	   WebElement sign = driver.findElement(By.xpath("//a[@rel='nofollow']"));
	   a.moveToElement(sign).click().perform();   
	}

	@When("Signup page will be open")
	public void signup_page_will_be_open() {
	   System.out.println("Sign-up page will appeared successfully");
	}

	@When("To pass the first name in the first name textbox")
	public void to_pass_the_first_name_in_the_first_name_textbox(DataTable dataTable) throws InterruptedException {
	   Thread.sleep(3000);
		fb = new FbPojo();
	   List<String> list = dataTable.asList();
	   passText(list.get(2), fb.getFirstName());
	}

	@When("To pass the surname in the surname textbox")
	public void to_pass_the_surname_in_the_surname_textbox(DataTable dataTable) {
	    fb = new FbPojo();
	    List<String> list = dataTable.asList();
	    passText(list.get(1), fb.getSurName());
	}

	@When("To pass the mobile number or email address int the email field")
	public void to_pass_the_mobile_number_or_email_address_int_the_email_field(DataTable dataTable) throws InterruptedException {
		 fb = new FbPojo();
		 Thread.sleep(4000);
		 List<List<String>> lists = dataTable.asLists(); 
		 passText(lists.get(1).get(0),fb.getMobileNo());
		
	}

	@When("To pass a password in the password field")
	public void to_pass_a_password_in_the_password_field(DataTable dataTable) {
	    fb= new FbPojo();
	    List<String> list = dataTable.asList();
	    passText(list.get(1), fb.getPassword());
	}

	@When("Select your birthday in the day dropdown box")
	public void select_your_birthday_in_the_day_dropdown_box() {
	   WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	   Select s = new Select(day);
	   s.selectByIndex(26);
	}

	@When("Select your birth month in the month dropdown box")
	public void select_your_birth_month_in_the_month_dropdown_box() {
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		   Select s = new Select(month);
		   s.selectByIndex(2);
	}

	@When("Select your birth year in the year dropdown box")
	public void select_your_birth_year_in_the_year_dropdown_box() {
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		   Select s = new Select(year);
		   s.selectByValue("1999");
	}

	@When("Select your gender by clicking the respective radio button")
	public void select_your_gender_by_clicking_the_respective_radio_button() {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]")).click();	
	}

	@Then("To close the entire browser")
	public void to_close_the_entire_browser() throws InterruptedException {
	   Thread.sleep(5000);
	   quitBrowser();
	}
}
