import static org.junit.jupiter.api.Assertions.assertEquals;

import com.dojo.SocialMedia.Main;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello, Maven!", Main.sayHello(), "sayHello should return 'Hello, Maven!'");
    }
}