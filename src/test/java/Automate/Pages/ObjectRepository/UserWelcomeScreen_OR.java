package Automate.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class UserWelcomeScreen_OR {

    public static class Locator{


        public static By welcomeTitle = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/header/h1");

        public static By welcomeSubTitle = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/header/p");

        public static By myAccountButton = By.xpath("//button[contains(text(),'My Account')]");

        public static By redeemNowButton = By.xpath("//button[contains(text(),'Redeem Now')]");

        public static By recentOrderCTA = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/div/nav/span[1]/img");

        public static By rewardsCTA = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/div/nav/span[2]/span");

        public static By inboxCTA = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/div/nav/span[3]/div/div/div/img");

        public static By orderNowButton = By.xpath("//button[contains(text(),'Order Now')]");


    }


    public static class UIElementConstant{

        public static String myAccountButton = "My Account";

        public static String redeemNowButton = "Redeem Now";

        public static String rewardsCTA = "MOD Pizza Rewards";

        public static String orderNowButton = "Order Now";

    }
}
