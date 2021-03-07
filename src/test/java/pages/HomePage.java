package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;

public class HomePage extends BasePage{

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement catalog;

    @FindBy(xpath="//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    public WebElement priceList;

    @FindBy(xpath="//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]")
    public WebElement store;

    @FindBy(xpath="//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]")
    public WebElement customers;

    @FindBy(xpath="//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]")
    public WebElement warehouse;

    @FindBy(xpath="//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]")
    public WebElement reporting;

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        // TODO Auto-generated method stub
        return ExpectedConditions.visibilityOf(catalog);
    }
/*
    public CustomersPage goToCustomers() {
        click(customers,"Customers Link");
        return (CustomersPage) openPage(CustomersPage.class);
    }

    public CatalogPage goToCatalog() {
        click(catalog,"Catalog Link");
        return (CatalogPage) openPage(CatalogPage.class);
    }

    public PriceListPage goToPriceList() {
        click(priceList,"Price List Link");
        return (PriceListPage) openPage(PriceListPage.class);
    }

    public ReportingPage goToReporting() {
        click(reporting,"Reporting Link");
        return (ReportingPage) openPage(ReportingPage.class);
    }

    public StorePage goToStore() {
        click(store,"Store Link");
        return (StorePage) openPage(StorePage.class);
    }

    public WarehousePage goToWarehouse() {
        click(warehouse,"Warehouse Link");
        return (WarehousePage) openPage(WarehousePage.class);
    }
*/
}
