package stepDef;

import org.junit.After;
import org.junit.Before;

public class CucumberHook extends BaseTest{
    @Before
    public void BeforeTest(){
        getDriver();
    }
    @After
    public void afterTest(){
        driver.close();
    }
}
