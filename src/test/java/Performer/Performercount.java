package Performer;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Performercount {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;
	@BeforeTest
	
	void Login1() throws InterruptedException, IOException {
		extent=new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\ambuj\\eclipse-workspace\\AuditProject\\Report\\Auditproduct.html",true);
		test=extent.startTest("login succesfully");
		
		Performermethod.Login();
		test.log(LogStatus.PASS, "Login Successfully");
	
		extent.endTest(test);
		extent.flush();
	}	
	@Test(priority=1)
	
	void Count() throws InterruptedException
{
		test = extent.startTest("Count of Open Audit");
		
		Performermethod.Count(test);
		
		extent.endTest(test);
		extent.flush();
		
		//test=extent.startTest("count of open Audit");
		//Performermethod.Count(test);
		//extent.endTest(test);
		//extent.flush();
	}
	
	//@Test(priority=2)
	void myworkspace() throws InterruptedException {
		test=extent.startTest("Workspace");
		Performermethod.MyWorkspace(test);
		test.log(LogStatus.PASS, "Workspace");
		extent.endTest(test);
		extent.flush();
	
	}
	//@Test(priority=3)
	void myworkspace1() throws InterruptedException {
		test=extent.startTest("Workspace1");
		Performermethod.MyWorkspace1(test);
		test.log(LogStatus.PASS, "Workspace1");
		extent.endTest(test);
		extent.flush();
	
	}
//@Test(priority=4)
	
	void mydocument() throws InterruptedException {
		test=extent.startTest("Document Download");
		Performermethod.mydocument(test);
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=5)

void myreport() throws InterruptedException {
	test=extent.startTest("Report Download");
	Performermethod.myreport(test);
	extent.endTest(test);
	extent.flush();
}
	}
