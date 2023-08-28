package com.geogaming.web.stepdef;

import com.geogaming.web.pages.GeoGamingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GeoGamingStepDef {


    GeoGamingPage geoGaming = new GeoGamingPage();

    @Given("User navigate to Great Odds HomePage")
    public void userNavigateToGreatOddsHomePage() {

        geoGaming.openGreatOddsPage();

    }
    @Then("User accepts cookies")
    public void userAcceptsCookies() {
        geoGaming.acceptCookies();
    }
    @Then("Click on Login to navigate Login page")
    public void clickOnLoginToNavigateLoginPage() {

        geoGaming.clickOnLoginButtonOnHomePage();
    }
    @Then("Enter {string} {string} and click Login button")
    public void enterAndClickLoginButton(String uName, String passWord) {

        geoGaming.enterLoginCredentialAndLogin(uName,passWord);
    }

    @Then("Click on football tab")
    public void clickOnFootballTab() {
        geoGaming.clickOnFootBallTab();
    }
    @Then("get the Team name of first live match")
    public void getTheTeamNameOfFirstLiveMatch() {

        geoGaming.setFirstLiveMatchTeams();

        System.out.println("team1Name :"+geoGaming.getLabel_FirstLiveRowTeam1_text().trim());
        System.out.println("team2Name :"+geoGaming.getLabel_FirstLiveRowTeam2_text().trim());
    }
    @Then("place the bet for first team")
    public void placeTheBetForFirstTeam() {

        geoGaming.clickOnFirstLiveMatchTeam1BetAndSetValues();
        System.out.println("Betting price :"+ geoGaming.getLabel_FirstLiveRowTeam1Bet_text() );

    }
    @Then("verify the team name and betting price in Bet slip")
    public void verifyTheTeamNameAndBettingPriceInBetSlip() {

        geoGaming.getEventNameInBetSlip();
        geoGaming.getBetSlipTeam1Name();
        geoGaming.getBetSlipTeam1BetPrice();

        // Team verification
        Assert.assertEquals(geoGaming.getLabel_FirstLiveRowTeam1_text().trim(),geoGaming.getLabel_EventName_text().split("v")[0].trim());
        Assert.assertEquals(geoGaming.getLabel_FirstLiveRowTeam2_text().trim(),geoGaming.getLabel_EventName_text().split("v")[1].trim());

        // betting  verification

        Assert.assertEquals(geoGaming.getLabel_FirstLiveRowTeam1_text().trim(),geoGaming.getLabel_BetSlipTeamName1_text().trim());
     //   Assert.assertEquals(geoGaming.getLabel_FirstLiveRowTeam1Bet_text(),geoGaming.getLabel_BetSlipTeam1Price_text());
    }


}
