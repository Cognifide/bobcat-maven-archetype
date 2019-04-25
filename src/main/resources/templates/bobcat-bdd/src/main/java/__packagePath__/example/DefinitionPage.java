package @packageName@.example;

import java.util.Collections;
import com.cognifide.qa.bb.constants.Timeouts;
import com.cognifide.qa.bb.wait.BobcatWait;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.StaleElementReferenceException;

import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;

@PageObject
public class DefinitionPage {

  @Inject
  private BobcatWait bobcatWait;

  @FindBy(id = "firstHeading")
  private WebElement heading;

  public String getHeading() {
    bobcatWait
        .ignoring(Collections.singletonList(StaleElementReferenceException.class))
        .until(ExpectedConditions.visibilityOf(heading));
    return heading.getText();
  }
}
