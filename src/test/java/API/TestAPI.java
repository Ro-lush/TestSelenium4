package API;

import API.Pets.Category;
import Base.BaseCore;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.form;
import static io.restassured.RestAssured.given;


public class TestAPI extends BaseCore {
    @Test
    public void setPetsCategory(){
        List<Category> petsCategory = given()
                .when().contentType(ContentType.JSON)
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .then().extract().body().jsonPath().getList("category", Category.class);

        for (int i = 0; i < petsCategory.size(); i++) {
            System.out.println(petsCategory.get(i).getName().toString());
        }
    }

}
