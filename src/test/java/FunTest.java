import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Selenide.open;


public class FunTest {
    @BeforeEach
    public void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterEach
    public void afterAll() {
        System.out.println("AfterAll");
    }

    @Test
    public void main() { open("https://demoqa.com/automation-practice-form");
    }



    @Test
    public void Test1() {
        System.out.println("1");
        assertEquals("10","10");
    }
    @Test
    public void Test2() {
        System.out.println("2");
        assertEquals("10", "11");
    }
}
