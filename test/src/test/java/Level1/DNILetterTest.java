package Level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNILetterTest {

    @Test
    void getDNILetter() {
        Assertions.assertEquals("F",new DNILetter("12345678F").getDNILetter());
        assertNull(new DNILetter("444561788").getDNILetter());
        Assertions.assertNotEquals("M",new DNILetter("46345678F").getDNILetter());
        Assertions.assertEquals("L",new DNILetter("33358977L").getDNILetter());
        assertNull(new DNILetter("12345678F46546").getDNILetter());
        Assertions.assertNotEquals("P",new DNILetter("42869312T").getDNILetter());
        assertNull(new DNILetter("344569128f").getDNILetter());
        Assertions.assertEquals("T",new DNILetter("42968324T").getDNILetter());
        Assertions.assertNotEquals("F",new DNILetter("36128594L").getDNILetter());
        assertNull(new DNILetter("111111111").getDNILetter());
    }
}