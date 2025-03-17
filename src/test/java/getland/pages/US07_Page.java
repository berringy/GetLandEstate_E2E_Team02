package getland.pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US07_Page {




    public US07_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='offcanvas-menu']//div[contains(@class, 'auth-links')]/a[1]")
    public WebElement loginRegisterButton;
    @FindBy(xpath = "(//input[@name='email'])")
    public WebElement emailTextBox;
    @FindBy(xpath = "(//input[@name='password'])")
    public WebElement passwordTextBox;
    @FindBy(xpath = "(//button[@type='submit'])")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div/div[3]/a[1]/span")
    public WebElement backToSiteButton;
    @FindBy(xpath = "(//a[@href='/ad'])" )
    public WebElement createPropertyButton;
    @FindBy(xpath = "(//input[@id='title'])" )
    public WebElement titleTextBox;
    @FindBy(xpath = "(//textarea[@id='desc'])" )
    public WebElement descriptionTextBox;
    @FindBy(xpath = "(//input[@id='price'])" )
    public WebElement priceTextBox;
    @FindBy(xpath = "(//select[@id='advertTypeId']/option[2])" )
    public WebElement advertTypeSelect;
    @FindBy(xpath = "(//select[@name='advertTypeId'])" )
    public WebElement advertTypeDropdown;
    @FindBy(xpath = "(//select[@id='categoryId'])" )
    public WebElement categoryDropdown;
    @FindBy(xpath = "(//select[@id='countryId'])" )
    public WebElement countryDropdown;
    @FindBy(xpath = "(//select[@id='cityId'])" )
    public WebElement cityDropdown;
    @FindBy(xpath = "(//select[@id='districtId'])" )
    public WebElement districtDropdown;
    @FindBy(xpath = "(//input[@id='address'])" )
    public WebElement addressTextBox;
    @FindBy(xpath = "(//input[@id='Size'])" )
    public WebElement sizeTextBox;
    @FindBy(xpath = "(//input[@id='Bedrooms'])" )
    public WebElement bedroomTextBox;
    @FindBy(xpath = "(//input[@id='Bathrooms'])" )
    public WebElement bathroomTextBox;
    @FindBy(xpath = "(//select[@id='Garage'])" )
    public WebElement garageDropdown;
    @FindBy(xpath = "(//input[@id='Year of Build'])" )
    public WebElement yearOfBuildTextBox;
    @FindBy(xpath = "(//select[@id='Furniture'])" )
    public WebElement furnitureDropdown;
    @FindBy(xpath = "(//input[@id='Maintenance Fee'])" )
    public WebElement maintenanceTextBox;
    @FindBy(xpath = "(//select[@id='Terrace'])" )
    public WebElement terraceDropdown;
    @FindBy(xpath = "(//select[@id='Flat'])" )
    public WebElement flatDropdown;
    @FindBy(xpath = "(//select[@id='GARDEN'])" )
    public WebElement gardenDropdown;
    @FindBy(xpath = "(//select[@id='FLOWER GARDEN'])" )
    public WebElement flowerGardenDropdown;
    @FindBy(xpath = "(//select[@id='Central AC'])" )
    public WebElement centralAcDropdown;
    @FindBy(xpath = "(//select[@id='Central heating'])" )
    public WebElement centralHeatingDropdown;
    @FindBy(xpath = "(//select[@id='Flatt'])" )
    public WebElement flattDropdown;
    @FindBy(xpath = "(//select[@id='Flattisa'])" )
    public WebElement flattisaDropdown;
    @FindBy(xpath = "(//select[@id='Flat5'])" )
    public WebElement flatt5Dropdown;
    @FindBy(xpath = "(//select[@id='Flat6'])" )
    public WebElement flatt6Dropdown;
    @FindBy(xpath = "(//select[@id='Flat7'])" )
    public WebElement flatt7Dropdown;
    @FindBy(xpath = "(//p[@class='upload-area-inner-text'])" )
    public WebElement imageClick;
    @FindBy(xpath = "(//button[@type='submit'])" )
    public WebElement createButton;
    @FindBy(xpath = "//*[@id='root']/div[1]/div/form/div[3]/div[1]/div/div/div" )
    public WebElement alertTitle;
    @FindBy(xpath = "//a[@class='dropdown-item' and @href='/ad']" )
    public WebElement logOutButton;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div[3]/div[2]/div/div/div" )
    public WebElement alertDescription;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div[3]/div[3]/div[1]/div/div" )
    public WebElement alertPrice;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div[1]" )
    public WebElement alertAdvertType;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/form/div[5]/div[2]/div/div/div" )
    public WebElement alertAdrress;
    @FindBy(xpath = "//span[contains(text(), 'newAdvertPageTranslations.requiredCountry') or contains(@class, 'enter a country')]")
    public WebElement alertCountry;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div') or contains(@class, 'enter a size')]")
    public WebElement alertSize;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div') or contains(@class, 'enter a bedrooms')]")
    public WebElement alertBedroom;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div') or contains(@class, 'enter a bathrooms')]")
    public WebElement alertBathroom;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div') or contains(@class, 'enter a Year Of Build')]")
    public WebElement alertYearOfBuild;
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div') or contains(@class, 'enter a Maintenance Fee')]")
    public WebElement alertMaintenanceFee;
    @FindBy(xpath = "(//img[@alt='advertImageTranslations.imgAlt 1'])" )
    public WebElement truePicture;
    @FindBy(xpath = "(//div[@class='image-feedback'])" )
    public WebElement alertPictureSize;
    @FindBy(xpath = "(//*[@id=\"root\"]/div[1]/div/div[3]/div/div/div/div[1]/table/tbody/tr[1]/td[1]/div/div[2]/div/div[2]/p[1])" )
    public WebElement advertCheck;








}
