package pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    private Map<String, String> data;
    private WebDriver driver;
    private WebDriverWait wait;
    private int timeout = 15;

    @FindBy(css = "a[title='About us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(id = "other")
    @CacheLookup
    private WebElement additionalInformation;

    @FindBy(id = "address1")
    @CacheLookup
    private WebElement address;

    @FindBy(id = "address2")
    @CacheLookup
    private WebElement addressLine2;

    @FindBy(id = "alias")
    @CacheLookup
    private WebElement assignAnAddressAliasForFuture;

    @FindBy(css = "a[title='Best sellers']")
    @CacheLookup
    private WebElement bestSellers;

    @FindBy(css = "a[title='Blouses']")
    @CacheLookup
    private WebElement blouses1;

    @FindBy(css = "a[title='Match your favorites blouses with the right accessories for the perfect look.']")
    @CacheLookup
    private WebElement blouses2;

    @FindBy(css = "a[title='View my shopping cart']")
    @CacheLookup
    private WebElement cart0ProductProductsEmpty;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses3;

    @FindBy(id = "button_order_cart")
    @CacheLookup
    private WebElement checkOut;

    @FindBy(id = "city")
    @CacheLookup
    private WebElement city;

    @FindBy(id = "company")
    @CacheLookup
    private WebElement company;

    @FindBy(css = "a[title='Contact Us']")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "a[title='Contact us']")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(id = "id_country")
    @CacheLookup
    private WebElement country;

    @FindBy(id = "days")
    @CacheLookup
    private WebElement dateOfBirth1;

    @FindBy(id = "months")
    @CacheLookup
    private WebElement dateOfBirth2;

    @FindBy(id = "years")
    @CacheLookup
    private WebElement dateOfBirth3;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement dresses3;

    @FindBy(css = "a._blank")
    @CacheLookup
    private WebElement ecommerceSoftwareByPrestashop;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email1;

    @FindBy(id = "newsletter-input")
    @CacheLookup
    private WebElement email2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses2;

    @FindBy(css = "a[title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']")
    @CacheLookup
    private WebElement eveningDresses3;

    @FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(id = "customer_firstname")
    @CacheLookup
    private WebElement firstName1;

    @FindBy(id = "firstname")
    @CacheLookup
    private WebElement firstName2;

    @FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement homePhone;

    @FindBy(id = "dni")
    @CacheLookup
    private WebElement identificationNumber;

    @FindBy(id = "customer_lastname")
    @CacheLookup
    private WebElement lastName1;

    @FindBy(id = "lastname")
    @CacheLookup
    private WebElement lastName2;

    @FindBy(id = "phone_mobile")
    @CacheLookup
    private WebElement mobilePhone;

    @FindBy(name = "id_gender")
    @CacheLookup
    private List<WebElement> mr;

    private final String mrValue = "1";

    @FindBy(name = "id_gender")
    @CacheLookup
    private List<WebElement> mrs;

    private final String mrsValue = "2";

    @FindBy(css = "a[title='Manage my customer account']")
    @CacheLookup
    private WebElement myAccount;

    @FindBy(css = "a[title='My addresses']")
    @CacheLookup
    private WebElement myAddresses;

    @FindBy(css = "a[title='My credit slips']")
    @CacheLookup
    private WebElement myCreditSlips;

    @FindBy(css = "a[title='My orders']")
    @CacheLookup
    private WebElement myOrders;

    @FindBy(css = "a[title='Manage my personal information']")
    @CacheLookup
    private WebElement myPersonalInfo;

    @FindBy(css = "a[title='New products']")
    @CacheLookup
    private WebElement newProducts;

    @FindBy(name = "submitNewsletter")
    @CacheLookup
    private WebElement ok;

    @FindBy(css = "a[title='Our stores']")
    @CacheLookup
    private WebElement ourStores;

    private final String pageLoadedText = "You must register at least one phone number";

    private final String pageUrl = "/index.php?controller=authentication&back=my-account#account-creation";

    @FindBy(id = "passwd")
    @CacheLookup
    private WebElement password;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout;

    @FindBy(id = "search_query_top")
    @CacheLookup
    private WebElement productSuccessfullyAddedToYourShopping;

    @FindBy(id = "optin")
    @CacheLookup
    private WebElement receiveSpecialOffersFromOurPartners;

    @FindBy(id = "submitAccount")
    @CacheLookup
    private WebElement register;

    @FindBy(name = "submit_search")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a.login")
    @CacheLookup
    private WebElement signIn;

    @FindBy(id = "newsletter")
    @CacheLookup
    private WebElement signUpForOurNewsletter;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(css = "a[title='Specials']")
    @CacheLookup
    private WebElement specials;

    @FindBy(id = "id_state")
    @CacheLookup
    private WebElement state;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses2;

    @FindBy(css = "a[title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
    @CacheLookup
    private WebElement summerDresses3;

    @FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
    @CacheLookup
    private WebElement supportseleniumframeworkCom;

    @FindBy(css = "a[title='Terms and conditions of use']")
    @CacheLookup
    private WebElement termsAndConditionsOfUse;

    @FindBy(css = "a[title='Tops']")
    @CacheLookup
    private WebElement tops1;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tops2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(3) a")
    @CacheLookup
    private WebElement tshirts2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts3;

    @FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(css = "a[title='Women']")
    @CacheLookup
    private WebElement women1;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
    @CacheLookup
    private WebElement women2;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
    @CacheLookup
    private WebElement youtube;

    @FindBy(id = "postcode")
    @CacheLookup
    private WebElement zippostalCode;

    public RegistrationPage() {
    }

    public RegistrationPage(WebDriver driver) {
        this();
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public RegistrationPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public RegistrationPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Best Sellers Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickBestSellersLink() {
        bestSellers.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickBlouses1Link() {
        blouses1.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickBlouses2Link() {
        blouses2.click();
        return this;
    }

    /**
     * Click on Cart 0 Product Products Empty Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickCart0ProductProductsEmptyLink() {
        cart0ProductProductsEmpty.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickCasualDresses1Link() {
        casualDresses1.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickCasualDresses2Link() {
        casualDresses2.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickCasualDresses3Link() {
        casualDresses3.click();
        return this;
    }

    /**
     * Click on Check Out Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickCheckOutLink() {
        checkOut.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickContactUs1Link() {
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickContactUs2Link() {
        contactUs2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickDresses1Link() {
        dresses1.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickDresses2Link() {
        dresses2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickDresses3Link() {
        dresses3.click();
        return this;
    }

    /**
     * Click on Ecommerce Software By Prestashop Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickEcommerceSoftwareByPrestashopLink() {
        ecommerceSoftwareByPrestashop.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickEveningDresses1Link() {
        eveningDresses1.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickEveningDresses2Link() {
        eveningDresses2.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickEveningDresses3Link() {
        eveningDresses3.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on My Addresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickMyAddressesLink() {
        myAddresses.click();
        return this;
    }

    /**
     * Click on My Credit Slips Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickMyCreditSlipsLink() {
        myCreditSlips.click();
        return this;
    }

    /**
     * Click on My Orders Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickMyOrdersLink() {
        myOrders.click();
        return this;
    }

    /**
     * Click on My Personal Info Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickMyPersonalInfoLink() {
        myPersonalInfo.click();
        return this;
    }

    /**
     * Click on New Products Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickNewProductsLink() {
        newProducts.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickOurStoresLink() {
        ourStores.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickProceedToCheckoutLink() {
        proceedToCheckout.click();
        return this;
    }

    /**
     * Click on Register Button.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickRegisterButton() {
        register.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on Sign In Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickSignInLink() {
        signIn.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickSpecialsLink() {
        specials.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickSummerDresses1Link() {
        summerDresses1.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickSummerDresses2Link() {
        summerDresses2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickSummerDresses3Link() {
        summerDresses3.click();
        return this;
    }

    /**
     * Click on Supportseleniumframework.com Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickSupportseleniumframeworkComLink() {
        supportseleniumframeworkCom.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickTermsAndConditionsOfUseLink() {
        termsAndConditionsOfUse.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickTops1Link() {
        tops1.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickTops2Link() {
        tops2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickTshirts1Link() {
        tshirts1.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickTshirts2Link() {
        tshirts2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickTshirts3Link() {
        tshirts3.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickWomen1Link() {
        women1.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickWomen2Link() {
        women2.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage fill() {
        setProductSuccessfullyAddedToYourShoppingTextField();
        setMrRadioButtonField();
        setMrsRadioButtonField();
        setFirstName1TextField();
        setLastName1TextField();
        setEmail1TextField();
        setPasswordPasswordField();
        setDateOfBirth1DropDownListField();
        setDateOfBirth2DropDownListField();
        setDateOfBirth3DropDownListField();
        setSignUpForOurNewsletterCheckboxField();
        setReceiveSpecialOffersFromOurPartnersCheckboxField();
        setFirstName2TextField();
        setLastName2TextField();
        setCompanyTextField();
        setAddressTextField();
        setAddressLine2TextField();
        setCityTextField();
        setStateDropDownListField();
        setZippostalCodeTextField();
        setCountryDropDownListField();
        setAdditionalInformationTextareaField();
        setHomePhoneTextField();
        setMobilePhoneTextField();
        setAssignAnAddressAliasForFutureTextField();
        setIdentificationNumberTextField();
        setEmail2TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Additional Information Textarea field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setAdditionalInformationTextareaField() {
        return setAdditionalInformationTextareaField(data.get("ADDITIONAL_INFORMATION"));
    }

    /**
     * Set value to Additional Information Textarea field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setAdditionalInformationTextareaField(String additionalInformationValue) {
        additionalInformation.sendKeys(additionalInformationValue);
        return this;
    }

    /**
     * Set default value to Address Line 2 Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setAddressLine2TextField() {
        return setAddressLine2TextField(data.get("ADDRESS_LINE_2"));
    }

    /**
     * Set value to Address Line 2 Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setAddressLine2TextField(String addressLine2Value) {
        addressLine2.sendKeys(addressLine2Value);
        return this;
    }

    /**
     * Set default value to Address Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setAddressTextField() {
        return setAddressTextField(data.get("ADDRESS"));
    }

    /**
     * Set value to Address Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setAddressTextField(String addressValue) {
        address.sendKeys(addressValue);
        return this;
    }

    /**
     * Set default value to Assign An Address Alias For Future Reference. Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setAssignAnAddressAliasForFutureTextField() {
        return setAssignAnAddressAliasForFutureTextField(data.get("ASSIGN_AN_ADDRESS_ALIAS_FOR_FUTURE"));
    }

    /**
     * Set value to Assign An Address Alias For Future Reference. Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setAssignAnAddressAliasForFutureTextField(String assignAnAddressAliasForFutureValue) {
        assignAnAddressAliasForFuture.sendKeys(assignAnAddressAliasForFutureValue);
        return this;
    }

    /**
     * Set default value to City Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setCityTextField() {
        return setCityTextField(data.get("CITY"));
    }

    /**
     * Set value to City Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setCityTextField(String cityValue) {
        city.sendKeys(cityValue);
        return this;
    }

    /**
     * Set default value to Company Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setCompanyTextField() {
        return setCompanyTextField(data.get("COMPANY"));
    }

    /**
     * Set value to Company Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setCompanyTextField(String companyValue) {
        company.sendKeys(companyValue);
        return this;
    }

    /**
     * Set default value to Country Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setCountryDropDownListField() {
        return setCountryDropDownListField(data.get("COUNTRY"));
    }

    /**
     * Set value to Country Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setCountryDropDownListField(String countryValue) {
        new Select(country).selectByVisibleText(countryValue);
        return this;
    }

    /**
     * Set default value to Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setDateOfBirth1DropDownListField() {
        return setDateOfBirth1DropDownListField(data.get("DATE_OF_BIRTH_1"));
    }

    /**
     * Set value to Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setDateOfBirth1DropDownListField(String dateOfBirth1Value) {
        new Select(dateOfBirth1).selectByVisibleText(dateOfBirth1Value);
        return this;
    }

    /**
     * Set default value to Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setDateOfBirth2DropDownListField() {
        return setDateOfBirth2DropDownListField(data.get("DATE_OF_BIRTH_2"));
    }

    /**
     * Set value to Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setDateOfBirth2DropDownListField(String dateOfBirth2Value) {
        new Select(dateOfBirth2).selectByVisibleText(dateOfBirth2Value);
        return this;
    }

    /**
     * Set default value to Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setDateOfBirth3DropDownListField() {
        return setDateOfBirth3DropDownListField(data.get("DATE_OF_BIRTH_3"));
    }

    /**
     * Set value to Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setDateOfBirth3DropDownListField(String dateOfBirth3Value) {
        new Select(dateOfBirth3).selectByVisibleText(dateOfBirth3Value);
        return this;
    }

    /**
     * Set default value to Email Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setEmail1TextField() {
        return setEmail1TextField(data.get("EMAIL_1"));
    }

    /**
     * Set value to Email Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setEmail1TextField(String email1Value) {
        email1.sendKeys(email1Value);
        return this;
    }

    /**
     * Set default value to Email Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setEmail2TextField() {
        return setEmail2TextField(data.get("EMAIL_2"));
    }

    /**
     * Set value to Email Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setEmail2TextField(String email2Value) {
        email2.sendKeys(email2Value);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setFirstName1TextField() {
        return setFirstName1TextField(data.get("FIRST_NAME_1"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setFirstName1TextField(String firstName1Value) {
        firstName1.sendKeys(firstName1Value);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setFirstName2TextField() {
        return setFirstName2TextField(data.get("FIRST_NAME_2"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setFirstName2TextField(String firstName2Value) {
        firstName2.sendKeys(firstName2Value);
        return this;
    }

    /**
     * Set default value to Home Phone Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setHomePhoneTextField() {
        return setHomePhoneTextField(data.get("HOME_PHONE"));
    }

    /**
     * Set value to Home Phone Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setHomePhoneTextField(String homePhoneValue) {
        homePhone.sendKeys(homePhoneValue);
        return this;
    }

    /**
     * Set default value to Identification Number Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setIdentificationNumberTextField() {
        return setIdentificationNumberTextField(data.get("IDENTIFICATION_NUMBER"));
    }

    /**
     * Set value to Identification Number Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setIdentificationNumberTextField(String identificationNumberValue) {
        identificationNumber.sendKeys(identificationNumberValue);
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setLastName1TextField() {
        return setLastName1TextField(data.get("LAST_NAME_1"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setLastName1TextField(String lastName1Value) {
        lastName1.sendKeys(lastName1Value);
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setLastName2TextField() {
        return setLastName2TextField(data.get("LAST_NAME_2"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setLastName2TextField(String lastName2Value) {
        lastName2.sendKeys(lastName2Value);
        return this;
    }

    /**
     * Set default value to Mobile Phone Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setMobilePhoneTextField() {
        return setMobilePhoneTextField(data.get("MOBILE_PHONE"));
    }

    /**
     * Set value to Mobile Phone Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setMobilePhoneTextField(String mobilePhoneValue) {
        mobilePhone.sendKeys(mobilePhoneValue);
        return this;
    }

    /**
     * Set default value to Mr. Radio Button field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setMrRadioButtonField() {
        for (WebElement el : mr) {
            if (el.getAttribute("value").equals(mrValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Mrs. Radio Button field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setMrsRadioButtonField() {
        for (WebElement el : mrs) {
            if (el.getAttribute("value").equals(mrsValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setPasswordPasswordField() {
        return setPasswordPasswordField(data.get("PASSWORD"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set default value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setProductSuccessfullyAddedToYourShoppingTextField() {
        return setProductSuccessfullyAddedToYourShoppingTextField(data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
    }

    /**
     * Set value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setProductSuccessfullyAddedToYourShoppingTextField(String productSuccessfullyAddedToYourShoppingValue) {
        productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
        return this;
    }

    /**
     * Set Receive Special Offers From Our Partners Checkbox field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setReceiveSpecialOffersFromOurPartnersCheckboxField() {
        if (!receiveSpecialOffersFromOurPartners.isSelected()) {
            receiveSpecialOffersFromOurPartners.click();
        }
        return this;
    }

    /**
     * Set Sign Up For Our Newsletter Checkbox field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setSignUpForOurNewsletterCheckboxField() {
        if (!signUpForOurNewsletter.isSelected()) {
            signUpForOurNewsletter.click();
        }
        return this;
    }

    /**
     * Set default value to State Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setStateDropDownListField() {
        return setStateDropDownListField(data.get("STATE"));
    }

    /**
     * Set value to State Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setStateDropDownListField(String stateValue) {
        new Select(state).selectByVisibleText(stateValue);
        return this;
    }

    /**
     * Set default value to Zippostal Code Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setZippostalCodeTextField() {
        return setZippostalCodeTextField(data.get("ZIPPOSTAL_CODE"));
    }

    /**
     * Set value to Zippostal Code Text field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage setZippostalCodeTextField(String zippostalCodeValue) {
        zippostalCode.sendKeys(zippostalCodeValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage submit() {
        clickSearchButton();
        return this;
    }

    /**
     * Unset default value from Country Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetCountryDropDownListField() {
        return unsetCountryDropDownListField(data.get("COUNTRY"));
    }

    /**
     * Unset value from Country Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetCountryDropDownListField(String countryValue) {
        new Select(country).deselectByVisibleText(countryValue);
        return this;
    }

    /**
     * Unset default value from Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetDateOfBirth1DropDownListField() {
        return unsetDateOfBirth1DropDownListField(data.get("DATE_OF_BIRTH_1"));
    }

    /**
     * Unset value from Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetDateOfBirth1DropDownListField(String dateOfBirth1Value) {
        new Select(dateOfBirth1).deselectByVisibleText(dateOfBirth1Value);
        return this;
    }

    /**
     * Unset default value from Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetDateOfBirth2DropDownListField() {
        return unsetDateOfBirth2DropDownListField(data.get("DATE_OF_BIRTH_2"));
    }

    /**
     * Unset value from Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetDateOfBirth2DropDownListField(String dateOfBirth2Value) {
        new Select(dateOfBirth2).deselectByVisibleText(dateOfBirth2Value);
        return this;
    }

    /**
     * Unset default value from Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetDateOfBirth3DropDownListField() {
        return unsetDateOfBirth3DropDownListField(data.get("DATE_OF_BIRTH_3"));
    }

    /**
     * Unset value from Date Of Birth Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetDateOfBirth3DropDownListField(String dateOfBirth3Value) {
        new Select(dateOfBirth3).deselectByVisibleText(dateOfBirth3Value);
        return this;
    }

    /**
     * Unset Receive Special Offers From Our Partners Checkbox field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetReceiveSpecialOffersFromOurPartnersCheckboxField() {
        if (receiveSpecialOffersFromOurPartners.isSelected()) {
            receiveSpecialOffersFromOurPartners.click();
        }
        return this;
    }

    /**
     * Unset Sign Up For Our Newsletter Checkbox field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetSignUpForOurNewsletterCheckboxField() {
        if (signUpForOurNewsletter.isSelected()) {
            signUpForOurNewsletter.click();
        }
        return this;
    }

    /**
     * Unset default value from State Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetStateDropDownListField() {
        return unsetStateDropDownListField(data.get("STATE"));
    }

    /**
     * Unset value from State Drop Down List field.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage unsetStateDropDownListField(String stateValue) {
        new Select(state).deselectByVisibleText(stateValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the RegistrationPage class instance.
     */
    public RegistrationPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
