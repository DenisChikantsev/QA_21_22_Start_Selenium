import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver wd;
    @BeforeClass
    public void preCondition() {
//        open browser
        wd = new ChromeDriver();
//        open site
        wd.get("https://telranedu.web.app/home");
    }
    @Test
    public void loginSuccess() {
//        open form
        wd.navigate().to("https://telranedu.web.app/login");
//        fill email (find Element + click + clear + type)
//        fill password (find Element + click + clear + type)
//        submit form (find Element + click)
    }

    @Test
    public void loginWrongEmail() {
//        open form
//        fill form
//        submit form
    }

    @Test
    public void wrongPassword() {
//        open form
//        fill form
//        submit form
    }

    @AfterTest
    public void postConditions() {
//        close browser
        wd.close();
    }
}
