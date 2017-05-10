package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryLocationPage extends BasePage {

    private AppiumDriver driver;

    @FindBy(id = "useManualSelectionBtnNewFlow")
    private WebElement enterLocation;

    @FindBy(id = "search_src_text")
    private WebElement deliveryLocation;

    @FindBy(xpath = "//android.widget.LinearLayout[@index=1]")
    private WebElement appropriateLocation;

    private String deliveryType;

    public DeliveryLocationPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void selectManualLocation() {
        try {
            waitForElementToBeClickable(enterLocation);
            enterLocation.click();
        } catch (Exception e) {

        }
    }

    public void enterDeliveryLocation(String location) {
        try {
            waitForElementToBeVisible(deliveryLocation);
            deliveryLocation.sendKeys(location);
        } catch (Exception e) {

        }
    }

    public void selectAppropriateLocation() {
        try {
            waitForElementToBeClickable(appropriateLocation);
            appropriateLocation.click();
        } catch (Exception e) {

        }
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
}
