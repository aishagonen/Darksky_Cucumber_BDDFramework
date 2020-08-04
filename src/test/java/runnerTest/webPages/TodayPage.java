package runnerTest.webPages;

import org.openqa.selenium.By;

public class TodayPage extends ElementUtil {

    By todayBtn = By.xpath("//span[contains(text(),'Today')]");
            //By.xpath("//span[contains(@class, 'name')][1]");
    By minTemp = By.xpath("//span[@class='minTemp'][1]");
    By maxTemp = By.xpath("//span[@class='maxTemp'][1]");
    By minTempActual = By.xpath("//span[@class='temp'][1]");
    By maxTempActual = By.xpath("//span[@class='lowTemp swap']//span[1]");
//    By errorMessage;

    public void clickTodayBtn() {
        try {
            clickOn(todayBtn);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyLowTemp() throws InterruptedException {
        compareValues(minTemp, minTempActual, " lowest temperature: ");}

    public void verifyHighTemp() throws InterruptedException {
        compareValues(maxTemp, maxTempActual, " highest temperature: ");}





}
