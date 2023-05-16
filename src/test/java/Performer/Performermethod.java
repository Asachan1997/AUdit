package Performer;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Performermethod {
	//private static final org.openqa.selenium.chrome.ChromeOptions new = null;
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet1 = null;
	public static WebDriver driver;
	public static Row row=null;
	public static Cell cell=null;
	public static void Login() throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ambuj\\Downloads\\chromedriver_win32 (2)//chromedriver.exe"); 
		  //ChromeOptions Option=new ChromeOptions();
		  //Option.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver();       //Created new Chrome driver instance.
		  Thread.sleep(3000);
		
		  driver.manage().window().maximize();
		  fis = new FileInputStream("C://Users//ambuj//Desktop//automation//auditexcelsheet.xlsx");
			workbook = new XSSFWorkbook(fis);
			sheet1=workbook.getSheetAt(0);
			Row row0 = sheet1.getRow(0);				//Selected 0th index row (First row)  
			Cell c1 = row0.getCell(1);					//Selected cell (0 row,1 column)
			String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
			 driver.get(URL);
			 Row row1 = sheet1.getRow(1);		        //Selected 1st index row (Second row)
				c1 = row1.getCell(1);					//Selected cell (1 row,1 column)
		    String uname = c1.getStringCellValue();	
		    Performerlocator.setUname(driver).sendKeys(uname);
			Row row2 = sheet1.getRow(2);		               //Selected 2nd index row (Third row)
	        c1 = row2.getCell(1);		                      //Selected cell (2 row,1 column)
		    String password = c1.getStringCellValue();
		    Performerlocator.setPass(driver).sendKeys(password);
		    Performerlocator.clicksubmit(driver).click();
		    Performerlocator.clicksequrity(driver).click();
		    Thread.sleep(5000);
		    
		    Performerlocator.setquestion1(driver).sendKeys("123");
		    Thread.sleep(3000);
		    Performerlocator.setquestion2(driver).sendKeys("123");
			  Thread.sleep(3000);
			  Performerlocator.clickbtnvalidate(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickars(driver).click();
			  Thread.sleep(3000);
	}
	
	public static void Count(ExtentTest test)throws InterruptedException 
	{
		Thread.sleep(3000);
		 Performerlocator.clickfinancialyear(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickselectfinancialyear(driver).click();
			  Thread.sleep(2000);
	            if(Performerlocator.clickopencount(driver).isEnabled())
	           {
	               Thread.sleep(2000);
	                 Performerlocator.clickopencount(driver).click();
	                 test.log(LogStatus.PASS, "Open Audit count is clickable");
	            }
	          else
	          {
	    	         test.log(LogStatus.FAIL, "Open Audit count is not clickable");
	          }
	           
	            Thread.sleep(3000);
				  Performerlocator.clickDashboard(driver).click();
				  
	}
	public static void MyWorkspace(ExtentTest test)throws InterruptedException {
			  Performerlocator.clickcompany(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickselectcompany(driver).click();
			  Thread.sleep(9000);
			  WebDriverWait wait = new WebDriverWait(driver, (40));	
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0")));	//Wait until records table get visible.
			 // Performerlocator.clicksubunit(driver).click();
			 // Thread.sleep(3000);
			 // Performerlocator.clickselectsubunit(driver).click();
			  //Thread.sleep(3000);
			  Performerlocator.clickviewauditdetails(driver).click();
			  Thread.sleep(3000);
			//  if (dirContents1.length < allFilesNew1.length) {
					test.log(LogStatus.PASS, " :- View Popup open successfully.");
				//} //else {
					//test.log(LogStatus.FAIL, " :- View Popup open successfully..");
				//}
			  Performerlocator.clickexporttoexcel(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickdraftobservation(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickprocess(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickselectprocess(driver).click();
			  Thread.sleep(3000);
			Performerlocator.ObservationList_CheckBox(driver).click();
				Thread.sleep(2000);
				Performerlocator.ObservationList_Save(driver).click();
				Thread.sleep(3000);
				String messge=Performerlocator.ObservationList_SaveMsg(driver).getText();
				if(messge.equalsIgnoreCase("Observation updated successfully.")) 
				{
					test.log(LogStatus.PASS, "Observation updated successfully.");
				}
				else
				{
					test.log(LogStatus.FAIL, "Observation not updated successfully.");
				}
			//Performerlocator.clickremoveobservation(driver).click();
			//Thread.sleep(3000);	
			//  ((TargetLocator) Performerlocator.clickremoveobservation(driver)).alert().accept();
			 //driver.switchTo().alert().accept();
			 Performerlocator.clickbackbtn(driver).click();
			  Thread.sleep(3000);
			 Performerlocator.clicknotdone(driver).click();
			  Thread.sleep(3000);
			  /* Performerlocator.clickaddnew(driver).click();
			  Thread.sleep(3000);
			 Performerlocator.clickauditstep(driver).sendKeys("Audit Step");
			  Thread.sleep(3000);
			  Performerlocator.clickauditmethodology(driver).sendKeys("Audit Methodology");
			  Thread.sleep(3000);
			  Performerlocator.clicksaveaddnew(driver).click();
			  Thread.sleep(3000);
			  String messge11=Performerlocator.clickmessageaddnew(driver).getText();
				if(messge11.equalsIgnoreCase("Audit Step Save Sucessfully.")) 
				{
					test.log(LogStatus.PASS, "Audit Step Save Sucessfully.");
				}
				else
				{
					test.log(LogStatus.FAIL, "Audit Step Save not Sucessfully..");
				}
			  Performerlocator.clickcross(driver).click();
			  Thread.sleep(3000);*/
			 // Performerlocator.clickcheckbox(driver).click();
			 // Thread.sleep(3000);
			  //Performerlocator.clickchecksave(driver).click();
			  //Thread.sleep(3000);
			  /*String messge12=Performerlocator.clickmessagesave(driver).getText();
				if(messge12.equalsIgnoreCase("Audit Step Save Sucessfully.")) //change krna hai
				{
					test.log(LogStatus.PASS, "Audit Step Save Sucessfully.");
				}
				else
				{
					test.log(LogStatus.FAIL, "Audit Step Save not Sucessfully..");
				}*/
			  Performerlocator.clickbackbutton(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clicknewmail(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clicknewmail1(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickto(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickselectto(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clicksendmail(driver).click();
			  Thread.sleep(5000);
			    // Switching to Alert        
		        Alert alert1 = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String alertMessage1= driver.switchTo().alert().getText();	
		        
		        
		        test.log(LogStatus.PASS, alertMessage1);
		        		
		        // Displaying alert message		
		        System.out.println(alertMessage1);
		        
		     // Accepting alert		
		        alert1.accept();
				
			  Performerlocator.clickcross1(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickbckbtn(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickinternal(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickinternalmail(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickto1(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickselectto1(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clicksendmail1(driver).click();
			  Thread.sleep(3000);
			// Switching to Alert        
		        Alert alert2 = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String alertMessage2= driver.switchTo().alert().getText();	
		        
		        
		        test.log(LogStatus.PASS, alertMessage1);
		        		
		        // Displaying alert message		
		        System.out.println(alertMessage1);
		        
		     // Accepting alert		
		        alert1.accept();
			  Performerlocator.clickcross2(driver).click();
			  Thread.sleep(3000);
	}
				  public static void MyWorkspace1(ExtentTest test)throws InterruptedException {
					  Performerlocator.clickcompany(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickselectcompany(driver).click();
					  Thread.sleep(9000);
					 
					  /*Performerlocator.clickviewdatarequest(driver).click();
					  Thread.sleep(9000);
					 // Performerlocator.clickauditee(driver).click();
					  //Thread.sleep(9000);
					  Performerlocator.clickselectauditee(driver).click();
					  Thread.sleep(9000);
					  //Performerlocator.clickreportingmanager(driver).click();
					  //Thread.sleep(9000);
					  Performerlocator.clickselectreportingmanager(driver).click();
					  Thread.sleep(9000);
					  Performerlocator.clicksaveviewdata(driver).click();
					  Thread.sleep(9000);
					  WebDriverWait wait = new WebDriverWait(driver, (40));	
					  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_grdRiskActivityMatrix_lnkprerequsiteDetails_0")));
				 driver.switchTo().frame(Performerlocator.clickframe(driver));
			  Performerlocator.clickcross(driver).click();
			  Thread.sleep(3000);
			  Performerlocator.clickprocesswalkthrough(driver).sendKeys("processwalkthrough");
			    Thread.sleep(3000);
			    Performerlocator.clickactualwdone(driver).sendKeys("Actula work done");
			    Thread.sleep(3000);
			    Performerlocator.clickpopulation(driver).sendKeys("population");
			    Thread.sleep(3000);
			    Performerlocator.clicksample(driver).sendKeys("sample");
			    Thread.sleep(3000);
			    Performerlocator.clickremark(driver).sendKeys("remark");
			    Thread.sleep(3000);
			    JavascriptExecutor js=(JavascriptExecutor) driver ;
		 		js.executeScript("window.scroll(0,900)");
		 		Thread.sleep(5000);
			   /* Performerlocator.clickworkingfile(driver).sendKeys("C:\\Users\\ambuj\\Downloads\\Customer BranchList (27).xlsx");
			    Thread.sleep(3000);
		 		 Performerlocator.clicknextbtn(driver).click();
				  Thread.sleep(3000);  
				  
				  Performerlocator.clickobservationtitle(driver).sendKeys("observationtitle");
				    Thread.sleep(3000);
				    Performerlocator.clickobservation(driver).sendKeys("Observation");
				    Thread.sleep(3000);
				    Performerlocator.clickbriefobservation(driver).sendKeys("detailed obsrvation");
				    Thread.sleep(3000);
				    Performerlocator.clickAnnexureTitle(driver).sendKeys("welcome");
				    Thread.sleep(3000);
				    Performerlocator.clickaudiolink(driver).sendKeys("www.w3school.com");
				    Thread.sleep(3000);
				    Performerlocator.clickbusinessrisk(driver).sendKeys("simple");
				    Thread.sleep(3000);
				    Performerlocator.clickrootcause(driver).sendKeys("root cause");
				    Thread.sleep(3000);
				    Performerlocator.clickfinancialimpact(driver).sendKeys("123");
				    Thread.sleep(3000);
				    Performerlocator.clickriskrating(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickselectriskrating(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickobservationcategory(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickselectobservationcategory(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickrecommendationtype(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickselectrecommendationtype(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickrecommendation(driver).sendKeys("recommendation");
					    Thread.sleep(3000);
					  Performerlocator.clickmanagementresponse(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickpersonresponsible(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickselectpersonresponsible(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickownername(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickselectownername(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clicksaverecommendation(driver).click();
					  Thread.sleep(3000);
					  */
					  //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("showdetails"));
					  //Performerlocator.clickrecommendationok(driver).click();
					 //Thread.sleep(3000);
					  //By locator = By.linkText("ok");
					  //By locator = By.xpath("//button[@class='k-button k-primary']");
						//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
						//Thread.sleep(4000);
						
						//WebElement ViewButton = driver.findElement(locator);	
						//Thread.sleep(3000);
					//JavascriptExecutor jse=(JavascriptExecutor)driver;
					//jse.executeScript("arguments[0].click();", ViewButton();
					  Performerlocator.clicksaveobservation(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickobservationok(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickhistorylog(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clickreviewremark(driver).click();
					  Thread.sleep(3000);
					  Performerlocator.clicksubmitbtn(driver).click();
					  Thread.sleep(3000);
					  driver.switchTo().parentFrame();
				  }
					  
					  public static void mydocument(ExtentTest test)throws InterruptedException 
					  {
                          Thread.sleep(2000);
						  Performerlocator.clickmydocument(driver).click();
						  Thread.sleep(9000);
						  Performerlocator.clickmydocumentfilter(driver).click();
						  Thread.sleep(9000);
						  Performerlocator.clickmydocumentselectfilter(driver).click();
						  Thread.sleep(9000);
						  
						  if(Performerlocator.clickmydocumentdownload(driver).isEnabled())
				            {
				                 Thread.sleep(2000);
				                 Performerlocator.clickmydocumentdownload(driver).click();
				                 test.log(LogStatus.PASS, "Document Downloaded");
				            }
				          else
				          {
				    	         test.log(LogStatus.FAIL, "Document not Dowmloaded");
				          }
				           
				            Thread.sleep(3000);
					  }
				            public static void myreport(ExtentTest test)throws InterruptedException 
							  {
		                          Thread.sleep(2000);
		                          Performerlocator.clickmyreport(driver).click();
								  Thread.sleep(5000);
								  /*Performerlocator.clickmyreportfilter(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickmyreportselectfilter(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickmyfinalreportdownload(driver).click();
								  Thread.sleep(5000);*/
								  Performerlocator.clickmore(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickauditstatus(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickexportexcel(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickmore1(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickopenobservation(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickdownloadopenobservation(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickmore2(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickpastauditreport(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickpastauditexcelexport(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickdownloadpast(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickmore3(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickprerequsite(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickentity(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickselectentity(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clicksubentity(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickselectsubentity(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickyear(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickselectyear(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickschedulingtype(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickselectschedulingtype(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickperiod(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickselectperiod(driver).click();
								  Thread.sleep(5000);
								  Performerlocator.clickprerequsiteexcelexport(driver).click();
								  Thread.sleep(5000);
								  
								  
								  
								  
								  
								  
					  
					//  driver.switchTo().alert().accept();
						// Thread.sleep(3000);
				   
				  
			  
			 // driver.switchTo().parentFrame();
					  
}
	
}

