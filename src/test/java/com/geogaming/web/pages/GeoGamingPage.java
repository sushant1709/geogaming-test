package com.geogaming.web.pages;

import com.geogaming.utils.PropertyManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class GeoGamingPage extends BasePage {

    @FindBy(xpath = "//div[@class='ccb__button']//button")
    WebElement button_AcceptCookies;

    @FindBy(xpath = "//*[@data-test-locator='LOGIN']")
    WebElement button_LoginHomePage;

    @FindBy(xpath = "//input[@name='username']")
    WebElement input_username;

    @FindBy(xpath = "//input[@name='password']")
    WebElement input_password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement button_LOGIN;

    @FindBy(xpath = "//ul[contains(@class,'spb-scrollable-tabs')]/li[1]/div[1]")
    WebElement tab_football;

    @FindBy(xpath = "(//div[contains(@class,'spb-score__live ')]/../ancestor::div[contains(@class,'spb-util-display')])[3]//section[1]/span[1]")
    WebElement label_FirstLiveRowTeam1;

    @FindBy(xpath = "(//div[contains(@class,'spb-score__live ')]/../ancestor::div[contains(@class,'spb-util-display')])[3]//section[2]/span[1]")
    WebElement label_FirstLiveRowTeam2;

    @FindBy(xpath = "(//div[contains(@class,'spb-score__live ')]/../ancestor::div[contains(@class,'spb-util-display')])[3]/div/div[1]")
    WebElement label_FirstLiveRowTeam1Bet;

    @FindBy(xpath = "(//div[contains(@class,'spb-score__live ')]/../ancestor::div[contains(@class,'spb-util-display')])[3]/div/div[3]")
    WebElement label_FirstLiveRowTeam2Bet;

    @FindBy(xpath = "//spb-betslip-selections-singles-bet/div[contains(@class,'event-name')]")
    WebElement label_EventName;

    @FindBy(xpath = "//spb-betslip-selections-singles-bet/div[contains(@class,'selection-bet')]//span")
    WebElement label_BetSlipTeamName1;

    @FindBy(xpath = "//spb-betslip-selections-singles-bet/div[contains(@class,'selection-bet')]/div/div[2]")
    WebElement label_BetSlipTeam1Price;


    private static String label_FirstLiveRowTeam1_text;
    private static String label_FirstLiveRowTeam2_text;
    private static double label_FirstLiveRowTeam1Bet_text;
    private static String label_FirstLiveRowTeam2Bet_text;
    private static String label_EventName_text;
    private static String label_BetSlipTeamName1_text;
    private static double label_BetSlipTeam1Price_text;

    public  String getLabel_EventName_text() {
        return label_EventName_text;
    }

    public  void setLabel_EventName_text(String label_EventName_text) {
        GeoGamingPage.label_EventName_text = label_EventName_text;
    }

    public  String getLabel_BetSlipTeamName1_text() {
        return label_BetSlipTeamName1_text;
    }

    public  void setLabel_BetSlipTeamName1_text(String label_BetSlipTeamName1_text) {
        GeoGamingPage.label_BetSlipTeamName1_text = label_BetSlipTeamName1_text;
    }

    public  double getLabel_BetSlipTeam1Price_text() {
        return label_BetSlipTeam1Price_text;
    }

    public  void setLabel_BetSlipTeam1Price_text(double label_BetSlipTeam1Price_text) {
        GeoGamingPage.label_BetSlipTeam1Price_text = label_BetSlipTeam1Price_text;
    }


    public String getLabel_FirstLiveRowTeam1_text() {
        return label_FirstLiveRowTeam1_text;
    }

    public void setLabel_FirstLiveRowTeam1_text(String label_FirstLiveRowTeam1_text) {
        GeoGamingPage.label_FirstLiveRowTeam1_text = label_FirstLiveRowTeam1_text;
    }

    public String getLabel_FirstLiveRowTeam2_text() {
        return label_FirstLiveRowTeam2_text;
    }

    public void setLabel_FirstLiveRowTeam2_text(String label_FirstLiveRowTeam2_text) {
        GeoGamingPage.label_FirstLiveRowTeam2_text = label_FirstLiveRowTeam2_text;
    }

    public double getLabel_FirstLiveRowTeam1Bet_text() {
        return label_FirstLiveRowTeam1Bet_text;
    }

    public void setLabel_FirstLiveRowTeam1Bet_text(double label_FirstLiveRowTeam1Bet_text) {
        GeoGamingPage.label_FirstLiveRowTeam1Bet_text = label_FirstLiveRowTeam1Bet_text;
    }

    public String getLabel_FirstLiveRowTeam2Bet_text() {
        return label_FirstLiveRowTeam2Bet_text;
    }

    public void setLabel_FirstLiveRowTeam2Bet_text(String label_FirstLiveRowTeam2Bet_text) {
        GeoGamingPage.label_FirstLiveRowTeam2Bet_text = label_FirstLiveRowTeam2Bet_text;
    }


    Properties prop = new PropertyManager().getProps();


    public void openGreatOddsPage() {
        driver.get(prop.getProperty("appURL"));

    }

    public void acceptCookies() {
        click(button_AcceptCookies);
    }

    public void clickOnLoginButtonOnHomePage() {

        click(button_LoginHomePage);
    }

    public void enterLoginCredentialAndLogin(String uName, String password) {

        clear(input_username);
        sendKeys(input_username, uName);
        sendKeys(input_password, password);
        click(button_LOGIN);

    }

    public void clickOnFootBallTab() {
        Sleep(10);
        click(tab_football);
    }

    public void setFirstLiveMatchTeams() {

        setLabel_FirstLiveRowTeam1_text(getText(label_FirstLiveRowTeam1));
        setLabel_FirstLiveRowTeam2_text(getText(label_FirstLiveRowTeam2));

    }

    public void clickOnFirstLiveMatchTeam1BetAndSetValues() {
        setLabel_FirstLiveRowTeam1Bet_text(Double.parseDouble(getText(label_FirstLiveRowTeam1Bet)));
        click(label_FirstLiveRowTeam1Bet);

    }


    public void getEventNameInBetSlip(){

        String eventName = getText(label_EventName);
        setLabel_EventName_text(eventName);

    }

    public void getBetSlipTeam1Name(){

        setLabel_BetSlipTeamName1_text(getText(label_BetSlipTeamName1));

    }

    public void getBetSlipTeam1BetPrice(){

        setLabel_BetSlipTeam1Price_text(Double.parseDouble(getText(label_BetSlipTeam1Price)));

    }



}
