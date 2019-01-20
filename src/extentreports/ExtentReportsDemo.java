package extentreports;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsDemo {
	
	static ExtentReports report;
	static ExtentTest test;
	
	
	public void loginTest() {
		test = report.startTest("login test");
		test.log(LogStatus.INFO, "username located");
		test.log(LogStatus.INFO, "username filled");
		test.log(LogStatus.INFO, "password located");
		test.log(LogStatus.INFO, "password filled");
		test.log(LogStatus.INFO, "login button located");
		test.log(LogStatus.INFO, "clicked on login button");
		test.log(LogStatus.PASS, "login test passed");
		report.endTest(test);
	}
	
	public void branchSearchTest() {
		test = report.startTest("branchsearch test");
		test.log(LogStatus.INFO, "clicked on branches button");
		test.log(LogStatus.INFO, "selected country name");
		test.log(LogStatus.INFO, "selected state");
		test.log(LogStatus.INFO, "selected city");
		test.log(LogStatus.INFO, "clicked on search button");
		test.log(LogStatus.PASS, "branch search test passed");
		report.endTest(test);
	}
	
	public void roleCreationTest() {
		test = report.startTest("role creation test");
		test.log(LogStatus.INFO, "role button clicked");
		test.log(LogStatus.INFO, "new role button clicked");
		test.log(LogStatus.INFO, "role name entered");
		test.log(LogStatus.INFO, "role description entered");
		test.log(LogStatus.INFO, "role type selected");
		test.log(LogStatus.INFO, "submit button clicked");
		test.log(LogStatus.INFO, "alert accepted");
		test.log(LogStatus.FAIL, "role creation failed");
		test.log(LogStatus.FAIL, test.addScreenCapture(new File(".\\screenshots\\image.png").getAbsolutePath()));
		report.endTest(test);
	}
	
	public static void main(String[] args) {
		report = new ExtentReports(".\\reports\\myreport.html");
		ExtentReportsDemo obj = new ExtentReportsDemo();
		obj.loginTest();
		obj.branchSearchTest();
		obj.roleCreationTest();
		report.flush();
		report.close();
		
	}

}
