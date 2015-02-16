package com.DFATPageObjects.MyApplications;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.DFAT_Australia.BaseClass;


public class LoginPageObjects extends BaseClass{
	public WebDriver driver;
	boolean Errorcheckresult;
	String Username="Tester12345";
	String Password="Welcome12345!";		
	String SecureKey= "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";
	// The element is now looked up using the name/ID/XPATH attribute

	@FindBy(how = How.XPATH, using = "//strong[contains(.,'Create new account')]")
	public WebElement CreateNewAccountTextBoxRadioButton;

	@FindBy(how = How.XPATH, using = "//strong[contains(.,'Login to existing account')]")
	public WebElement LoginToExistingAccountRadioButton;

	@FindBy(how=How.ID, using="UserName")
	public WebElement UsernameTextBox;

	@FindBy(how = How.ID, using ="Password")
	public WebElement PasswordTextBox ;

	@FindBy(how=How.ID, using ="Privatekey")
	public WebElement KeyTextBox;

	@FindBy(how=How.XPATH, using ="//input[@value='Login']")
	public WebElement LoginButton;




	public boolean FillForm()
	{try{
		click(LoginToExistingAccountRadioButton);
		enterText(UsernameTextBox,Username);
		enterText(PasswordTextBox, Password);
		enterText(KeyTextBox,SecureKey);
		click(LoginButton);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
	}
	// Error Checking function on a page
	public boolean errorChecker(WebDriver Driver,String Path,String Section,int Errors) throws IOException, InterruptedException
	{
		try
		{int count=0;
		click(LoginButton);
		Thread.sleep(1000);
		List <WebElement> ErrorList = new ArrayList<WebElement>(); 
		ErrorList=Driver.findElements(By.xpath("//span[contains(@id,'-error')]"));
		BaseClass.myWriteAppend(Path,"");
		BaseClass.myWriteAppend(Path,Section);
		BaseClass.myWriteAppend(Path,"");
		//System.out.println("Error Message list");
		for (WebElement errrors: ErrorList)
		{
			if (!errrors.getText().isEmpty())
			{
				BaseClass.myWriteAppend(Path,"Error Text "+(count+1)+":"+errrors.getText());
				//System.out.println("Error Text "+(count+1)+":"+errrors.getText());
				count=count+1;
			}
		}
		System.out.println("Expected "+Errors+" Errors and Found "+count);
		if (!(count==Errors))
		{
			System.out.println("Number of error Messages Inconsistant.");
			return false;

		}
		BaseClass.myWriteAppend(Path,"***********************************");
		BaseClass.myWriteAppend(Path,"");
		return true;
		}
		catch (Exception e)
		{
			return false;
		}

	}
	public boolean FillFormErrorChecker(WebDriver Driver,String Path,String Section, int Errors) throws InterruptedException, IOException
	{
		try{
			//Error Checker
			click(LoginToExistingAccountRadioButton);
			click(LoginButton);
			Errorcheckresult=errorChecker(Driver,Path,Section,Errors);
			//Fill Form
			enterText(UsernameTextBox, Username);
			enterText(PasswordTextBox, Password);
			enterText(KeyTextBox,SecureKey);
			click(LoginButton);
			if (!(Errorcheckresult)){
				return false;
			}
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

} 

