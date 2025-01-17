package admin;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.AdminPage;
import pomRepository.HomePage;

public class TC03_Test extends BaseTest{
 
	@Test
	
	public void createUser() {
		HomePage homePage=new HomePage(driver);
		homePage.getAdmin().click();
		AdminPage adminPage=new AdminPage(driver);
		adminPage.getAdd().click();
		SelectClassUtil dropDown=new SelectClassUtil();
		adminPage.getEmployeeName().clear();
		adminPage.getEmployeeName().sendKeys("David Morris",Keys.ENTER);
		adminPage.getUserName().clear();
		adminPage.getUserName().sendKeys("Abhi");
		dropDown.selectDropDown(adminPage.getStatusDropDown(), "Enabled");
		adminPage.getPassword().clear();
		adminPage.getPassword().sendKeys("Abhi@123");
		adminPage.getConfirmPassword().clear();
		adminPage.getConfirmPassword().sendKeys("Abhi@123");
		adminPage.getSave().click();
		Reporter.log("Succesfully added details",true);
	}
}