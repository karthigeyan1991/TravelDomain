package org.makemytrip;

import java.awt.AWTException;

import org.locators.HomePageLocator;
import org.utilityclass.UtilityClass;

public class MakeMyTrip extends UtilityClass  {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		UtilityClass global = new UtilityClass();
		
		global.getDriver();
		global.launchUrl("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|262047047498&s_kwcid=AL!1631!3!262047047498!e!!g!!makemytrip&ef_id=CjwKCAiA9vOABhBfEiwATCi7GFmUtEPjY4b2EE2YvKEAFd9ZHLAJWjfqSoUxSd4YxbGE0Rukn64FUhoCmJsQAvD_BwE:G:s&gclid=CjwKCAiA9vOABhBfEiwATCi7GFmUtEPjY4b2EE2YvKEAFd9ZHLAJWjfqSoUxSd4YxbGE0Rukn64FUhoCmJsQAvD_BwE");
		
		HomePageLocator home = new HomePageLocator();
		
		
		Thread.sleep(6000);
		global.btnClick(home.getFromCity());
		Thread.sleep(15000);
		//home.btnClick(home.getFromCitySearchBar());
		global.robot();
		
		Thread.sleep(6000);
		
		global.jsClick(home.getToCity());
		Thread.sleep(15000);
		//home.btnClick(home.getToCitySearchBar());
		global.robot();
		
		Thread.sleep(6000);
		
		global.btnClick(home.getSearchBtn());
		
		{
			System.out.println("2");
		}
		
	
	}

	private static void demoClass() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
