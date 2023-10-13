import Utilities.ApplicationFlow;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoldBarPage {
    public GoldBarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void clickWeighButton() {
        WebElement weighButton = Driver.getDriver().findElement(By.id("weigh"));
        weighButton.click();
        ApplicationFlow.pause(4500);
    }

    public void clickResetButton() {
        WebElement resetButton = Driver.getDriver().findElement(By.xpath("(//button[@id='reset'])[2]"));
        resetButton.click();
        ApplicationFlow.pause(900);
    }

    public void setLeftBowl(int barNumber1,int barNumber2, int barNumber3) {
        WebElement leftBowl = Driver.getDriver().findElement(By.id("left_0"));
        WebElement leftBowl1 = Driver.getDriver().findElement(By.id("left_1"));
        WebElement leftBowl2 = Driver.getDriver().findElement(By.id("left_2"));
        leftBowl.sendKeys(String.valueOf(barNumber1));
        leftBowl1.sendKeys(String.valueOf(barNumber2));
        leftBowl2.sendKeys(String.valueOf(barNumber3));
    }
    public void setLeftBowl(int barNumber1) {
        WebElement leftBowl = Driver.getDriver().findElement(By.id("left_0"));
        leftBowl.sendKeys(String.valueOf(barNumber1));
    }

    public void setRightBowl(int barNumber, int barNumber2, int barNumber3) {
        WebElement rightBowl = Driver.getDriver().findElement(By.id("right_0"));
        WebElement rightBowl1 = Driver.getDriver().findElement(By.id("right_1"));
        WebElement rightBowl2 = Driver.getDriver().findElement(By.id("right_2"));
        rightBowl.sendKeys(String.valueOf(barNumber));
        rightBowl1.sendKeys(String.valueOf(barNumber2));
        rightBowl2.sendKeys(String.valueOf(barNumber3));
    }

    public void setRightBowl(int barNumber) {
        WebElement rightBowl = Driver.getDriver().findElement(By.id("right_0"));
        rightBowl.sendKeys(String.valueOf(barNumber));
    }

    @FindBy (xpath ="//ol/li" )
    List<WebElement> listOfWeighs;

    @FindBy (xpath = "//div[@class='coins']/button[9]")
    WebElement coin8;
    @FindBy (xpath = "//div[@class='coins']/button[8]")
    WebElement coin7;
    @FindBy (xpath = "//div[@class='coins']/button[7]")
    WebElement coin6;
    @FindBy (xpath = "//div[@class='coins']/button[6]")
    WebElement coin5;
    @FindBy (xpath = "//div[@class='coins']/button[5]")
    WebElement coin4;
    @FindBy (xpath = "//div[@class='coins']/button[4]")
    WebElement coin3;
    @FindBy (xpath = "//div[@class='coins']/button[3]")
    WebElement coin2;
    @FindBy (xpath = "//div[@class='coins']/button[2]")
    WebElement coin1;
    @FindBy (xpath = "//div[@class='coins']/button[1]")
    WebElement coin0;


    @FindBy (xpath = "(//button[@id='reset'])[1]")
        WebElement measure;







}

