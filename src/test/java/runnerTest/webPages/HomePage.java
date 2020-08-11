package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.BasePage;
import utils.ElementUtil;

import java.util.*;


public class HomePage extends ElementUtil{

    By search = By.xpath("//form[@id='searchForm']//input");
    By timeLine = By.xpath("//div[@class='hours']//span[@class='hour']//span");

    public HomePage enterCity (String city) {
       clear(search);
       webAction(search).sendKeys(city);
       webAction(search).sendKeys(Keys.RETURN);
       return new HomePage();
    }

    public void getTimeZone() {
        TimeZone timezone = TimeZone.getDefault();
        System.err.println(timezone.getID());
        Date currentDate = Calendar.getInstance(timezone).getTime();
        System.err.println(currentDate);
    }

    public void verifyTimeLine() throws InterruptedException {
        List<WebElement> list = BasePage.get().findElements(By.xpath("//div[@class='hours']//span[@class='hour']//span"));
        ArrayList<Integer> times = new ArrayList<Integer>();
        Thread.sleep(3000);
        int curr, next;
        boolean mikkemmel = true;
        for (int i = 0; i < list.size(); i++) {
            curr = Integer.parseInt(list.get(i).getText().replaceAll("\\D+", ""));
            times.add(curr);
        }
        curr = times.get(0);
        for (int i=1; i<times.size(); i++){
            next = times.get(i);
            if(next > curr){
                if(next-curr != 2){
                    mikkemmel = false;
                }
            }
            curr  = next;
        }
        Assert.assertTrue(mikkemmel, "Timeline is NOT incremented with two hours.");
    }
}
