package Automate.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class WelcomeScreenGuest_OR {

    public static class Locator{


        public static By welcomeTitle = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/header/h1");

        public static By signInTitle = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/header/p");

        public static By signInLink = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/header/button");

        public static By rewardsCTA = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/div/nav/span[1]/span");

        public static By inboxCTA = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/div/nav/span[2]/div/div/div/img");

        public static By orderNowButton = By.xpath("//button[contains(text(),'Order Now')]");


    }


    public static class UIElementConstant{

        public static String signInLink = "Sign in";

        public static String rewardsCTA = "MOD Pizza Rewards";

        public static String orderNowButton = "Order Now";

    }
}
