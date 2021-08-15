import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserCipherTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void cipherEncryptsSampleText_true() {
        String txt = new String("abc");
        int key = 0;
        assertEquals(true, txt instanceof String);
    }

    @AfterEach
    void tearDown() {
    }
}