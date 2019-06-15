package day0608;

import java.util.ArrayList;

public interface WebDriver {
	public static final String PURPOSE = "Automate Brower";
	
	  public abstract void openBrowser();

	  public abstract void navigateTo(String url);

	  public abstract void quit();

	  public abstract String findElementByID(int id);

	  public abstract ArrayList<String> findElementByTagName(String tagName);

	  // DEFAULT METHOD 
	  public default void clickButton(String name){
	    
	    System.out.println("DO YOUR IMPLEMENTATION WITHOUT BREAKING");
	    
	  } 

}
