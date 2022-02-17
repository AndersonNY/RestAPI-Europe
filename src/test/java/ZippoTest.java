import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

import static io.restassured.RestAssured.*;
        import static org.hamcrest.Matchers.*;

public class ZippoTest {


    @Test

    public void test() {

        given() // baglangic ayarlari

                .when() // aksiyon
                .then(); // test kismi

    }

    @Test
    public void statusCodeTest() {
        given()
                .when()
                .get("http://api.zippopotam.us/us/90210")
                .then()
                .log().body() // sadece body kismini goruntuledik
                 .contentType(ContentType.JSON);
    }

    @Test
    public void logTest()

    {
        given()
                .log() .all()
                .when()
                .get("http://api.zippopotam.us/us/90210")
                .then()
                .log() .body();

    }
        @Test
        public void bodyJsonPathTest() {
            given()

                    .when()
                    .get("http://api.zippopotam.us/us/90210")

                    .then()
                    .log().body()
                    .body("country", equalTo("United States"))
                    .statusCode(200)
            ;
        } 
        }

//        driver.findElemen(By.id());
//        WebElement submitButton= driver.findElement(By.id("id"))
//        String text = submitButton.getText(); // gorunen textini verir.
//
//     Elemana click yapmak icin ise;
//
//     submitButton.click();



    // Given two strings, merge them -> so that "abc" and "def" becomes "adbecf" for example"

//String a []= {"a", "b", "c"} ;
//String b[] = {"d", "e", "f"};
//    public String merge(String a, String b) {
//        int lenA = a.length();
//        int lenB = b.length();
//        String merged = "";
//        int max = lenA > lenB ? lenA : lenB;
//        for (int i = 0; i < max; i++) {
//            if (i < lenA) {
//                merged += a.charAt(i);
//            }
//
//            if (i < lenB) {
//                merged += b.charAt(i);
//            }
//        }
//
//        return merged;
//    } }
//
