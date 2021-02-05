package org.utilityclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	
	public static WebDriver driver;
	
	
	public  void getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAI_BABA\\Desktop\\JAVA_SELENIUM\\AdactinHotel\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	public void launchUrl(String url) {
		driver.get(url);
		}
	
	public void enterText(WebElement element,String data) {
		element.sendKeys(data);		
		}
	public void btnClick(WebElement element) {
		element.click();		
	}
	
	public String readFromExcel(String sheet1,int rowNo , int cellNo) throws IOException {
		File file = new File("C:\\Users\\SAI_BABA\\Desktop\\JAVA_SELENIUM\\AdactinHotel\\ExcelFile\\Excel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(sheet1);
		int no = sheet.getPhysicalNumberOfRows();
		Row row = sheet.getRow(rowNo);
		int noo = row.getPhysicalNumberOfCells();
		Cell cell = row.getCell(cellNo);
			
		@SuppressWarnings("deprecation")
		int type = cell.getCellType();
		
							
				if(type==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
					return value;
				}
				else if (DateUtil.isCellDateFormatted(cell)){
					Date date = cell.getDateCellValue();
					SimpleDateFormat form = new SimpleDateFormat("dd-MM-YYYY");
					
					String value = form.format(date);
					System.out.println(value);
					return value;
				}
				else
				{
					double doub = cell.getNumericCellValue();
					long l = (long) doub;
					String value= String.valueOf(l);
					System.out.println(value);
					return value;
				}	
	}	
	
	
		public void dropDown(WebElement drop,int index)
		{
			Select c = new Select(drop);
			c.selectByIndex(index);
			
		
		}
		
		public void doubleClick(WebElement click)
		{
			Actions acc = new Actions(driver);
			acc.doubleClick(click).perform();
			
		}
		
		public void robot() throws AWTException
		{
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

		
		public void robotTo() throws AWTException
		{
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public void jsClick(WebElement element)
		{
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].click()",element );
			
			
		}
	

}
