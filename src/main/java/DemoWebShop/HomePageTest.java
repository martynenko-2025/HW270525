package DemoWebShop;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void isPresentLogoWeb(){
        Assert.assertTrue(isPresentLogoWebOk());
    }
}
