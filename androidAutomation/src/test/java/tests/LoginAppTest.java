package tests;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.context.annotation.Description;

import screens.DashBoardScreen;
import screens.LoginScreen;
import util.tests.BaseMobileTest;

public class LoginAppTest extends BaseMobileTest {

	/**
	 * Verify something.
	 */
	@Description(value = "test of something ID:0001")
	@Test()
	public void testOfSomething() {
		log.info("testOfSomething");
		DashBoardScreen dashBoard = loadDashBoardScreen();
		LoginScreen login = dashBoard.goToLoginScreen();
		login.fillInLoginData("eliana.taborda1@globant.com", "Password123*");
		//AndroidElement loginButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\'Sign In to Your Account, Alert: Please enter a valid password.\']"));
		//loginButton.click();
		AndroidElement menuProfile = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More Options, Tab, 5of5, Features shopping, photos, mobile orders, tickets, chat with us, help and your profile.\"]"));
		menuProfile.click();
		AndroidElement profileUser = driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"My Profile button\"]/android.widget.TextView[2]"));
		profileUser.click();
		Assert.assertSame("My profile", profileUser);

	}

}
