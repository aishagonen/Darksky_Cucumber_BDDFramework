package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utils.BasePage;
import utils.ElementUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodayPage {

    public SoftAssert softAssert = new SoftAssert();

    public By todayBtn = By.xpath("//span[contains(text(),'Today')]");
                    //By.xpath("//span[contains(@class, 'name')][1]");
    public By tempList =  By.xpath("//div[@id='timeline']//div[@class='temps']//span");
                    //By.xpath("//div[@class='dayDetails revealed']//div[@class='temps']");
                    //By.xpath("//div[2]/div[2]/div/div/div[4]/span");
                    //By.xpath("(//div[@class='temps'])[2]//span//span");
    public By minTempActual = By.className("low-temp-text");
                     //By.xpath("//span[@class='minTemp'][1]");
    public By maxTempActual = By.className("high-temp-text");
                     //By.xpath("//span[@class='maxTemp'][1]");



    public void clickToday() {
        ElementUtil.clickElementByJS(todayBtn);
    }

    public void verifyLowHighTemp() {
        try {
            List<WebElement> list = BasePage.get().findElements(By.xpath("//div[@id='timeline']//div[@class='temps']//span"));
            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            for (WebElement element : list) arrayList.add(Integer.parseInt(element.getText().replaceAll("\\D+", "")));
            Collections.sort(arrayList);
            System.out.println(arrayList);

            int expectedLowValue = arrayList.get(0);
            System.out.println("Lowest temperature is: " + arrayList.get(0));
            int actualLowValue = Integer.parseInt((ElementUtil.webAction(minTempActual)).getText().replaceAll("\\D+", ""));

            int highIndex = arrayList.size()-1;
            System.out.println("Highest temperature is: " + arrayList.get(highIndex));

            int expectedHighValue = arrayList.get(arrayList.size()-1);
            int actualHighValue= Integer.parseInt((ElementUtil.webAction(maxTempActual)).getText().replaceAll("\\D+", ""));

            softAssert.assertEquals(actualHighValue, expectedHighValue, "Not verified!");
            softAssert.assertEquals(actualLowValue, expectedLowValue, "Not verified!");

            softAssert.assertAll();
        } catch (NullPointerException e) {
        System.out.println("Find me! Hahhahhaa!");}
    }

}
