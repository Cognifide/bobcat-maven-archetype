package @packageName@.pageobjects;

import com.cognifide.qa.bb.constants.Timeouts;
import com.cognifide.qa.bb.wait.BobcatWait;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;

@PageObject
public class DefinitionPage {

  @Inject
  private BobcatWait bobcatWait;

  @FindBy(id = "firstHeading")
  private WebElement heading;

  public String getHeading() {
    bobcatWait.until(ExpectedConditions.visibilityOf(heading));
    return heading.getText();
  }
}
