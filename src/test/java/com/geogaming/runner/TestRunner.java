package com.geogaming.runner;
import com.geogaming.utils.DriverManager;
import com.geogaming.utils.GlobalParams;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty"
                , "html:target/cucumber/report.html"
                , "summary"
                , "de.monochromata.cucumber.report.PrettyReports:target/cucumber-html-reports"
        }
        , features = {"src/test/resources"}
        , glue = {"com.geogaming.web"}
        , snippets = CAMELCASE
        , dryRun = false
        , monochrome = true
        , strict = true
        , tags = "@test"


)


public class TestRunner {

    public static GlobalParams params;

    @BeforeClass
    public static void initialize() throws Exception {

        params = new GlobalParams();
        params.initializeGlobalParams();
        new DriverManager().initializeDriver();
    }


    @AfterClass
    public static void quit() {
        DriverManager driverManager = new DriverManager();
        if (driverManager.getDriver() != null) {
         //   driverManager.getDriver().quit();
         //   driverManager.setDriver(null);
        }
    }

}
