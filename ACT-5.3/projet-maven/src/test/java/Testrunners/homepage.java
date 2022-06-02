package Testrunners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homepage {
	WebDriver driver=null;
	@Given("Browser is open")
	public void browser_is_open() {
	
	
	System.out.println("Inside Step - browser is open");
	
	String projectPath = System.getProperty("user.dir");
	System.out.println("Project path is : "+projectPath);
	
	System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
   
	}

	@When("user write todos website link on the link bar")
	public void user_write_todos_website_link_on_the_link_bar() {
	
	driver.navigate().to("http://todomvc.com/examples/react/#/");
	

	}

	@Then("user navigate to home page of todo")
	public void user_navigate_to_home_page_of_todo() {
	
	}
	@Given("home page of todo is open")
	public void home_page_of_todo_is_open() {


	}

	@When("user write his activity todo")
	public void user_write_his_activity_todo() {
	
		

	}

	@When("press enter")
	public void press_enter() {


	}

	@Then("The activity is shown in todo list")
	public void the_activity_is_shown_in_todo_list() {


	}



}
