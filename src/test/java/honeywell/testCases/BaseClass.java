package base;

import java.io.IOException;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.remote.MobileCapabilityType;
import validation.Action;
import validation.ExcelAction;
import validation.FunctionalAction;
import validation.UserValidation;

public class Iphone6plus {
	
	String xlpath="//Users//e527753//Documents//SVN//RWD&Functional//src//testdata//Workbook1.xlsx";
	String IphoneSpecPath="//Users//e527753//Documents//SVN//RWD&Functional//Iphone6PlusSpecfile";
	String GalenreportPath="//Users//e527753//Documents//SVN//RWD&Functional//Galenreport";
	static String inputsfilepath="//Users//e527753//Documents//SVN//RWD&Functional//src//inputs//credentials.properties";
	String sheet="Sheet2";
	ExcelAction e=new ExcelAction();
	Action act=new Action();
	String baseurl=null;
	
	
	WebDriver driver=null;
	@BeforeMethod
	public void setup() throws MalformedURLException, InterruptedException{
		Thread.sleep(3000);
        DesiredCapabilities capabilities = new  DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.1");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ios");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6 Plus");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
		capabilities.setCapability("udid", "ac5a464b5442379facabc5e15c1e7ec780c75793");
	    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	    
	}
//chesterfield---TCO1
@Test(enabled=true)
public void TC01() throws InterruptedException, IOException{
	
	FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
	int rowCount = e.getExcelRowCount(xlpath, sheet);
	System.out.println("Total Row Count : "+rowCount);
	String specfilefoldername="chesterfield";
	 System.out.println("Validating url is : "+specfilefoldername);
	 Reporter.log("Validating the url is : "+specfilefoldername);
	    
	for(int i=0;i<rowCount;i++) {
		String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
		//Homepage Action
		if(col3.contains("TC01_Homepage")) {
			System.out.println("test area from excel is :"+col3);
			baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
			String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
			f.check_baseurl(driver, baseurl);
			f.click_menuimage(driver);
			f.click_homebutton();
			act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
			Reporter.log("Homepage menu item completed");
			Reporter.log("===============================================");
			System.out.println("===========================================");
		}
		//Aboutus Action
		else if(col3.contains("TC01_AboutUs")){
			System.out.println("test area from excel is :"+col3);
			String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
			f.click_menuimage(driver);
			f.click_aboutusbutton();
			act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
			Reporter.log("Aboutus menu item RWD completed");
			Reporter.log("===============================================");
			System.out.println("=============================================");
		}
		//MsgFromPlantMngr Action
		else if(col3.contains("TC01_MessageFromPlantManager")){
			System.out.println("test area from excel is :"+col3);
			String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
			f.click_menuimage(driver);
			f.click_MsgFromPlantMngrbutton();
			act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
			Reporter.log("MsgfromPlantMngr menu item completed");
			Reporter.log("===============================================");
			System.out.println("=============================================");
		}
	  
	}

  }

//uopbatonrouge---TC02
@Test(enabled=true)
public void TC02() throws InterruptedException, IOException{
    
    FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
    int rowCount = e.getExcelRowCount(xlpath, sheet);
    System.out.println("Total Row Count : "+rowCount);
    String specfilefoldername="uopbatonrouge";
    System.out.println("Validating url is : "+specfilefoldername);
    Reporter.log("Validating the url is : "+specfilefoldername);
    
    for(int i=0;i<rowCount;i++) {
        String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
        
        //Homepage Action
        if(col3.contains("TC02_Home")) {
        	System.out.println("test area from excel is :"+col3);
            baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
            String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
            f.check_baseurl(driver, baseurl);
            f.click_menuimage(driver);
            f.click_homebutton();
            act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
            Reporter.log("Homepage menu item RWD completed");
            Reporter.log("===============================================");
            System.out.println("===========================================");
        }
        
        //Aboutus Action
        else if(col3.contains("TC02_Aboutus")){
        	System.out.println("test area from excel is :"+col3);
            String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
            f.click_menuimage(driver);
            f.click_aboutusbutton();
            act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
            Reporter.log("Aboutus menu item RWD completed");
            Reporter.log("===============================================");
            System.out.println("=============================================");
        }
        
        //MsgFromPlantMngr Action
        else if(col3.contains("TC02_MessageFromPlantManager")){
        	System.out.println("test area from excel is :"+col3);
            String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
            f.click_menuimage(driver);
            f.click_MsgFromPlantMngrbutton();
            act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
            Reporter.log("MsgfromPlantMngr menu item RWD and functionallty completed");
            Reporter.log("===============================================");
            System.out.println("=============================================");
        }
        
        //InourCommunity Action
        else if(col3.contains("TC02_InourCommunity")){
        	System.out.println("test area from excel is :"+col3);
            String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
            f.click_menuimage(driver);
            f.click_InOurCommunity();
            act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
            Reporter.log("InOurCommunity menu item RWD and functionallty completed");
            Reporter.log("===============================================");
            System.out.println("=============================================");
        }
    }
  }

//metropolisworks
@Test(enabled=true)
public void TC03() throws InterruptedException, IOException{
    
    FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
    int rowCount = e.getExcelRowCount(xlpath, sheet);
    System.out.println("Total Row Count : "+rowCount);
    String specfilefoldername="metropolisworks";
    System.out.println("Validating url is : "+specfilefoldername);
    Reporter.log("Validating the url is : "+specfilefoldername);
    
    for(int i=0;i<rowCount;i++) {
        String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
        
        //Homepage Action 
        if(col3.contains("TC03_Home")) {
        	System.out.println("test area from excel is : "+col3);
            baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
        	String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        	f.check_baseurl(driver, baseurl);
        	f.click_menuimage(driver);
        	f.click_homebutton();
        	act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        	Reporter.log("Homepage menu item RWD completed");
        	Reporter.log("===============================================");
        	System.out.println("===========================================");
        }
        
        //Aboutus Action
        else if(col3.contains("TC03_Aboutus")){
        	System.out.println("test area from excel is :"+col3);
            String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
            f.click_menuimage(driver);
            f.click_aboutusbutton();
            act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
            Reporter.log("Aboutus menu item RWD completed");
            Reporter.log("===============================================");
            System.out.println("=============================================");
        }
        
      //Aboutus/SafetyOverview Action
        else if(col3.contains("TC03_SafetyOverview")){
        	System.out.println("test area from excel is :"+col3);
            String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
            f.click_menuimage(driver);
            f.click_Aboutus_Collapse(driver);
            f.click_Safety_Overview();
            Thread.sleep(3000);
            act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
            Reporter.log("Aboutus/SafetyOverview menu item RWD completed");
            Reporter.log("===============================================");
            System.out.println("=============================================");
        }
        
        //News Action
        else if(col3.contains("TC03_News")){
        	System.out.println("test area from excel is :"+col3);
            String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
            f.click_menuimage(driver);
            f.click_News();
            act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
            Reporter.log("News menu item RWD completed");
            Reporter.log("===============================================");
            System.out.println("=============================================");
        }
        
        //MsgFromPlantMngr Action
        else if(col3.contains("TC03_MessageFromPlantManager")){
        	System.out.println("test area from excel is :"+col3);
            String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
            f.click_menuimage(driver);
            f.click_MsgFromPlantMngrbutton();
            act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
            Reporter.log("MsgfromPlantMngr menu item RWD completed");
            Reporter.log("===============================================");
            System.out.println("=============================================");
        }
        
        //InourCommunity Action
        else if(col3.contains("TC03_InOurCommunity")){
        	System.out.println("test area from excel is :"+col3);
            String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
            f.click_menuimage(driver);
            f.click_InOurCommunity();
            act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
            Reporter.log("InOurCommunity menu item RWD completed");
            Reporter.log("===============================================");
            System.out.println("=============================================");
        }
    }
  }

//safyrpharmapackaging--TC04
@Test(enabled=true)
public void TC04() throws InterruptedException, IOException{
  
  FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
  int rowCount = e.getExcelRowCount(xlpath, sheet);
  System.out.println("Total Row Count : "+rowCount);
  String specfilefoldername="safyrpharmapackaging";
  System.out.println("Validating url is : "+specfilefoldername);
  Reporter.log("Validating the url is : "+specfilefoldername);
  
  for(int i=0;i<rowCount;i++) {
      String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
      
      //Homepage Action 
      if(col3.contains("TC04_Home")) {
      	System.out.println("test area from excel is : "+col3);
          baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
          String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
          f.check_baseurl(driver, baseurl);
          f.click_menuimage(driver);
          f.click_homebutton();
          act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
          Reporter.log("Homepage menu item RWD completed");
          Reporter.log("===============================================");
          System.out.println("===========================================");
      }
      
      
     //safyr-film Action
      else if(col3.contains("TC04_safyr_film")){
      	System.out.println("test area from excel is :"+col3);
          String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
          f.click_menuimage(driver);
          f.click_Safyr_Film();
          act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
          Reporter.log("safyr-film menu item RWD completed");
          Reporter.log("===============================================");
          System.out.println("=============================================");
      }
      
      //Aboutus Action
      else if(col3.contains("TC04_Aboutus")){
      	System.out.println("test area from excel is :"+col3);
          String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
          f.click_menuimage(driver);
          f.click_aboutusbutton();
          act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
          Reporter.log("Aboutus menu item RWD completed");
          Reporter.log("===============================================");
          System.out.println("=============================================");
      }
      
      //Contactus Action
      else if(col3.contains("TC04_Contactus")){
      	System.out.println("test area from excel is :"+col3);
          String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
          f.click_menuimage(driver);
          f.click_Contactus();
          act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
          Reporter.log("Contactus menu item RWD completed");
          Reporter.log("===============================================");
          System.out.println("=============================================");
      }
  }
}

//shreveport --TC05
@Test(enabled=true)
public void TC05() throws InterruptedException, IOException{
  
  FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
  int rowCount = e.getExcelRowCount(xlpath, sheet);
  System.out.println("Total Row Count : "+rowCount);
  String specfilefoldername="shreveport";
  System.out.println("Validating url is : "+specfilefoldername);
  Reporter.log("Validating the url is : "+specfilefoldername);
  
  for(int i=0;i<rowCount;i++) {
      String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
      
      //Homepage Action 
      if(col3.contains("TC05_Home")) {
      	System.out.println("test area from excel is : "+col3);
          baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
          String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
          f.check_baseurl(driver, baseurl);
          f.click_menuimage(driver);
          f.click_homebutton();
          act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
          Reporter.log("Homepage menu item RWD completed");
          Reporter.log("===============================================");
          System.out.println("===========================================");
      }
      
      //Aboutus Action
      else if(col3.contains("TC05_Aboutus")){
      	System.out.println("test area from excel is :"+col3);
          String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
          f.click_menuimage(driver);
          f.click_aboutusbutton();
          act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
          Reporter.log("Aboutus menu item RWD  completed");
          Reporter.log("===============================================");
          System.out.println("=============================================");
      }
      
      
      //MessageFromPlantManager Action
       else if(col3.contains("TC05_MessageFromPlantManager")){
       	System.out.println("test area from excel is :"+col3);
           String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
           f.click_menuimage(driver);
           f.click_MsgFromPlantMngrbutton();
           act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
           Reporter.log("MessageFromPlantManager menu item RWD completed");
           Reporter.log("===============================================");
           System.out.println("=============================================");
       }
      
      //InOurComminity Action
      else if(col3.contains("TC05_InOurComminity")){
      	System.out.println("test area from excel is :"+col3);
          String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
          f.click_menuimage(driver);
          f.click_InOurCommunity();
          act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
          Reporter.log("InOurComminity menu item RWD completed");
          Reporter.log("===============================================");
          System.out.println("=============================================");
      }
      
      //Careers Action
      else if(col3.contains("TC05_Careers")){
      	System.out.println("test area from excel is :"+col3);
          String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
          f.click_menuimage(driver);
          f.click_Careers();
          act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
          Reporter.log("Careers menu item RWD completed");
          Reporter.log("===============================================");
          System.out.println("=============================================");
      }
  }
}

//frankford --TC06
@Test(enabled=true)
public void TC06() throws InterruptedException, IOException{

FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="frankford";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
    String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
    
    //Homepage Action 
    if(col3.contains("TC06_Home")) {
    	System.out.println("test area from excel is : "+col3);
        baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.check_baseurl(driver, baseurl);
        f.click_menuimage(driver);
        f.click_homebutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Homepage menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("===========================================");
    }
    
    //Aboutus Action
    else if(col3.contains("TC06_Aboutus")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_aboutusbutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Aboutus menu item RWD and functionallty completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    
    //MessageFromPlantManager Action
     else if(col3.contains("TC06_MessageFromPlantManager")){
     	System.out.println("test area from excel is :"+col3);
         String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
         f.click_menuimage(driver);
         f.click_MsgFromPlantMngrbutton();
         act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
         Reporter.log("MessageFromPlantManager menu item RWD completed");
         Reporter.log("===============================================");
         System.out.println("=============================================");
     }
    
    //InOurComminity Action
    else if(col3.contains("TC06_InOurComminity")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_InOurCommunity();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("InOurComminity menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //News Action
    else if(col3.contains("TC06_News")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_News();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("News menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
}
}

//colonialheights TC07
@Test(enabled=true)
public void TC07() throws InterruptedException, IOException{

FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="colonialheights";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
    String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
    
    //Homepage Action 
    if(col3.contains("TC07_Home")) {
    	System.out.println("test area from excel is : "+col3);
        baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.check_baseurl(driver, baseurl);
        f.click_menuimage(driver);
        Thread.sleep(2000);
        f.click_homebutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Homepage menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("===========================================");
    }
    
    //Aboutus Action
    else if(col3.contains("TC07_Aboutus")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_aboutusbutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Aboutus menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    
    //MessageFromPlantManager Action
     else if(col3.contains("TC07_MessageFromPlantMngr")){
     	System.out.println("test area from excel is :"+col3);
         String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
         f.click_menuimage(driver);
         f.click_MsgFromPlantMngrbutton();
         act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
         Reporter.log("MessageFromPlantManager menu item RWD completed");
         Reporter.log("===============================================");
         System.out.println("=============================================");
     }
    
    //InOurComminity Action
    else if(col3.contains("TC07_InOurComminity")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_InOurCommunity();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("InOurComminity menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //News Action
    else if(col3.contains("TC07_News")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_News();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("News menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
  //Careers Action
    else if(col3.contains("TC07_Careers")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_Careers();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Careers menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
}
}


//geismar  TC08
@Test(enabled=true)
public void TC08() throws InterruptedException, IOException{

FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="geismar";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
    String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
    
    //Homepage Action 
    if(col3.contains("TC08_Home")) {
    	System.out.println("test area from excel is : "+col3);
        baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.check_baseurl(driver, baseurl);
        f.click_menuimage(driver);
        f.click_homebutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Homepage menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("===========================================");
    }
    
    //Aboutus Action
    else if(col3.contains("TC08_Aboutus")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_aboutusbutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Aboutus menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    
    //MessageFromPlantManager Action
     else if(col3.contains("TC08_MessageFromPlantMngr")){
     	System.out.println("test area from excel is :"+col3);
         String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
         f.click_menuimage(driver);
         f.click_MsgFromPlantMngrbutton();
         act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
         Reporter.log("MessageFromPlantManager menu item RWD completed");
         Reporter.log("===============================================");
         System.out.println("=============================================");
     }
    
    //InOurComminity Action
    else if(col3.contains("TC08_InOurComminity")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_InOurCommunity();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("InOurComminity menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //Careers Action
    else if(col3.contains("TC08_Careers")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_Careers();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Careers menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
}
}

//pottsville  TC09
@Test(enabled=true)
public void TC09() throws InterruptedException, IOException{

FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="pottsville";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
    String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
    
    //Homepage Action 
    if(col3.contains("TC09_Home")) {
    	System.out.println("test area from excel is : "+col3);
        baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.check_baseurl(driver, baseurl);
        f.click_menuimage(driver);
        f.click_homebutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Homepage menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("===========================================");
    }
    
    //Aboutus Action
    else if(col3.contains("TC09_Aboutus")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_aboutusbutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Aboutus menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    
    //MessageFromPlantManager Action
     else if(col3.contains("TC09_MessageFromPlantMngr")){
     	System.out.println("test area from excel is :"+col3);
         String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
         f.click_menuimage(driver);
         f.click_MsgFromPlantMngrbutton();
         act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
         Reporter.log("MessageFromPlantManager menu item RWD completed");
         Reporter.log("===============================================");
         System.out.println("=============================================");
     }
    
    //InOurComminity Action
    else if(col3.contains("TC09_InOurComminity")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_InOurCommunity();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("InOurComminity menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //Careers Action
    else if(col3.contains("TC09_Careers")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_Careers();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Careers menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
}
}

//indiatechnologycenter TC10
@Test(enabled=true)
public void TC10() throws InterruptedException, IOException{

FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="indiatechnologycenter";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
    String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
    
    //Homepage Action 
    if(col3.contains("TC10_Home")) {
    	System.out.println("test area from excel is : "+col3);
        baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.check_baseurl(driver, baseurl);
        f.click_menuimage(driver);
        f.click_homebutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Homepage menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("===========================================");
    }
    
    //Aboutus Action
    else if(col3.contains("TC10_Aboutus")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_aboutusbutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Aboutus menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    
    //MessageFromPlantManager Action
     else if(col3.contains("TC10_MessageFromPlantMngr")){
     	System.out.println("test area from excel is :"+col3);
         String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
         f.click_menuimage(driver);
         f.click_MsgfromSiteLeader();
         act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
         Reporter.log("MessageFromPlantManager menu item RWD completed");
         Reporter.log("===============================================");
         System.out.println("=============================================");
     }
    
    //InOurComminity Action
    else if(col3.contains("TC10_InOurComminity")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_InOurCommunity();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("InOurComminity menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //News Action
    else if(col3.contains("TC10_News")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_News();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("News menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //Careers Action
    else if(col3.contains("TC10_Careers")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_Careers();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Careers menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
}
}

//buffalo TC11
@Test(enabled=true)
public void TC11() throws InterruptedException, IOException{

FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="buffalo";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
    String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
    
    //Homepage Action 
    if(col3.contains("TC11_Home")) {
    	System.out.println("test area from excel is : "+col3);
        baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.check_baseurl(driver, baseurl);
        f.click_menuimage(driver);
        f.click_homebutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Homepage menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("===========================================");
    }
    
    //Aboutus Action
    else if(col3.contains("TC11_Aboutus")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_aboutusbutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Aboutus menu item RWD  completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //Aboutus/History Action
    else if(col3.contains("TC11_History")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        Thread.sleep(2000);
        f.click_Aboutus_Collapse(driver);
        f.click_History();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Aboutus menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //MessageFromSiteLeader Action
     else if(col3.contains("TC11_MessageFromSiteLeader")){
     	System.out.println("test area from excel is :"+col3);
         String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
         f.click_menuimage(driver);
         f.click_MsgfromSiteLeader();
         act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
         Reporter.log("MessageFromPlantManager menu item RWD completed");
         Reporter.log("===============================================");
         System.out.println("=============================================");
     }
    
    //InOurComminity Action
    else if(col3.contains("TC11_InOurCommunity")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_InOurCommunity();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("InOurComminity menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //News Action
    else if(col3.contains("TC11_News")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_News();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("News menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
   
}
}

//claymont   TC12
@Test(enabled=true)
public void TC12() throws InterruptedException, IOException{

FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="claymont";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
    String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
    
    //Homepage Action 
    if(col3.contains("TC12_Home")) {
    	System.out.println("test area from excel is : "+col3);
        baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.check_baseurl(driver, baseurl);
        f.click_menuimage(driver);
        f.click_homebutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Homepage menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("===========================================");
    }
    
    //Aboutus Action
    else if(col3.contains("TC12_Aboutus")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_aboutusbutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Aboutus menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //MessageFromPlanManager Action
     else if(col3.contains("TC12_MessageFromPlantMngr")){
     	System.out.println("test area from excel is :"+col3);
         String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
         f.click_menuimage(driver);
         f.click_MsgFromPlantMngrbutton();
         act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
         Reporter.log("MessageFromPlantManager menu item RWD completed");
         Reporter.log("===============================================");
         System.out.println("=============================================");
     }
    
    //InOurComminity Action
    else if(col3.contains("TC12_InOurComminity")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_InOurCommunity();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("InOurComminity menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //Careers Action
    else if(col3.contains("TC12_Careers")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_Careers();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Careers menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
}
}

//hopewell  TC13
@Test(enabled=true)
public void TC13() throws InterruptedException, IOException{
FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="hopewell";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
    String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
    
    //Homepage Action 
    if(col3.contains("TC13_Home")) {
    	System.out.println("test area from excel is : "+col3);
        baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.check_baseurl(driver, baseurl);
        f.click_menuimage(driver);
        f.click_homebutton();
        Thread.sleep(5000);
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Homepage menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("===========================================");
    }
    
    //Aboutus Action
    else if(col3.contains("TC13_Aboutus")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_aboutusbutton();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Aboutus menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //MessageFromPlanManager Action
     else if(col3.contains("TC13_MessageFromPlantMngr")){
     	System.out.println("test area from excel is :"+col3);
         String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
         f.click_menuimage(driver);
         f.click_MsgFromPlantMngrbutton();
         act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
         Reporter.log("MessageFromPlantManager menu item RWD completed");
         Reporter.log("===============================================");
         System.out.println("=============================================");
     }
    
    //InOurComminity Action
    else if(col3.contains("TC13_InOurComminity")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_InOurCommunity();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("InOurComminity menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    //News Action
    else if(col3.contains("TC13_News")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_News();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("News menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
    
    //Careers Action
    else if(col3.contains("TC13_Careers")){
    	System.out.println("test area from excel is :"+col3);
        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
        f.click_menuimage(driver);
        f.click_Careers();
        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
        Reporter.log("Careers menu item RWD completed");
        Reporter.log("===============================================");
        System.out.println("=============================================");
    }
   
}
}

//fp-batonrouge
@Test(enabled=true)
public void TC14() throws InterruptedException, IOException{

FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="fp-batonrouge";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);

//Homepage Action 
if(col3.contains("TC14_Home")) {
	System.out.println("test area from excel is : "+col3);
    baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
    System.out.println(baseurl);
    String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
    f.check_baseurl(driver, baseurl);
    f.click_menuimage(driver);
    f.click_homebutton();
    Thread.sleep(5000);
    act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
    Reporter.log("Homepage menu RWD completed");
    Reporter.log("===============================================");
    System.out.println("===========================================");
}

//Aboutus Action
else if(col3.contains("TC14_AboutUs")){
	System.out.println("test area from excel is :"+col3);
	String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
	f.click_menuimage(driver);
    f.click_aboutusbutton();
    Thread.sleep(5000);
    act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
    Reporter.log("Aboutus menu RWD completed");
    Reporter.log("===============================================");
    System.out.println("=============================================");
}

//MessageFromPlanManager Action
 else if(col3.contains("TC14_MessageFromPlantMngr")){
 	System.out.println("test area from excel is :"+col3);
 	String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
 	 f.click_menuimage(driver);
     f.click_MsgFromPlantMngrbutton();
     Thread.sleep(5000);
     act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
     Reporter.log("MessageFromPlantManager RWD completed");
     Reporter.log("===============================================");
     System.out.println("=============================================");
 }

//InOurComminity Action
else if(col3.contains("TC14_InOurCommunity")){
	System.out.println("test area from excel is :"+col3);
	String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
	f.click_menuimage(driver);
    f.click_InOurCommunity();
    Thread.sleep(5000);
    act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
    Reporter.log("InOurComminity RWD completed");
    Reporter.log("===============================================");
    System.out.println("=============================================");
}
}
}

//spokane----Home pahe link 404 issue
@Test(enabled=true)
public void TC15() throws InterruptedException, IOException{
FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="spokane";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);
for(int i=0;i<rowCount;i++) {
String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);

//Homepage Action 
if(col3.contains("TC15_Home")) {
	System.out.println("test area from excel is : "+col3);
  baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
  f.check_baseurl(driver, baseurl);
  f.click_menuimage(driver);
  Thread.sleep(3000);
  f.click_homebutton();
  Thread.sleep(3000);
  act.runspecgeneral(driver,specfilefoldername,specfilefoldername,IphoneSpecPath,GalenreportPath);
  Reporter.log("Homepage menu rwd completed");
  Reporter.log("===============================================");
  System.out.println("===========================================");
}

//Aboutus Action
else if(col3.contains("TC15_AboutUs")){
	System.out.println("test area from excel is :"+col3);
	 f.click_menuimage(driver);
	 Thread.sleep(3000);
  f.click_aboutusbutton();
  Thread.sleep(3000);
  act.runspecgeneral(driver,specfilefoldername,specfilefoldername,IphoneSpecPath,GalenreportPath);
  Reporter.log("Aboutus menu rwd completed");
  Reporter.log("===============================================");
  System.out.println("=============================================");
}

//MessageFromPlanManager Action
else if(col3.contains("TC15_MessageFromPlantMngr")){
	System.out.println("test area from excel is :"+col3);
	f.click_menuimage(driver);
	Thread.sleep(3000);
   f.click_MsgFromPlantMngrbutton();
   Thread.sleep(3000);
   act.runspecgeneral(driver,specfilefoldername,specfilefoldername,IphoneSpecPath,GalenreportPath);
   Reporter.log("MessageFromPlantManager rwd completed");
   Reporter.log("===============================================");
   System.out.println("=============================================");
}

//InOurComminity Action
else if(col3.contains("TC15_InOurCommunity")){
	System.out.println("test area from excel is :"+col3);
	f.click_menuimage(driver);
	  Thread.sleep(3000);
  f.click_InOurCommunity();
  Thread.sleep(3000);
  act.runspecgeneral(driver,specfilefoldername,specfilefoldername,IphoneSpecPath,GalenreportPath);
  Reporter.log("InOurComminity rwd completed");
  Reporter.log("===============================================");
  System.out.println("=============================================");
}
}
}

//Brazing
@Test(enabled=true)
public void TC16() throws InterruptedException, IOException{
FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
int rowCount = e.getExcelRowCount(xlpath, sheet);
System.out.println("Total Row Count : "+rowCount);
String specfilefoldername="spokane";
System.out.println("Validating url is : "+specfilefoldername);
Reporter.log("Validating the url is : "+specfilefoldername);

for(int i=0;i<rowCount;i++) {
String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);

//Homepage Action 
if(col3.contains("TC16_Home")) {
	System.out.println("test area from excel is : "+col3);
  baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
  f.check_baseurl(driver, baseurl);
  f.click_homebutton();
  f.check_sliderItem(driver);
  f.check_ActiveLinks_Homepage(driver);
  f.ckeck_sharebutton();
  Thread.sleep(10000);
  f.check_search_button(driver);
  Reporter.log("Homepage menu functionallty completed");
  Reporter.log("===============================================");
  System.out.println("===========================================");
}
//Products
else if(col3.contains("TC16_Products")){
	System.out.println("test area from excel is :"+col3);
f.click_Products();
f.check_InsidePages_homebutton(driver, baseurl);
Reporter.log("Aboutus menu functionallty completed");
Reporter.log("===============================================");
System.out.println("=============================================");
}
//Events
else if(col3.contains("TC16_Events")){
	System.out.println("test area from excel is :"+col3);
	  f.click_Events();
	  f.check_InsidePages_homebutton(driver, baseurl);
Reporter.log("Eevents menu functionallty completed");
Reporter.log("===============================================");
System.out.println("=============================================");
}

//Aboutus Action
else if(col3.contains("TC16_AboutUs")){
	System.out.println("test area from excel is :"+col3);
  f.click_aboutusbutton();
  f.check_InsidePages_homebutton(driver, baseurl);
  Reporter.log("Aboutus menu functionallty completed");
  Reporter.log("===============================================");
  System.out.println("=============================================");
}

//Recources Action
else if(col3.contains("TC16_Recources")){
	System.out.println("test area from excel is :"+col3);
	
   f.click_Resources();
   Reporter.log("Recources  and functionallty completed");
   Reporter.log("===============================================");
   System.out.println("=============================================");
}

//contactus Action
else if(col3.contains("TC16_ContactUs")){
	System.out.println("test area from excel is :"+col3);
	 
  f.click_Contactus();
  Reporter.log("InOurComminity functionallty completed");
  Reporter.log("===============================================");
  System.out.println("=============================================");
}
}
}

//authentication
@Test(enabled=true)
public void TC17() throws InterruptedException, IOException{
	FunctionalAction f=PageFactory.initElements(driver, FunctionalAction.class);
	UserValidation v=PageFactory.initElements(driver, UserValidation.class);
	
	int rowCount = e.getExcelRowCount(xlpath, sheet);
	System.out.println("Total Row Count : "+rowCount);
	String specfilefoldername="authentication";
	System.out.println("Validating url is : "+specfilefoldername);
	Reporter.log("Validating the url is : "+specfilefoldername);

	for(int i=0;i<rowCount;i++) {
	    String col3 = e.getExcelCellValue(xlpath, sheet, i, 3);
	    
	    //Signup Action 
	    if(col3.contains("TC17_Signup")) {
	    	System.out.println("test area from excel is : "+col3);
	        baseurl=e.getExcelCellValue(xlpath, sheet, i, 2);
	        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
	        f.check_baseurl(driver, baseurl);
	        v.signup();
	        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
	        Reporter.log("Signup item RWD completed");
	        Reporter.log("===============================================");
	        System.out.println("===========================================");
	    }
	    //Homepage
	    else if(col3.contains("TC17_Homepage")) {
	    	System.out.println("test area from excel is : "+col3);
	        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
	        f.click_menuimage(driver);
	        Thread.sleep(3000);
	        f.click_homebutton();
	        Thread.sleep(3000);
	        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
	        Reporter.log("Homepage item RWD completed");
	        Reporter.log("===============================================");
	        System.out.println("===========================================");
	    }
	    //Product Information
	    else if(col3.contains("TC17_ProductInformation")) {
	    	System.out.println("test area from excel is : "+col3);
	        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
	        f.click_menuimage(driver);
	        Thread.sleep(3000);
	        f.check_Product_Information();
	        Thread.sleep(3000);
	        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
	        Reporter.log("Product Information item RWD completed");
	        Reporter.log("===============================================");
	        System.out.println("===========================================");
	    }
	    //Documents
	    else if(col3.contains("TC17_Documents")) {
	    	System.out.println("test area from excel is : "+col3);
	        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
	        f.click_menuimage(driver);
	        Thread.sleep(3000);
	        f.check_Document();
	        Thread.sleep(3000);
	        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
	        Reporter.log("Documents item RWD completed");
	        Reporter.log("===============================================");
	        System.out.println("===========================================");
	    }
	    //About us
	    else if(col3.contains("TC17_AboutUs")) {
	    	System.out.println("test area from excel is : "+col3);
	        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
	        f.click_menuimage(driver);
	        Thread.sleep(3000);
	        f.click_aboutusbutton();
	        Thread.sleep(3000);
	        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
	        Reporter.log("AboutUS item RWD completed");
	        Reporter.log("===============================================");
	        System.out.println("===========================================");
	    }
	    //Contact us
	    else if(col3.contains("TC17_ContactUs")) {
	    	System.out.println("test area from excel is : "+col3);
	        String specfile=e.getExcelCellValue(xlpath, sheet, i, 4);
	        f.click_menuimage(driver);
	        Thread.sleep(3000);
	        f.click_Contactus();
	        Thread.sleep(3000);
	        act.runspecgeneral(driver,specfilefoldername,specfile,IphoneSpecPath,GalenreportPath);
	        Reporter.log("Contact us item RWD completed");
	        Reporter.log("===============================================");
	        System.out.println("===========================================");
	    }
	}
}



//close the driver
@AfterMethod
public void close(){
	driver.close();
}
}
