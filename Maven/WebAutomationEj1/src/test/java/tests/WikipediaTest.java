package tests;

import org.junit.jupiter.api.Test;
import org.testng.annotations.Parameters;
import pages.HomePage;
import pages.ResultPage;
import utils.baseTest.BaseTest;

import static org.testng.Assert.assertTrue;

public class WikipediaTest extends BaseTest {

    @Test
    @Parameters({"textToSearch"})
    public void searchText(String textToSearch){
        HomePage home = loadFirstPage();
        ResultPage results = home.searchText(textToSearch);

        assertTrue(results.isTitleCorrect(textToSearch), "The title does not match");

    }

}
