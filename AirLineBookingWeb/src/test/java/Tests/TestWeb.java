package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.TicketWebsiteActions;

public class TestWeb  {
	private static WebDriver driver=null;

	@BeforeTest
	public void setup() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/drivers/chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public static void veirifyUserAbleToChoosedepartureCity() {
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.chooseDepartureCity(1, 0);
	}
	@Test
	public static void veirifyUserAbleToChoosedestinationCity() {
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.chooseDestinationCity(1, 1);
		
	}
	@Test	
	public static void checkDestinationOfTheWeekCity(){
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.checkDestinationOfTheWeekPage();
	}
	@Test
	public static void veirifTravelFromParisToRome() throws InterruptedException {
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.chooseDepartureCity(1,0);
		test.chooseDestinationCity(1, 1);
		test.hitsEnterToFindFlights();
		test.bookFlight();
		test.purchaseFlight();
		test.confirmationPage();
		 Thread.sleep(3000);	

	}
	@Test
	public static void veirifTravelFromBostonToLonden() throws InterruptedException {
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.chooseDepartureCity(2,0);
		test.chooseDestinationCity(2, 1);
		test.hitsEnterToFindFlights();
		test.bookFlight();
		test.purchaseFlight();
		test.confirmationPage();
		 Thread.sleep(3000);	

	}
	@Test
	public static void veirifTravelFromPhiladelphiaToBuenosAires() throws InterruptedException {
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.chooseDepartureCity(3,0);
		test.chooseDestinationCity(3, 1);
		test.hitsEnterToFindFlights();
		test.bookFlight();
		test.purchaseFlight();
		test.confirmationPage();
		 Thread.sleep(3000);	

	}
	@Test
	public static void veirifTravelFromPortlandToBerlin() throws InterruptedException {
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.chooseDepartureCity(4,0);
		test.chooseDestinationCity(4, 1);
		test.hitsEnterToFindFlights();
		test.bookFlight();
		test.purchaseFlight();
		test.confirmationPage();
		 Thread.sleep(3000);	

	}
	@Test
	public static void veirifTravelFromSanDiegoToNewYork() throws InterruptedException {
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.chooseDepartureCity(5,0);
		test.chooseDestinationCity(5, 1);
		test.hitsEnterToFindFlights();
		test.bookFlight();
		test.purchaseFlight();
		test.confirmationPage();
		 Thread.sleep(3000);	

	}
	@Test
	public static void veirifTravelFromMexicoCityToDublin() throws InterruptedException {
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.chooseDepartureCity(6,0);
		test.chooseDestinationCity(6, 1);
		test.hitsEnterToFindFlights();
		test.bookFlight();
		test.purchaseFlight();
		test.confirmationPage();
		 Thread.sleep(3000);	

	}
	@Test
	public static void veirifTravelFromSaoPaoloToCairo() throws InterruptedException {
		TicketWebsiteActions test=new TicketWebsiteActions(driver);
		driver.get("https://blazedemo.com/index.php");
		test.openedURL();
		test.chooseDepartureCity(7,0);
		test.chooseDestinationCity(7, 1);
		test.hitsEnterToFindFlights();
		test.bookFlight();
		test.purchaseFlight();
		test.confirmationPage();
		 Thread.sleep(3000);	

	}


	@AfterTest
	public void teardown() {
		driver.close();
	}
}
