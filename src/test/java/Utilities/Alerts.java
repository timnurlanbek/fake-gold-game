package Utilities;

import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Alerts {
    public static void positiveAlert(){
        Alert alert = Driver.getDriver().switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals("Yay! You find it!", alertText);
        System.out.println(alertText);
        alert.accept();
    }

    public static void negativeAlert(){
        Alert alert = Driver.getDriver().switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals("Yay! You find it!", alertText);
        System.out.println(alertText);
        alert.accept();
    }


}
