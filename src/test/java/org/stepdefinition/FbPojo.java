package org.stepdefinition;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends Baseclass {
public FbPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(name = "firstname")
private WebElement FirstName;

@FindBy(name = "lastname")
private WebElement SurName;

@FindBy(xpath = "(//input[@type='text'])[3]")
private WebElement mobileNo;

@FindBy(xpath = "//input[@type='password']")
private WebElement password;

public WebElement getFirstName() {
	return FirstName;
}

public WebElement getSurName() {
	return SurName;
}

public WebElement getMobileNo() {
	return mobileNo;
}

public WebElement getPassword() {
	return password;
}



}
