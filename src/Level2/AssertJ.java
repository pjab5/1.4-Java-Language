package Level2;

import Level1.DNILetter;
import Level1.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.OptionPaneUI;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertJ {
    @Test
    void objectComparison() {
        DNILetter dni1 = new DNILetter("78945612P");
        DNILetter dni2 = new DNILetter("78945612P");
        DNILetter dni3 = new DNILetter("79845612p");
        Assertions.assertEquals(dni1,dni2);
        Assertions.assertNotEquals(dni1,dni3);
    }
    @Test
    void objectReferenceComparison() {
        DNILetter dni1 = new DNILetter("78945613P");
        DNILetter dni2 = dni1;
        DNILetter dni3 = new DNILetter("79845613p");
        DNILetter dni4 = dni3;
        Assertions.assertEquals(dni1,dni2);
        Assertions.assertNotEquals(dni1,dni3);
        dni2 = dni4;
        Assertions.assertNotEquals(dni1,dni2);
    }

    @Test
    void arrayComparison() {
        Assertions.assertArrayEquals(new int[]{2, 3, 5, 6, 11}, new int[]{2, 3, 5, 6, 11});
        Assertions.assertFalse(Arrays.equals(new int[] {2,3,5,6,11},new int[] {23,5,6,11}));
    }

    @Test
    void arrayListOrder() {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("hello");
        Library library = new Library();
        arrayList.add(library);
        DNILetter dniLetter = new DNILetter("12345679A");
        arrayList.add(dniLetter);
        Object object = new Object();
        arrayList.add(object);
        Assertions.assertEquals("hello",arrayList.get(0));
        Assertions.assertEquals(library,arrayList.get(1));
        Assertions.assertEquals(dniLetter,arrayList.get(2));
        Assertions.assertEquals(object,arrayList.get(3));
        Object[] order1 = new Object[]{"hello",library, dniLetter,object};
        Assertions.assertArrayEquals(arrayList.toArray(), order1);
        Object[] order2 = new Object[]{dniLetter,"hello",object,library};
        Assertions.assertTrue(arrayList.containsAll(List.of(order2))&&(List.of(order2).containsAll(arrayList)));
        Assertions.assertEquals(Collections.frequency(arrayList,dniLetter),1);
        arrayList.remove(dniLetter);
        Assertions.assertEquals(Collections.frequency(arrayList,dniLetter),0);
    }

    @Test
    void testContainsKey(){
        Map<String,DNILetter> map = new HashMap<>();
        DNILetter dniLetter = new DNILetter("69358247L");
        DNILetter dniLetter2 = new DNILetter("61538245M");
        map.put(dniLetter.getDNILetter(),dniLetter);
        map.put(dniLetter2.getDNILetter(),dniLetter2);
        Assertions.assertTrue(map.containsKey(dniLetter.getDNILetter()));
    }

    @Test
    void checkOutOfBounds(){
        Person person = new Person(new ArrayList<String>(Arrays.asList("farmer", "programmer", "model")));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {person.getJobs(3);});
    }

    @Test
    void checkEmptyOptional(){
        Optional<String> optional = Optional.empty();
        Assertions.assertTrue(optional.isEmpty());
    }

}
