package getland.pages.US09_Pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US09_AdvertsPage {

    public US09_AdvertsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//div[@class='side-menu-nav central nav']/a[2]" )
    public WebElement AdvertsPageNavigate;

    @FindBy(xpath ="//div[@class='form-text-input-class']/input[@placeholder='Search']" )
    public WebElement AdvertsSearchField;

    @FindBy(xpath ="//button[@type='submit']" )
    public WebElement AdvertsSearchButton;

    @FindBy(xpath ="//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/table/tbody" )
    public WebElement AdvertTable;

    @FindBy(xpath ="/html/body/div/div[2]/div/div[1]/div/div[1]/div" )
    public WebElement AdvertMessageBox;

    @FindBy(xpath ="//button[@class='btn-link btn btn-primary'][2]" )
    public WebElement AdvertPenButton;

    @FindBy(xpath = "//select[@id='statusForAdvert']/option[3]")
    public WebElement ActivatedDropdownButton;

    @FindBy(xpath = "//select[@id='statusForAdvert']/option[4]")
    public WebElement RejectedDropdownButton;

    @FindBy(xpath ="//button[@type='submit']" )
    public WebElement AdvertUpdateButton;








}
