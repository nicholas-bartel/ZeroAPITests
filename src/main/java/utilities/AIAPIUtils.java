package utilities;

import ie.curiositysoftware.testmodeller.TestModellerModule;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import static io.restassured.RestAssured.given;

// http://acceptinc.cloud.testinsights.io/app/#!/module-collection/guid/1609b48f-cf10-4a11-847f-63986aeed3af
@TestModellerModule(guid = "1609b48f-cf10-4a11-847f-63986aeed3af")
public class AIAPIUtils extends BasePage
{
    String authKey = "Fake key";

	public AIAPIUtils (WebDriver driver)
	{
		super(driver);
	}

	public Response Post(String url, String jsonBody){

        if (jsonBody == null) System.out.println();
        Response body =
                given()
                        .log().all()
                        .header("accept", "application/json; charset=utf-8")
                        .header("authorization", authKey)
                        .header("cache-control", "no-cache")
                        .contentType("application/json")
                        .body(jsonBody)
                .when()
                        .post(url);
        body.then()
                .log()
                .body()
                .statusCode(200);
        return body;
    }
}