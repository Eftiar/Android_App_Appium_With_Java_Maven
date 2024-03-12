package Automate.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class SignIn_OR {
	
     public static class Locator{

          public static String loginScreenTitle = "Welcome!";

          public static String loginScreenSubTitle = "Please enter your email and password to log in.";

          public static By emailField = By.xpath("//android.widget.EditText[@resource-id='identifier']");

          public static By passwordField = By.xpath("//android.widget.EditText[@resource-id='secret']");

          public static String signInButton= "Sign In";

          public static String signInWithFacebookButton = "Sign in with Facebook";

          public static By forgotPasswordLink = By.xpath("//android.view.View[@content-desc=\"Forgot Password?\"]/android.widget.TextView");

          public static By signUpLink = By.xpath("//android.view.View[@content-desc=\"Sign Up\"]/android.widget.TextView");

          public static String backCTA = "Go back";

          public static String errorLoginAlert = "Could not login:";
     }
     

     public static class UIElementConstant{

          public static String loginScreenTitle = "Welcome!";

          public static String loginScreenSubTitle = "Please enter your email and password to log in.";

          public static String emailField = "Email";

          public static String passwordField = "Password";

          public static String signInButton = "Sign In";

          public static String signInWithFacebookButton = "Sign in with Facebook";

          public static String forgotPasswordLink = "Forgot Password?";

          public static String signUpLink = "Sign Up";

          public static String errorLoginAlert = "Could not login: The user credentials were incorrect.";


     }
     
}
