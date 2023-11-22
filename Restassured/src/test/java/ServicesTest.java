
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class ServicesTest {

    private String url = "https://swapi.dev/api/";
    private String endpoint = "people/2/";

    private Response response;

  /*  @Test
    public void getExample(){

        Response response;
        response = given().get("https://swapi.dev/api/people/2/");
        Assert.assertEquals(response.getStatusCode(), 200);
        response.prettyPrint();
    }

    @Test
    public void testEndpointPeople2() {
        RestAssured.when().get("https://swapi.dev/api/people/2").then().
                assertThat().statusCode(200);

    }

    @Test
    public void testExample() {
        // Configure RestAssured
        RestAssured.baseURI = "https://swapi.dev/api";

        // Make the request
        Response response = RestAssured.get("/people/2");

        // Print the response body to the console
        System.out.println(response.getBody());
        response.prettyPrint();
    }

    @Test
    public void testMovie() {
        // Configure RestAssured
        RestAssured.baseURI = "https://swapi.dev/api";

        // Make the request
        Response response = RestAssured.get("films/2/");

        // Print the response body to the console
        System.out.println(response.getBody());
        response.prettyPrint();
    } */

    //////////////////

    @Test
    public void succesResponse(){


        response = given().get(url+endpoint);
        Assert.assertEquals(response.getStatusCode(), 200);
        response.prettyPrint();
    }

    @Test
    public void skinColor(){


        response = given().get(url+endpoint);
        JsonPath jsonSave = response.jsonPath();
        Assert.assertEquals(jsonSave.get("skin_color"), "gold");
    }

    @Test
    public void amountFilms(){
        response = given().get(url+endpoint);
        JsonPath jsonSave = response.jsonPath();
        Assert.assertEquals(jsonSave.getList("films").size(), 6);
    }


}
