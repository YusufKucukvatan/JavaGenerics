package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;


public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(2) > input:nth-child(1)")
    public WebElement username;

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[5]/input[1]")
    public WebElement password;

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]")
    public WebElement signin;

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(signin);
    }

    public LoginPage open(String url){
        Driver.getDriver().get(url);
        return (LoginPage) openPage(LoginPage.class);
    }

    public HomePage login(String username, String password) {
        this.username.click();
        this.username.sendKeys(username);
        this.password.click();
        this.password.sendKeys(password);
        this.signin.click();
        return (HomePage) openPage(HomePage.class);
    }
}
