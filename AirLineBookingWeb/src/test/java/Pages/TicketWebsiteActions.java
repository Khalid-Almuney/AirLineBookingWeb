package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.ExcelUtils;
public class TicketWebsiteActions {
	String projectpath=System.getProperty("user.dir");
	ExcelUtils excel=new ExcelUtils( projectpath+"\\excel\\data.xlsx", "sheet1");
	 WebDriver driver=null;

	public TicketWebsiteActions(WebDriver driver) {
		this.driver=driver;

	}
	//home page locators
	By Welcome_Meeasge= By.xpath("/html/body/div[2]/div/h1");
	
	 By departure_List= By.name("fromPort");

	By destination_List= By.name("toPort");

	By destination_Of_The_Week= By.xpath("/html/body/div[2]/div/p[2]/a");
	
	By destination_Of_The_message= By.xpath("/html/body/div[2]");

	By Find_Flights= By.xpath("/html/body/div[3]/form/div/input");

	//flight details page page locators
	By Choose_First_Flight= By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input");

	By Purchase_FLight= By.xpath("/html/body/div[2]/form/div[11]/div/input");
	
	//Confirmation page
	By Confirmation_Meeasge= By.xpath("/html/body/div[2]/div/h1");

	/***************************************************************************************/		
	//Actions 



	public void openedURL() {
		WebElement meesage = driver.findElement(Welcome_Meeasge);
		System.out.println(meesage.getText());
		Assert.assertTrue(driver.getPageSource()
				.contains(meesage.getText()));	

	}

	public void checkDestinationOfTheWeekPage() {
		driver.findElement(destination_Of_The_Week).click();
		WebElement meesage = driver.findElement(destination_Of_The_message);
		System.out.println(meesage.getText());
		Assert.assertTrue(driver.getPageSource()
				.contains(meesage.getText()));
		

	}

	public  void chooseDepartureCity(int Row , int Col) {
		
	Select option= new Select(driver.findElement(departure_List));
	String city =excel.getCellDate(Row, Col);
	
	
  option.selectByVisibleText(city);


	}

	public void chooseDestinationCity(int Row, int Col) {

		Select option= new Select(driver.findElement(destination_List));
		String city =excel.getCellDate(Row, Col);
		
	  option.selectByVisibleText(city);

	}

	public void hitsEnterToFindFlights() {
		driver.findElement(Find_Flights).click();
		

	}

	public void bookFlight() {
driver.findElement(Choose_First_Flight).click();

	}

	public void purchaseFlight() {
driver.findElement(Purchase_FLight).click();
	}
	public void confirmationPage() {
		WebElement meesage = driver.findElement(Confirmation_Meeasge);
		System.out.println(meesage.getText());
		Assert.assertTrue(driver.getPageSource()
				.contains(meesage.getText()));
		
	}



}
