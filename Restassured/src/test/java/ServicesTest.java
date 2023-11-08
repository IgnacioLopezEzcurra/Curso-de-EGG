
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ServicesTest {

    @Test
    public void getExample(){

        Response response;
        response = given().get("https://swapi.dev/api/people/2/");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

}
