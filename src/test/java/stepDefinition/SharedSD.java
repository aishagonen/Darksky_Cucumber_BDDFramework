package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.asserts.SoftAssert;
import utils.ElementUtil;
import utils.BasePage;
import utils.ConfigReader;
public class SharedSD {

    //Hook class
    public  ElementUtil elementUtil = new ElementUtil();
    public static Logger logger = Logger.getLogger(SharedSD.class);
    public SoftAssert softAssert = new SoftAssert();

    @Before
    public void setUp(){
        logger.info("***************************");
        logger.info("Test is starting.......!");
        ConfigReader.getProperty("browser");
        BasePage.get().get(ConfigReader.getProperty("url"));
        //BasePage.get().manage().window().fullscreen();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            logger.error("Test Failed");
            byte[] screenshot = ((TakesScreenshot)BasePage.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
            elementUtil.getScreenShot("pic");
        }else{
            logger.info("Cleanup...!");
            logger.info("Test was completed");
        }
        logger.info("*******************");
        BasePage.closeBrowser();
    }

}