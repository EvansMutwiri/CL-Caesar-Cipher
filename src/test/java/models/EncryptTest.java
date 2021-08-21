package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    public void runEncrypt_instantiate(){
        Encrypt test = new Encrypt("abc", 2);
        assertTrue(test instanceof Encrypt);
    }

    @Test
    void getText() {
        Encrypt test = new Encrypt("abc", 2);
        String testText = test.getText();
        assertEquals("abc", testText);
    }

    @Test
    void setText() {
        Encrypt test = new Encrypt("abc", 2);
        test.setText("cbd");
        String testText = test.getText();
        assertEquals("cbd", testText);
    }

    @Test
    void getShift() {
        Encrypt test = new Encrypt("abc", 2);
        int testShift = test.getShift();
        assertEquals(2, testShift);
    }

    @Test
    void setsShift() {
        Encrypt test = new Encrypt("abc", 2);
        test.setShift(3);
        int testShift = test.getShift();
        assertEquals(3, testShift);
    }

    @Test
    void encryptMessage() {
        Encrypt test = new Encrypt("abc", 2);
    }
}