package getland.pages.US05_Pages;

import getland.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US05_UsersPage {
    public US05_UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath ="//div[@class='side-menu-nav central nav']/a[5]" )
        public WebElement UsersPageNavigate;

        @FindBy(xpath ="//table[@class='p-datatable-table']" )
        public WebElement UsersDetailTable;

        @FindBy(xpath ="//button[@class='btn-link btn btn-primary'][2]" )
        public WebElement PenButton;

        @FindBy(xpath ="//*[@id='root']/div[1]/div[2]/div[2]/div[1]/form/div[2]/button[3]" )
        public WebElement UpdateButton;

        @FindBy(xpath = "//input[@class='form-control']" )
        public WebElement SearchField;

        @FindBy(xpath = "//button[@class='search-button btn btn-outline-secondary']" )
        public WebElement SearchSendField;

        @FindBy(xpath = "//div[@class='p-toast-detail']")
        public WebElement MessageBox;

        @FindBy(xpath = "//select[@name='role']")
        public WebElement RolesDropdownMenu;


        @FindBy(xpath = "//select[@name='role']/option[1]")
        public WebElement AdminRole;

        @FindBy(xpath = "//select[@name='role']/option[2]")
        public WebElement ManagerRole;

        @FindBy(xpath = "//select[@name='role']/option[3]")
        public WebElement CustomerRole;

        @FindBy(xpath = "//button[@data-pc-section='pagebutton'][3]")
        public WebElement PageMiddleButton;

        @FindBy(xpath ="//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/table/tbody/tr[10]/td[5]/div/div/button[2]" )
        public WebElement PenButtonBottom;

        @FindBy(xpath ="//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/table/tbody/tr[10]/td[5]/div/div/button[1]" )
        public WebElement TrashCanButtonBottom;

        @FindBy(xpath ="//button[@aria-label='Yes']" )
        public WebElement YesButton4Delete;

        @FindBy(xpath ="//button[@class='btn-link btn btn-primary'][1]" )
        public WebElement TrashCanButtonUp;











}
