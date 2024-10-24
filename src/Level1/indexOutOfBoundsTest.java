package Level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class indexOutOfBoundsTest {

    @Test
    void indexCheck() {
        indexOutOfBounds index = new indexOutOfBounds();
        assertThrows(ArrayIndexOutOfBoundsException.class, index::indexCheck);
    }
}