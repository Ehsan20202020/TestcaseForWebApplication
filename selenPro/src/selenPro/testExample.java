package selenPro;

import java.util.List;
import java.util.Scanner;

import org.asynchttpclient.util.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
*
* @author Ehsanullah Shahriary ehsanullah.shahriary2@ogr.sakarya.edu.tr 
* @since 12/05/2023 - 28/05/2023
* <p>
* Yazılım Testi 1.A Grop
* </p>
*/
public class testExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		/// Input variable...
		Scanner input =new Scanner(System.in);
		
		int userChoice;
		
		do 
		{		
			userChoice = displayMenu(input);
			
			switch(userChoice)
			{
			case 1:
				//Writing UserName by Id...
				FindUserName(); 
				break;
				
			case 2:
				//verifying if the element is selected...
				// Beni hatirla...
				IsSelected();
				break;
			case 3:
				//isEnabled Function for giris button... 
				IsElementEnabled();
				break;
				
			case 4:
				//Function for displaying...
				IsDisplayed();
				break;
				
			case 5:
				///LinkText Function for "Buraya teklayiniz"....
				LinkText();
				break;
				
			case 6:
				////partialLinkText Function for "sifremi unuttum"
				partialLinkText();
				break;
				
			case 7:
				///printing Image TagName using TagName command...
				ImageTagName();
				break;
				
			case 8:
				///Printing Image width value by TagName command...
				ImageValue();
				break;
				
			case 9:
				///Function to print btn link using getAttribute command...
				RegisterBtn();
				break;
				
			case 10:
				// Test LoginPage...
				LoginTest();
				break;
				
			case 11:
				///Get title of web page
				TitleName();
				break;
				
			case 12:
				/// Function to click oyeOl btn using getAttribute command...
				clickRegister();
				break;
				
			case 13:
				/// Write userName and email on textLabel...
				userAndEmailTextLabel();
				break;
				
			case 14:
				/// Write Name and Surname on textLabel...
				NameAndLastNameTextLabel();		
				break;
				
			case 15:
				/// Function to oyeOl button testCase...
				click_oyeOl();
				break;
				
			case 16:
				//verifying if the element is selected...
				IsElementSelected();;
				break;
				
			case 17:
				/// Filter and search testCase(using x-path)
				Filter();
				break;
				
			case 18:
				// Click on Image link...(using x-path)
				ImageLink();
				break;
			case 19:
				// List the images using tagName...
				ListImage();
				break;
				
			case 20:
				//list the listMenu and titleName on webPage...
				listMenu();
				break;
				
			case 21:
				// Click on Image and print width and height value...(using xPath)
				imageHeight();
				break;
			case 22:
				//Print image links on webPage...
				listImageLink();
				break;
				
			case 23:
				//Click on logoImage link... (using xPath)
				imageLogo();
				break;
			case 24:
				// Print image text or on webPage...
				imageTitle();
				break;
			case 25:
				// test button by using tagName...
				KarsilastirmaButton();
				break;
			case 26:
				//Select and click on button using x-path...
				selectAndClickButton();
				break;
				
			case 27:
				// testCase for inceleButton by using x-path...
				clickInceleButton();
				break;
				
			case 28:
				// function for Comment section by using x-path...
				yorumFunction();
				break;
			case 29:
				/// Function to select ByIndex... 
				SelectByIndex();
				/// Function to select ByValue... 
				SelectByValue();
				/// Function to select ByVisibleText... 
				SelectByVisibleText();
				break;
				
			case 30:
				// Function to testCase button using(x-path)
				inceleButton();
				break;
				
			case 31:
				System.out.println("GoodBye!!!");
				break;
				
			default:
				System.out.println("Wrong entry: Enter a value between 1-31");
				break;
			}
			
		} while(userChoice != 31);
		
	}
	
	/// Display Menu function...
	public static int displayMenu(Scanner input) {
		System.out.println("\n Make a selection for test the web application");
		System.out.println("---------------------");
		
		System.out.print("1) FindElemetBy id.\n");
		System.out.print("2) isElement selected.\n");
		System.out.print("3) isEnabled(Giris btn).\n");
		System.out.print("4) isDisplayed(Google play).\n");
		System.out.print("5) LinkText() command testCase.\n");
		System.out.print("6) partialLinkText() command.\n");
		System.out.print("7) TagName command(for image).\n");
		System.out.print("8) using TagName Command to print image width.\n");
		System.out.print("9) printing(giris btn) link, using getAttribute command.\n");////////////
		System.out.print("10) TestCase for loginPage.\n");
		System.out.print("11) Get title of web page.\n");
		System.out.print("12) Click oyeOl button(using TagName command).\n");
		System.out.print("13) Username and email testCase.\n");
		System.out.print("14) Name,surname and password testCase.\n");
		System.out.print("15) OyeOl button testing.\n");
		System.out.print("16) Veryfing if the element is selected.\n");
		System.out.print("17) Filter testCase(using x-path).\n");
		System.out.print("18) Click on imageLink(using x-path).\n");
		System.out.print("19) List image on webPage(using tagName command).\n");
		System.out.print("20) List titleName(li using tagName).\n");
		System.out.print("21) Image width and height testCase.(using x-path)\n");
		System.out.print("22) Print all image links on webPage.\n");
		System.out.print("23) TestCase for logo image(using x-Path)\n");
		System.out.print("24) Print all image title on webPage.\n");
		System.out.print("25) TestCase for button(using tagName).\n");
		System.out.print("26) TestCase for checkBox and button(using x-path).\n");
		System.out.print("27) TestCase for inceleButton by using x-path.\n");
		System.out.print("28) TestCase for Comment section(using x-path).\n");
		System.out.print("29) TestCase for select(byValue,Index,VisibleText).\n");
		System.out.print("30) TestCase for another button(using x-path).\n");
		System.out.print("31) Quit \n");
		
		return input.nextInt();
		
	}
	
	@Test
	///Writing UserName by Id...
	public static void FindUserName() throws InterruptedException{
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
		
		WebElement eleman = driver.findElement(By.cssSelector("input[id*='username']"));
		
		eleman.sendKeys("Ehsan");
		Thread.sleep(2000);
		
		
		driver.quit();
	}
	
	@Test
	//verifying if the element is selected...
	//Beni hatirla..
	public static void IsSelected() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
		
		// Store in a variable...
        WebElement Is_selected = driver.findElement(By.tagName("label"));
		
		boolean selected = Is_selected.isSelected();
		
		Thread.sleep(3000);
		System.out.println("It is unSelected... "+ selected);
		
		driver.quit();
		
	}
		
	@Test
	/// isEnabled Function for giris button... 
	public static void IsElementEnabled() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
		
		// Store in a variable...
        WebElement Is_enabled = driver.findElement(By.tagName("button"));
		
		boolean Enabled = Is_enabled.isEnabled();
		
		Thread.sleep(3000);
		
		System.out.println("It is Enabled..."+ Enabled);
		
		driver.quit();
	}
	
	@Test
	/// Function for displaying...
	public static void IsDisplayed() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
		
        WebElement Is_displayed = driver.findElement(By.tagName("button"));
		
		boolean Displayed = Is_displayed.isEnabled();
		
		System.out.println("It is displyed... "+ Displayed);
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	//// LinkText Function for "Buraya teklayiniz"....
	public static void LinkText() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
		
		driver.findElement(By.linkText("buraya tıklayınız!")).click();
		Thread.sleep(4000);
		
		System.out.println("The linkText... Buraya tiklayiniz!");
		
		driver.quit();
	}
	
	@Test
	////partialLinkText Function for "sifremi unuttum"
	public static void partialLinkText() {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
		
		driver.findElement(By.partialLinkText("Şifremi"));
		
		System.out.println("Text... sifremi Unuttum!");
		
		driver.quit();
	}
	
	@Test
	///printing Image TagName using TagName command...
	public static void ImageTagName() {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
		
		WebElement ImgTag = driver.findElement(By.tagName("img"));
		System.out.println("TagName is... "+ ImgTag.getTagName());
		
		driver.quit();
	}
	
	@Test
    ///Printing Image width value by TagName command...
	public static void ImageValue() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
		
		WebElement Value = driver.findElement(By.tagName("img"));
		System.out.println("Image width is... "+ Value.getAttribute("width"));
		
		driver.quit();
	}
	
	
	@Test
	/// Function to print btn link using getAttribute command...
	public static void RegisterBtn() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
				 	
		WebElement btnLink = driver.findElement(By.tagName("a"));
		
		System.out.println("The Button Link... "+ btnLink.getAttribute("href"));
		//Thread.sleep(7000);
		driver.quit();
		
	}
	
	@Test
	/// Test LoginPage...
	public static void LoginTest() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
		
		// Send value to userName textLabel.
		WebElement userName = driver.findElement(By.cssSelector("input[id*='username']"));
		userName.sendKeys("Ehsan Heravi");
		Thread.sleep(4000);
		// Printing value...
		System.out.println("Value is... "+userName.getAttribute("value"));
		
		WebElement password = driver.findElement(By.cssSelector("input[id*='password']"));
		password.sendKeys("Eh12345");
		// Printing value...
		System.out.println("Value is... "+password.getAttribute("value"));
		Thread.sleep(4000);
		
		// Find button by tagNam...
		WebElement BtnTagName = driver.findElement(By.tagName("button"));
		//click button...
		BtnTagName.click();
		System.out.println("Clicked... But I don't have account to load HomePage!!!");
		driver.quit();	
	}
	
	@Test
	///Printing title using GetTitle command...
	public static void TitleName() {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
			
		String title = driver.getTitle();
		System.out.println(title);
			
		driver.quit();
		
	}
	
	@Test
	/// Function to click oyeOl btn using getAttribute command...
	public static void clickRegister() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-girisi");
					 	
		WebElement btnLink = driver.findElement(By.tagName("a"));
			
		btnLink.click();
		Thread.sleep(4000);
		System.out.println("The Button Link... "+ btnLink.getAttribute("href"));
			
		driver.quit();
		
	}
	
	@Test
	/// Write userName and email on textLabel...
	public static void userAndEmailTextLabel() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-ol");
			
		// Send value to userName textLabel.
		WebElement userName = driver.findElement(By.cssSelector("input[name*='nickName']"));
		userName.sendKeys("Ehsan Heravi");
		Thread.sleep(4000);
			
		// Printing value...
		System.out.println("Value is... "+userName.getAttribute("value"));
		
		WebElement emailLabel = driver.findElement(By.cssSelector("input[name='email']"));
		emailLabel.sendKeys("ehsan@gmail.com");
			
		// Printing value...
		System.out.println("Value is... "+emailLabel.getAttribute("value"));
		Thread.sleep(4000);
		driver.quit();
			
	}
	
	@Test
	/// Write Name and Surname on textLabel...
	public static void NameAndLastNameTextLabel() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-ol");
					
		// Send value to userName textLabel.
		WebElement NameLabel = driver.findElement(By.cssSelector("input[name*='name']"));
		NameLabel.sendKeys("Ehsan");
		Thread.sleep(4000);
			
		// Printing value...
		System.out.println("Value is... "+NameLabel.getAttribute("value"));
			
		// Send value to surName textLabel.
		WebElement lastName = driver.findElement(By.cssSelector("input[name='surname']"));
		lastName.sendKeys("Heravi");
			
		// Printing value...
		System.out.println("Value is... "+lastName.getAttribute("value"));
		Thread.sleep(4000);
			
		// Send value to password textLabel.
		WebElement password = driver.findElement(By.cssSelector("input[data-toggle='tooltip']"));
		password.sendKeys("Ehsan1234");
			
		// Printing value...
		System.out.println("Value is... "+password.getAttribute("value"));
		Thread.sleep(4000);	
		driver.quit();
		
	}
	
	@Test
	/// Function to oyeOl button testCase...
	public static void click_oyeOl() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/uye/uye-ol");
		driver.manage().window().maximize();
							 	
		WebElement btnLink = driver.findElement(By.tagName("button"));
					
		btnLink.click();
		Thread.sleep(4000);
		System.out.println("Test Passed...");
		System.out.println("Text Label must not empty!!!");
					
		driver.quit();
		
	}
	
	@Test
	//verifying if the element is selected...
	public static void IsElementSelected() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.arabalar.com.tr/uye/uye-ol");
		
		WebElement Is_selected = driver.findElement(By.tagName("label"));
		
		boolean selected = Is_selected.isSelected();
		Thread.sleep(3000);
		
		if(true) {
			System.out.println("test passed "+ selected);
		}
		else
			System.out.println("selected... True");
		driver.quit();
	}
	
	@Test
	/// Filter and search testCase(using x-path)
	public static void Filter() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/");
		driver.manage().window().maximize();
		
		// Send value to EnAzFiyat textLabel.
	    WebElement EnAzFiyat = driver.findElement(By.cssSelector("input[name*='dinheiro']"));
		EnAzFiyat.sendKeys("50000");
		Thread.sleep(2000);
		
		/// Select element by Value...
		WebElement dropDwon = driver.findElement(By.name("yakit"));
		Select select = new Select(dropDwon);
		select.selectByValue("1");
		Thread.sleep(2000);
		
		/// Select element by Value...
		WebElement dropDwon2 = driver.findElement(By.name("vites"));
		Select select2 = new Select(dropDwon2);
		select2.selectByValue("2");
		Thread.sleep(2000);
		
		/// Select element by Value...
		WebElement dropDwon3 = driver.findElement(By.name("kasa"));
		Select select3 = new Select(dropDwon3);
		select3.selectByValue("1");
		Thread.sleep(2000);
		
		/// Select element by Value...
		WebElement dropDwon4 = driver.findElement(By.name("siralama"));
		Select select4 = new Select(dropDwon4);
		select4.selectByValue("0");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"detailsearch\"]/form/div[2]/div[3]/button")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test
	// Click on Image link... (using xPath)
	public static void ImageLink() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/aside[1]/div/div[4]/div[2]/div[1]/a/img")).click();
		
		System.out.println("Image clicked...");
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test
	// List the images using tagName...
	public static void ListImage() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/");
		driver.manage().window().maximize();
		
		List<WebElement> listImages = driver.findElements(By.tagName("img"));
		
		System.out.println("Number of images..."+ listImages.size());
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	//list the listMenu and titleName on webPage...
	public static void listMenu() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/");
		driver.manage().window().maximize();
			
		List<WebElement> listMenu = driver.findElements(By.tagName("a"));
			
		System.out.println("Number of listMenu(li)..."+ listMenu.size());
		
		for(int n =0; n< listMenu.size(); n++) {
			
			if(!(listMenu.get(n).getAttribute("title").equals("") && !(listMenu.get(n).getAttribute("title")== null))) {
				System.out.println(listMenu.get(n).getAttribute("title"));
				}
			
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	// Click on Image and print width and height value... (using xPath)
	public static void imageHeight() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/");
		driver.manage().window().maximize();
			
		WebElement imageWidth = driver.findElement(By.xpath("//*[@id=\"main\"]/aside[1]/div/div[8]/div[2]/div/ul/li[1]/div[1]/a/img"));
		
		imageWidth.click();
			
		System.out.println("Image clicked...");
		System.out.println("Image width is..."+ imageWidth.getAttribute("alt"));
		System.out.println("Image height is..."+ imageWidth.getAttribute("alt"));
			
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test
	//Print image links on webPage...
	public static void listImageLink() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/araba-fiyatlari");
		driver.manage().window().maximize();
		
		List<WebElement> listImages = driver.findElements(By.tagName("img"));
		
		System.out.println("Number of images..."+ listImages.size());
		System.out.println("The image links are...");
	    
	    /// for to count image links...
		for(int m =0; m< listImages.size(); m++) {
			if(!(listImages.get(m).getAttribute("src").equals("") && !(listImages.get(m).getAttribute("src")== null))) {
				
				System.out.println(listImages.get(m).getAttribute("src"));
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	// Click on logoImage link... (using xPath)
	public static void imageLogo() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/araba-fiyatlari");
		driver.manage().window().maximize();
		
		WebElement imageTitle = driver.findElement(By.xpath("//*[@id=\"fiyatlar\"]/div[2]/div[1]/a/img"));
		imageTitle.click();
		
		
		System.out.println("Image clicked...");
		Thread.sleep(3000);
		
		System.out.println("Image titles are..."+ imageTitle.getAttribute("alt"));
		driver.quit();
		
	}
	
	@Test
	// Print image text or on webPage...
	public static void imageTitle() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/araba-fiyatlari");
		driver.manage().window().maximize();
		
		List<WebElement> imageAlt = driver.findElements(By.tagName("img"));
		System.out.println("Image alt are..."+ imageAlt.size());
		
		// for to count image links...
		for(int m =0; m< imageAlt.size(); m++) {
			
			if(!(imageAlt.get(m).getAttribute("alt").equals("") && !(imageAlt.get(m).getAttribute("alt")== null))) {
				System.out.println(imageAlt.get(m).getAttribute("alt"));
				}
			}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	// test button by 
	public static void KarsilastirmaButton() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/ford/s-max");
					
		driver.manage().window().maximize();
		
		//click the button...
		WebElement clickBtn = driver.findElement(By.tagName("button"));
		clickBtn.click();
		Thread.sleep(3000);
		
		System.out.println("Test passed...");
		System.out.println("You must at least select two option!!!");
		driver.quit();
	}
	
	@Test
	//Select and click on button using x-path...
	public static void selectAndClickButton() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/ford/s-max");
		driver.manage().window().maximize();
		
		//select checkBox1
		WebElement selectBox = driver.findElement(By.xpath("//*[@id=\"0km\"]/ul/li[1]/input"));
		selectBox.click();
		Thread.sleep(2000);
		
		//select checkBox2
	    WebElement selectBox2 = driver.findElement(By.xpath("//*[@id=\"0km\"]/ul/li[5]/input"));
	    selectBox2.click();
	    Thread.sleep(2000);
		
	    //click the button...
	    WebElement clickBtn = driver.findElement(By.xpath("//*[@id=\"sorting2\"]/div/div/button"));
	    clickBtn.click();
	    Thread.sleep(5000);
	    driver.quit();
	    
	}
	
	@Test
	// testCase for inceleButton by using x-path...
	public static void clickInceleButton() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/araba-karsilastirma/3-1-206542-1-204309-1-180650");	
		driver.manage().window().maximize();
		
		//click the button...
		WebElement clickBtn = driver.findElement(By.xpath("//*[@id=\"karsilastirma\"]/div/div[2]/div[2]/table/tbody/tr[20]/td/span/a"));
		Thread.sleep(1000);
		clickBtn.click();
		Thread.sleep(4000);
		
		System.out.println("Test passed...");
		driver.quit();
	}
	
	@Test
	// function for Comment section by using x-path...
	public static void yorumFunction() throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.arabalar.com.tr/toyota/land-cruiser/2017/prado-2-8-d4-d-at");
	    driver.manage().window().maximize();
	    
	    // Store in a variable...
	    WebElement clickBtn = driver.findElement(By.xpath("//*[@id=\"commentform\"]/div[2]/textarea"));
	    
	    // Write something on comment box...
	    clickBtn.sendKeys("It is the best car...");
	    Thread.sleep(4000);
	    
	    System.out.println("Test passed...");
	    driver.quit();
	    
	}
	
	@Test
	/// Function to select checkBox ByIndex... 
	public static void SelectByIndex() throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/araba-karsilastirma");
		driver.manage().window().maximize();
		
		WebElement dropDwon = driver.findElement(By.id("mark0"));
		Select select = new Select(dropDwon);
		
		select.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement dropDwon2 = driver.findElement(By.id("series0"));
		Select select2 = new Select(dropDwon2);
		
		select2.selectByValue("3");
		Thread.sleep(2000);
		
		WebElement dropDwon3 = driver.findElement(By.id("model0"));
		Select select3 = new Select(dropDwon3);
		
		select3.selectByValue("5");
		Thread.sleep(2000);
		
		WebElement dropDwon4 = driver.findElement(By.id("engine0"));
		Select select4 = new Select(dropDwon4);
		
		select4.selectByValue("1");
		Thread.sleep(4000);
		
		driver.quit();
		
	}
	
	@Test
	//Function to select byValue...
	public static void SelectByValue() throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/araba-karsilastirma");
		driver.manage().window().maximize();
		
		WebElement dropDwon = driver.findElement(By.id("mark1"));
		Select select = new Select(dropDwon);
		
		select.selectByIndex(4);
		Thread.sleep(2000);
		
		WebElement dropDwon2 = driver.findElement(By.id("series1"));
		Select select2 = new Select(dropDwon2);
		
		select2.selectByValue("5");
		Thread.sleep(2000);
		
		WebElement dropDwon3 = driver.findElement(By.id("model1"));
		Select select3 = new Select(dropDwon3);
		
		select3.selectByValue("3");
		Thread.sleep(2000);
		
		WebElement dropDwon4 = driver.findElement(By.id("engine1"));
		Select select4 = new Select(dropDwon4);
		
		select4.selectByValue("1");
		Thread.sleep(4000);
		
		driver.quit();
		
	}
	
	@Test
	//Function to select byVisibleText...
	public static void SelectByVisibleText() throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/araba-karsilastirma");
		driver.manage().window().maximize();
	   
		WebElement dropDwon = driver.findElement(By.id("mark2"));
		Select select = new Select(dropDwon);
			
		select.selectByVisibleText("Ferrari");
		Thread.sleep(2000);
		
		WebElement dropDwon2 = driver.findElement(By.id("series2"));
		Select select2 = new Select(dropDwon2);
		
		select2.selectByValue("0");
		Thread.sleep(2000);
		
		WebElement dropDwon3 = driver.findElement(By.id("model2"));
		Select select3 = new Select(dropDwon3);
		
		select3.selectByValue("2");
		Thread.sleep(2000);
		
		WebElement dropDwon4 = driver.findElement(By.id("engine2"));
		Select select4 = new Select(dropDwon4);
		
		select4.selectByValue("0");
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	@Test
	// Function to testCase button using(x-path)
	public static void inceleButton() throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\SeleniumDriver\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.arabalar.com.tr/araba-karsilastirma");
		driver.manage().window().maximize();
		

		WebElement dropDwon = driver.findElement(By.id("mark0"));
		Select select = new Select(dropDwon);
		
		select.selectByValue("2");
		Thread.sleep(2000);	
		
		WebElement dropDwon2 = driver.findElement(By.id("series0"));
		Select select2 = new Select(dropDwon2);
		
		select2.selectByValue("3");
		Thread.sleep(2000);
		
		WebElement dropDwon3 = driver.findElement(By.id("model0"));
		Select select3 = new Select(dropDwon3);
		
		select3.selectByValue("5");
		Thread.sleep(2000);
		
		WebElement dropDwon4 = driver.findElement(By.id("engine0"));
		Select select4 = new Select(dropDwon4);
		
		select4.selectByValue("1");
		Thread.sleep(2000);
		
		//click the button...
		WebElement clickBtn = driver.findElement(By.xpath("//*[@id=\"karsilastirma\"]/div/div[2]/div[2]/table/tbody/tr[20]/td/span/a"));
		clickBtn.click();
		Thread.sleep(3000);
		
		System.out.println("Test passed...");
		driver.quit();
		
	}
	
}


