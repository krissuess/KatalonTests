package qa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteGroup extends TestBase{

  @Test
  public void deleteGroup() throws Exception {
      gotoGroupPage();
      selectGroup();
      deleteSelectedGroups();
      returntoGroupPage();
  }



}
