import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Response responsive=get("https://reqres.in/api/users?page=2");		
int staticOf=responsive.statusCode();
responsive.prettyPrint();
System.out.println(staticOf);
Assert.assertEquals(staticOf, 200);
ResponseBody verifing=responsive.getBody();		
String convert=verifing.asString();
Assert.assertEquals(convert.contains("Funke"),true);

File it= new File("C:\\Users\\hp\\git\\assignment1\\Automationtraining\\j.json");
Response gt=given().contentType(ContentType.JSON).body(it).post("https://reqres.in/api/users");
gt.prettyPrint();		
	}

}
