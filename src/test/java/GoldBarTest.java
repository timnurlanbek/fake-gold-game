import Utilities.Alerts;
import Utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class GoldBarTest {
    GoldBarPage element = new GoldBarPage();


    public void setup() {
        Driver.getDriver().get("http://sdetchallenge.fetch.com/");
    }

    @Before
    public void setUp() {
        setup();
    }

    @After
    public void tearDown() {
        Driver.quit();
    }

    @Test
    public void test1 () {
        element.setLeftBowl(0, 1, 2);
        element.setRightBowl(3, 4, 5);
        element.clickWeighButton();
        String operatorSign = element.measure.getText();


        if (operatorSign.trim().equals("=")) {
            element.clickResetButton();
            element.setRightBowl(7);
            element.setLeftBowl(6);
            element.clickWeighButton();
            operatorSign = element.measure.getText().trim();
            switch (operatorSign.trim()) {
                case ">" -> {
                    element.coin7.click();
                    Alerts.positiveAlert();
                }
                case "<" -> {
                    element.coin6.click();
                    Alerts.positiveAlert();
                }
                case "=" -> {
                    element.coin8.click();
                    Alerts.positiveAlert();
                }
            }
        } else if (operatorSign.equals(">")) {
            element.clickResetButton();
            element.setRightBowl(4);
            element.setLeftBowl(3);
            element.clickWeighButton();
            operatorSign = element.measure.getText().trim();
            switch (operatorSign) {
                case "=" -> {
                    element.coin5.click();
                    Alerts.positiveAlert();
                }
                case ">" -> {
                    element.coin4.click();
                    Alerts.positiveAlert();
                }
                case "<" -> {
                    element.coin3.click();
                    Alerts.positiveAlert();
                }

            }
        } else if (operatorSign.equals("<")) {
                element.clickResetButton();
                element.setLeftBowl(0);
                element.setRightBowl(1);
                element.clickWeighButton();
                operatorSign = element.measure.getText().trim();
                if (operatorSign.equals("=")) {
                    element.coin2.click();
                    Alerts.positiveAlert();
                } else if (operatorSign.equals(">")) {
                    element.coin1.click();
                    Alerts.positiveAlert();
                } else {
                    element.coin0.click();
                    Alerts.positiveAlert();
                }
            }

        System.out.println("Number of weighs: " + element.listOfWeighs.size());
        System.out.println("List of Weighs: ");
            for (int i = 0; i < element.listOfWeighs.size(); i++) {
                System.out.println(element.listOfWeighs.get(i).getText());
            }

        }


    }
