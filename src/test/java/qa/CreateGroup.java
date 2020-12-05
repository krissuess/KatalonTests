package qa;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class CreateGroup extends TestBase {

    @Test
    public void testGroupcreation() throws Exception {
        wd.findElement(By.linkText("groups")).click();
        wd.findElement(By.name("new")).click();
      fillForm(new GroupData("groupname", "1", "2"));
      wd.findElement(By.name("submit")).click();
        wd.findElement(By.linkText("group page")).click();

    }

}

